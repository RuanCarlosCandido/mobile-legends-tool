package org.services;

import static org.models.Behaviour.ARMOR_BREAKER;
import static org.models.Behaviour.CONTROL_IMMUNITY;
import static org.models.Behaviour.CROWD_CONTROL;
import static org.models.Behaviour.ENDURANCE;
import static org.models.Behaviour.HIGH_MOBILITY;
import static org.models.Behaviour.INVULNERABILITY;
import static org.models.Behaviour.LONG_RANGE;
import static org.models.Behaviour.REAL_DAMAGE;
import static org.models.Behaviour.REAP;
import static org.models.Behaviour.REFLECTION;
import static org.models.Behaviour.REGENERATION;
import static org.models.Behaviour.REGENERATION_REDUCTION;
import static org.models.Behaviour.SHIELD;
import static org.models.Behaviour.SHIELD_STEALING;
import static org.models.Hero.getHeroesNameMap;
import static org.models.Role.getRolesMap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.models.Behaviour;
import org.models.Hero;
import org.models.Role;

public class HeroService {

	Map<Role, List<Hero>> result = getRolesMap();
	List<Hero> pickedHeroes = new ArrayList<Hero>();

	public Map<Role, List<Hero>> getCounterHeroes(String heroPicked) {

		Hero hero = getHeroesNameMap().get(heroPicked.toUpperCase());

		pickedHeroes.add(hero);

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

			if (canCounter && !iterationHero.getRole().equals(hero.getRole()))
				result.get(iterationHero.getRole()).add(iterationHero);
		}
	}

	/**
	 * Build the hero weaknesses from his strengths, i.e, weakness is opposite from
	 * strength
	 * 
	 * @param hero
	 * @return
	 */
	private List<Behaviour> buildWeaknesses(Hero hero) {
		List<Behaviour> weaknesses = new ArrayList<Behaviour>();

		for (Behaviour strenght : hero.getStrengths()) {

			if (strenght.equals(REGENERATION)) {
				weaknesses.add(REGENERATION_REDUCTION);
				weaknesses.add(ENDURANCE);
			}

			if (strenght.equals(REGENERATION_REDUCTION)) {
				weaknesses.add(LONG_RANGE);
				weaknesses.add(REAL_DAMAGE);
			}

			if (strenght.equals(CROWD_CONTROL)) {
				weaknesses.add(CONTROL_IMMUNITY);
				weaknesses.add(INVULNERABILITY);
				weaknesses.add(ENDURANCE);
			}

			if (strenght.equals(REAL_DAMAGE))
				weaknesses.add(ENDURANCE);

			if (strenght.equals(SHIELD_STEALING)) {
				weaknesses.add(REGENERATION_REDUCTION);
				weaknesses.add(REAL_DAMAGE);
				weaknesses.add(LONG_RANGE);
				weaknesses.add(ARMOR_BREAKER);
			}

			if (strenght.equals(LONG_RANGE)) {
				weaknesses.add(HIGH_MOBILITY);
				weaknesses.add(ENDURANCE);
			}

			if (strenght.equals(REFLECTION)) {
				weaknesses.add(CROWD_CONTROL);
				weaknesses.add(LONG_RANGE);
			}

			if (strenght.equals(SHIELD)) {
				weaknesses.add(SHIELD_STEALING);
				weaknesses.add(REGENERATION_REDUCTION);
				weaknesses.add(REAL_DAMAGE);
				weaknesses.add(ARMOR_BREAKER);
			}

			if (strenght.equals(HIGH_MOBILITY)) {
				weaknesses.add(LONG_RANGE);
			}

			if (strenght.equals(CONTROL_IMMUNITY)) {
				weaknesses.add(HIGH_MOBILITY);
				weaknesses.add(LONG_RANGE);
			}
			if (strenght.equals(HIGH_MOBILITY)) {
				weaknesses.add(REFLECTION);
				weaknesses.add(ENDURANCE);

			}
			if (strenght.equals(INVULNERABILITY)) {
				weaknesses.add(HIGH_MOBILITY);
			}

			if (strenght.equals(ARMOR_BREAKER)) {
				weaknesses.add(CROWD_CONTROL);
				weaknesses.add(INVULNERABILITY);
				weaknesses.add(REFLECTION);
			}

			if (strenght.equals(REAP)) {
				weaknesses.add(REFLECTION);
				weaknesses.add(HIGH_MOBILITY);
				weaknesses.add(LONG_RANGE);
			}

			if (strenght.equals(ENDURANCE))
				weaknesses.add(REAP);

		}

		hero.getWeaknesses().addAll(weaknesses);
		return weaknesses;
	}

	public void clearResult() {
		result.values().forEach(list -> list.clear());
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
		List<Behaviour> weaknesses = buildWeaknesses(firstHero);

		List<Behaviour> secondHeroWeaknesses = buildWeaknesses(secondHero);

		boolean canCounter = false;
		for (Behaviour strength : strengths) {

			if (secondHeroWeaknesses.contains(strength))
				canCounter = true;
		}
		if (canCounter) {
			for (Behaviour weakness : weaknesses)
				if (secondHero.getStrengths().contains(weakness))
					canCounter = false;
		}
		return canCounter;

	}

}