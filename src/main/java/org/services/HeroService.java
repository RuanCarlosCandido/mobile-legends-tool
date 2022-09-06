package org.services;

import static org.models.Hero.getHeroesNameMap;
import static org.models.Role.getRolesMap;
import static org.facade.BehaviourFacade.buildWeaknesses;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.apache.log4j.LogManager;
import org.models.Behaviour;
import org.models.Hero;
import org.models.Role;

public class HeroService {

	private final org.apache.log4j.Logger LOGGER = LogManager.getLogger(this.getClass());

	Map<Role, List<Hero>> result = getRolesMap();
	List<Hero> pickedHeroes = new ArrayList<Hero>();

	public Map<Role, List<Hero>> getCounterHeroes() {

		Hero hero = pickedHeroes.get(pickedHeroes.size() - 1);

		getCounterHeroes(hero);

		rank();

		adjust(hero);

		return result;
	}

	/**
	 * Ajust the counters result by eliminating: 1 - a hero picked by the enemy team
	 * 2 - a hero that can be countered by a hero picked by the enemy team
	 * 
	 * @param hero
	 */
	private void adjust(Hero hero) {
		pickedHeroes.forEach(pickedHero -> result.values()
				.forEach(list -> list.removeIf(insideHeroList -> canCounter(hero, insideHeroList)
						|| canCounter(pickedHero, insideHeroList) || insideHeroList.equals(hero))));

	}

	/**
	 * Adjust the counter list by leaving only the heroes that appears most of time
	 * 
	 * @param result
	 */
	private void rank() {

		for (Entry<Role, List<Hero>> entry : result.entrySet()) {

			Map<Hero, Long> gruopByHeroCount = entry.getValue().stream()
					.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

			if (!gruopByHeroCount.isEmpty()) {
				long maxValue = gruopByHeroCount.values().stream().max(Comparator.comparing(t -> t)).get();

				result.put(entry.getKey(), gruopByHeroCount.keySet().stream()
						.filter(key -> gruopByHeroCount.get(key).equals(maxValue)).collect(Collectors.toList()));
			}
		}
	}

	/**
	 * @param weaknesses
	 * @param strengths
	 * @param allHeroes
	 * @param result
	 * @param canCounter
	 */
	private void getCounterHeroes(Hero hero) {

		Map<String, Hero> allHeroes = getHeroesNameMap();

		for (Entry<String, Hero> entry : allHeroes.entrySet()) {

			Hero iterationHero = entry.getValue();

			boolean canCounter = canCounter(iterationHero, hero);

			if (canCounter 
//					&& !iterationHero.getRole().equals(hero.getRole()) // doesn't add counters from the same role of the picked hero
					&& !pickedHeroes.contains(iterationHero))
				result.get(iterationHero.getRole()).add(iterationHero);
		}
	}

	public void clearResult() {
		result.values().forEach(list -> list.clear());
	}

	public void clearPickedHeroes() {
		pickedHeroes.clear();
	}

	/**
	 * Compare strengths and weaknesses of two heroes and determinates if the first
	 * hero passed as parameter can counter the second one
	 * 
	 * @param firstHero  the one to counter
	 * @param secondHero the one to be countered
	 * @return
	 */
	private boolean canCounter(Hero firstHero, Hero secondHero) {
		List<Behaviour> strengths = firstHero.getStrengths();
		List<Behaviour> weaknesses = buildWeaknesses(firstHero.getStrengths());
		firstHero.getWeaknesses().addAll(weaknesses);
		
		List<Behaviour> secondHeroWeaknesses = buildWeaknesses(secondHero.getStrengths());
		secondHero.getWeaknesses().addAll(secondHeroWeaknesses);

		boolean canCounter = false;

		canCounter = strengths.stream().anyMatch(strength -> secondHeroWeaknesses.contains(strength));

		if (canCounter) {

			for (Behaviour weakness : weaknesses)
				if (secondHero.getStrengths().contains(weakness))
					canCounter = false;
		}
		return canCounter;

	}

	public List<Hero> getPickedHeroes() {
		return pickedHeroes;
	}

	public void addPickedHero(String pickedHero) {
		Hero hero = getHeroesNameMap().get(pickedHero.toUpperCase());

		LOGGER.info("Heroi selecionado: " + hero);

		pickedHeroes.add(hero);
	}

}