package org.services;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.apache.log4j.LogManager;
import org.models.BehaviourResponse;
import org.models.HeroesResponse;
import org.proxy.BehavioursDataProxy;
import org.proxy.HeroesDataProxy;

public class HeroService {

	private final org.apache.log4j.Logger LOGGER = LogManager.getLogger(this.getClass());

	Map<String, List<String>> countersMapResult = new HashMap<>();
	List<String> pickedHeroes = new ArrayList<String>();

	private Map<String, HeroesResponse> heroes;
	private Map<String, BehaviourResponse> behaviours;

	/**
	 * Retrieves the counter heroes for the last hero picked in the pickedHeroes list.
	 * The heroes will be sorted and ranked based on the counter effectiveness, and then adjusted to include the picked hero.
	 *
	 * @return a map with keys as Role and values as the counter heroes of that role.
	 */
	public Map<String, List<String>> getCounterHeroes() {

		String hero = pickedHeroes.get(pickedHeroes.size() - 1);

		getCounterHeroes(hero);

		rank();

		adjust(hero);

		return countersMapResult;
	}

	/**

	 Adjust the counter heroes list by removing heroes that either can counter the picked hero, or has been picked by the player.
	 Also remove the picked hero from the counter heroes list.
	 @param lastHeroSelectedName - the picked hero for which the counter heroes list is being adjusted
	 */
	private void adjust(String lastHeroSelectedName) {
		countersMapResult.values().forEach(countersListForRole -> countersListForRole.removeIf(
				heroAlreadyInCountersList -> pickedHeroes.stream()
						.anyMatch(previousPickedHero -> canCounter(getHeroes().get(lastHeroSelectedName).getBehaviours(), getHeroes().get(heroAlreadyInCountersList).getBehaviours())
								|| canCounter(getHeroes().get(previousPickedHero).getBehaviours(), getHeroes().get(heroAlreadyInCountersList).getBehaviours())
								|| heroAlreadyInCountersList.equals(lastHeroSelectedName))));
	}

	/**
	 *
	 Ranks the counter heroes by their effectiveness against the picked hero.
	 The method groups the heroes by their role and selects the most effective heroes.
	 It modifies the countersMapResult map which contains all the counter heroes
	 */
	private void rank() {

		countersMapResult.replaceAll((role, heroes) -> heroes.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream()
				.filter(entry -> Objects.equals(entry.getValue(), heroes.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).values().stream().max(Comparator.comparing(t -> t)).orElseGet(() -> -1L)))
				.map(Entry::getKey)
				.collect(Collectors.toList()));
	}

	/**
	 * Retrieves all heroes that can counter the provided hero and adds them to the result Map.
	 * The counter heroes will be added to the result Map, under the role key,
	 * if they don't belong to the same role of the provided hero and if they haven't been picked yet.
	 *
	 * @param heroName the hero for which the counter heroes will be retrieved
	 */
	private void getCounterHeroes(String heroName) {

		for (Entry<String, HeroesResponse> entry : getHeroes().entrySet()) {
			String iterationHero = entry.getKey();
			boolean canCounter = canCounter(entry.getValue().getBehaviours(), getHeroes().get(heroName).getBehaviours());

			if (canCounter
//					&& !iterationHero.getRole().equals(hero.getRole()) // doesn't add counters from the same role of the picked hero
					&& !pickedHeroes.contains(entry.getKey()))
				countersMapResult.computeIfAbsent(getHeroes().get(iterationHero).getRole(), k -> new ArrayList<>()).add(iterationHero);
		}
	}

	public void clearResult() {
		countersMapResult.values().forEach(List::clear);
	}

	public void clearPickedHeroes() {
		pickedHeroes.clear();
	}

	/**
	 * Determines if a counterHero can counter another hero
	 *
	 * @param counterHeroBehaviours List of behaviours of the counterHero
	 * @param heroBehaviours List of behaviours of the hero
	 * @return true if the counterHero can counter the hero, false otherwise.
	 */
	private boolean canCounter(List<String> counterHeroBehaviours, List<String> heroBehaviours) {

		Set<String> counterHeroWeaknesses = buildWeaknesses(counterHeroBehaviours);
		Set<String> counterHeroStrengths = buildStrengths(counterHeroBehaviours);

		Set<String> heroWeaknesses = buildWeaknesses(heroBehaviours);
		Set<String> heroStrengths = buildStrengths(heroBehaviours);

		boolean canCounter = false;

		canCounter = counterHeroStrengths.stream().anyMatch(heroWeaknesses::contains);

		if (canCounter) {

			for (String counterHeroWeakness : counterHeroWeaknesses)
				if (heroStrengths.contains(counterHeroWeakness)) {
					canCounter = false;
					break;
				}
		}

		return canCounter;

	}

	/**

	 Builds a set of heroes that the given hero behaviours are strong against.
	 @param heroBehaviours - a list of hero behaviours that should be checked for strength
	 @return a set of heroes that the given behaviours are strong against
	 */
	public Set<String> buildStrengths(List<String> heroBehaviours) {
	    // create a new set to store the behaviours
        Set<String> strengths = new HashSet<>();
        // iterate over the input list and add the behaviours to the set
        heroBehaviours.forEach(behaviour -> {
            strengths.add(behaviour);
            // also add the strong against behaviours 
            strengths.addAll(getBehaviours().get(behaviour).getStrongAgainst());
        });
        // return the set
        return strengths;
	}

	public Set<String> buildWeaknesses(List<String> heroBehaviours) {
		return heroBehaviours.stream()
				.map(behaviour -> getBehaviours().get(behaviour).getWeakAgainst())
				.flatMap(List::stream)
				.collect(Collectors.toSet());
	}

	public List<String> getPickedHeroes() {
		return pickedHeroes;
	}

	public void addPickedHero(String pickedHero) {
		LOGGER.info("Heroi selecionado: " + pickedHero);

		pickedHeroes.add(pickedHero);
	}

	// Corrigir a lógica pois este método não deveria fazer os calculos, deveria somente exibir
	public void printCounters() {
		getCounterHeroes().entrySet().forEach(System.out::println);
	}

	public Map<String, HeroesResponse> getHeroes() {
		if (this.heroes == null)
			this.heroes = new HeroesDataProxy().getData();
		return heroes;
	}

	public Map<String, BehaviourResponse> getBehaviours() {
		if (this.behaviours == null)
			this.behaviours = new BehavioursDataProxy().getData();
		return behaviours;
	}


}