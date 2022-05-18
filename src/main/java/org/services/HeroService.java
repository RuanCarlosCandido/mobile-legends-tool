package org.services;

import static org.models.Behaviour.CHARGE;
import static org.models.Behaviour.CONTROL_IMMUNITY;
import static org.models.Behaviour.CROWD_CONTROL;
import static org.models.Behaviour.ESCAPE;
import static org.models.Behaviour.HIGH_HP;
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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.models.Behaviour;
import org.models.Equipment;
import org.models.Hero;
import org.models.Role;
import org.models.Spell;

public class HeroService {

	public Map<Role, List<Hero>> getCounterHeroes(String heroPicked) {

		Hero hero = getHeroesNameMap().get(heroPicked.toUpperCase());

		Map<Role, List<Hero>> result = getRolesMap();

		getCounterHeroes(hero, result);


//		for (int j = 0; j < countersAmmount; j++) {
//
//			Hero heroName = counters.get(j);
//
//			tankCountersMap = adjustWithPick(tankCountersMap, pickedHeroes);
//			supportCountersMap = adjustWithPick(supportCountersMap, pickedHeroes);
//			soldierCountersMap = adjustWithPick(soldierCountersMap, pickedHeroes);
//			mageCountersMap = adjustWithPick(mageCountersMap, pickedHeroes);
//			damageCountersMap = adjustWithPick(damageCountersMap, pickedHeroes);
//		}
//		spells.add(hero.getCounterSpell());
//
//		printTopScored(damageCountersMap, tankCountersMap, supportCountersMap, soldierCountersMap, mageCountersMap);
//
//		printSpell(spells);
		return result;
	}

	/**
	 * @param weaknesses
	 * @param strengths
	 * @param allHeroes
	 * @param result
	 * @param canCounter
	 */
	private void getCounterHeroes(Hero hero, Map<Role, List<Hero>> result) {

		List<Behaviour> strengths = hero.getStrengths();
		List<Behaviour> weaknesses = buildWeaknesses(hero);

		boolean canCounter = true;

		Map<String, Hero> allHeroes = getHeroesNameMap();

		for (Entry<String, Hero> entry : allHeroes.entrySet()) {
			canCounter = true;

			Hero iterationHero = entry.getValue();
			for (Behaviour strength : strengths) {

				
				if (buildWeaknesses(iterationHero).contains(strength))
					canCounter = false;
			}
			if (canCounter) {
				canCounter = false;
				for (Behaviour weakness : weaknesses)
					if (iterationHero.getStrengths().contains(weakness))
						canCounter = true;

			}
			if (canCounter)
				result.get(iterationHero.getRole()).add(iterationHero);
		}
	}

	private List<Behaviour> buildWeaknesses(Hero hero) {
		List<Behaviour> weaknesses = new ArrayList<Behaviour>();

		for (Behaviour strenght : hero.getStrengths()) {
			if (strenght.equals(REGENERATION))
				weaknesses.add(REGENERATION_REDUCTION);
			
			if (strenght.equals(REGENERATION_REDUCTION)) {
				weaknesses.add(REFLECTION);
				weaknesses.add(REAP);			
			}

			if (strenght.equals(CROWD_CONTROL))
				weaknesses.add(CONTROL_IMMUNITY);

			if (strenght.equals(REAL_DAMAGE))
				weaknesses.add(HIGH_HP);

			if (strenght.equals(SHIELD_STEALING))
				weaknesses.add(REGENERATION_REDUCTION);

			if (strenght.equals(LONG_RANGE))
				weaknesses.add(CHARGE);

			if (strenght.equals(REFLECTION))
				weaknesses.add(LONG_RANGE);

			if (strenght.equals(HIGH_HP))
				weaknesses.add(REAP);

			if (strenght.equals(SHIELD)) {
				weaknesses.add(SHIELD_STEALING);
				weaknesses.add(REGENERATION_REDUCTION);
			}

			if (strenght.equals(ESCAPE)) {
				weaknesses.add(CHARGE);
				weaknesses.add(LONG_RANGE);
			}

			if (strenght.equals(CONTROL_IMMUNITY)) {
				weaknesses.add(CHARGE);
				weaknesses.add(LONG_RANGE);
			}
			if (strenght.equals(CHARGE)) {
				weaknesses.add(REFLECTION);
				weaknesses.add(HIGH_HP);

			}
			if (strenght.equals(INVULNERABILITY)) {
				weaknesses.add(ESCAPE);
				weaknesses.add(LONG_RANGE);
				weaknesses.add(HIGH_HP);
			}
		}

		return weaknesses;
	}

	/**
	 * Adjust the map that score the counters eliminating from the rank a counter
	 * who is countered by one picked enemy hero.
	 * 
	 * <p>
	 * Ex: if Aldous have 3 points (suggesting you to pick him) and the enemy pick
	 * Angela then Aldous is removed from the top scored (Integer.MIN_Value).
	 */
//	private Map<Hero, Integer> adjustWithPick(Map<Hero, Integer> countersMap, List<Hero> pickedHeroes) {
//
//		int pickedHeroesAmmount = pickedHeroes.size();
//
//		// first analyses the counters contained in this map, one by one
//		for (Hero key : countersMap.keySet()) {
//
//			Hero heroInTheMap = buildHero(key);
//			List<Hero> countersFromThisHero = heroInTheMap.getCounters();
//			int countersAmmount = countersFromThisHero.size();
//
//			// Then analyses all counters from each hero in the map
//			for (int i = 0; i < countersAmmount; i++) {
//
//				for (int j = 0; j < pickedHeroesAmmount; j++) {
//					if (countersFromThisHero.get(i) == pickedHeroes.get(j).getName()) {
//						countersMap.put(key, Integer.MIN_VALUE);
//					}
//				}
//			}
//		}
//		return countersMap;
//	}

	private void printSpell(List<Spell> spells) {

		Set<Spell> set = new LinkedHashSet<Spell>();
		int ammountCounters = spells.size();

		for (int i = 0; i < ammountCounters - 1; i++) {

			for (int j = i + 1; j < ammountCounters; j++) {

				if (spells.get(i).equals(spells.get(j))) {
					set.add(spells.get(i));

				}
			}
		}
		System.out.println("SPELL " + set);

	}

	/**
	 * Print the top scored counter heroes classified by classes
	 */
	private void printTopScored(Map<Hero, Integer> damageCountersMap, Map<Hero, Integer> tankCountersMap,
			Map<Hero, Integer> supportCountersMap, Map<Hero, Integer> soldierCountersMap,
			Map<Hero, Integer> mageCountersMap) {

		List<Hero> topRankedDamage = rankTheCounters(damageCountersMap);
		List<Hero> topRankedTank = rankTheCounters(tankCountersMap);
		List<Hero> topRankedSupport = rankTheCounters(supportCountersMap);
		List<Hero> topRankedSoldier = rankTheCounters(soldierCountersMap);
		List<Hero> topRankedMage = rankTheCounters(mageCountersMap);

		System.out.println("\nTANK		" + topRankedTank);
		System.out.println("SUPPORT		" + topRankedSupport);
		System.out.println("SOLDIER		" + topRankedSoldier);
		System.out.println("MAGE		" + topRankedMage);
		System.out.println("DAMAGE		" + topRankedDamage + "\n");

	}

	private List<Hero> rankTheCounters(Map<Hero, Integer> scorePerHero) {

		List<Hero> rankedHeroes = new ArrayList<Hero>();

		int score = getHighestScore(scorePerHero);

		for (Hero heroName : scorePerHero.keySet()) {
			if (scorePerHero.get(heroName) == score)
				rankedHeroes.add(heroName);
		}
		return rankedHeroes;
	}

	private int getHighestScore(Map<Hero, Integer> scorePerHero) {
		int max = 0;

		for (Hero heroName : scorePerHero.keySet()) {
			int score = scorePerHero.get(heroName);

			if (score > max)
				max = score;
		}
		return max;
	}

	// TODO after
	private ArrayList<Equipment> getCounterEquipments(Hero name) {

		return null;
	}

}