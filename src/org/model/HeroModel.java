package org.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.bean.Equipment;
import org.bean.Hero;
import org.bean.HeroesName;
import org.bean.Spell;
import static org.bean.HeroesName.*;

public class HeroModel {

	public void init() {
		List<Hero> pickedHeroes                     = new ArrayList<Hero>();
		List<Spell> spells					        = new ArrayList<Spell>();
		Map<HeroesName, Integer> damageCountersMap  = new HashMap<HeroesName, Integer>();
		Map<HeroesName, Integer> tankCountersMap    = new HashMap<HeroesName, Integer>();
		Map<HeroesName, Integer> supportCountersMap = new HashMap<HeroesName, Integer>();
		Map<HeroesName, Integer> soldierCountersMap = new HashMap<HeroesName, Integer>();
		Map<HeroesName, Integer> mageCountersMap    = new HashMap<HeroesName, Integer>();
		
		Scanner in = new Scanner(System.in);
		int i      = 0;

		printWelcomeMesage();
		
		while (i < 5) {

			System.out.println("Entre com o Nome do " + (i + 1) + "º Hero : ");
			String heroPicked = in.next().toUpperCase();

			if (getHeroesNameMap().containsKey(heroPicked)) {

				Hero hero 				  = configHero(getHeroesNameMap().get(heroPicked));
				List<HeroesName> counters = hero.getCounters();
				int countersAmmount       = counters.size();
				
				pickedHeroes.add(hero);
		
				for (int j = 0; j < countersAmmount; j++) {

					HeroesName heroName = counters.get(j);

						 if	(heroName.isTank())
						tankCountersMap    = addCounterInMap(tankCountersMap, heroName, heroPicked);
					else if (heroName.isSupport())
						supportCountersMap = addCounterInMap(supportCountersMap, heroName, heroPicked);
					else if (heroName.isSoldier())
						soldierCountersMap = addCounterInMap(soldierCountersMap, heroName, heroPicked);
					else if (heroName.isMage())
						mageCountersMap    = addCounterInMap(mageCountersMap, heroName, heroPicked);
					else
						damageCountersMap  = addCounterInMap(damageCountersMap, heroName, heroPicked);

					tankCountersMap    = adjustWithPick(tankCountersMap, pickedHeroes);
					supportCountersMap = adjustWithPick(supportCountersMap, pickedHeroes);
					soldierCountersMap = adjustWithPick(soldierCountersMap, pickedHeroes);
					mageCountersMap    = adjustWithPick(mageCountersMap, pickedHeroes);
					damageCountersMap  = adjustWithPick(damageCountersMap, pickedHeroes);
				}
				spells.add(hero.getCounterSpell());

				printTopScored(damageCountersMap, tankCountersMap, supportCountersMap, soldierCountersMap,
						mageCountersMap);
				
				i++;

			} else {
				System.err.println("\n[ATENCAO]	DIGITOU O NOME ERRADO ANIMAL DO CARALHO!!! Digita essa merda direito agora\n");
			}
		}

		printSpell(spells);
		in.close();
	}

	private void printWelcomeMesage() {

		System.out.println("******************************************************************************");
		System.out.println("***************************** MOBILE LEGENDS TOOL ****************************");
		System.out.println("******************************************************************************");
		System.out.println();
	}

	/**
	 * Add to the relative map the counters from the selected adversary hero. Each time that the same counter appears it gains 1 point.
	 */
	private Map<HeroesName, Integer> addCounterInMap(Map<HeroesName, Integer> map, HeroesName heroName, String heroPicked) {

		if (map.containsKey(heroName)) {
			int c = map.get(heroName);
			map.put(heroName, ++c);	
			} 
		else
			map.put(heroName, 1);

		return map;
	}

	/**
	 * Adjust the map that score the counters eliminating from the rank a counter who is countered by one picked enemy hero.
	 * 
	 * <p> Ex: if Aldous have 3 points (suggesting you to pick him) and the enemy pick Angela then Aldous is removed from 
	 * 	the top scored (Integer.MIN_Value).
	 */
	private Map<HeroesName, Integer> adjustWithPick(Map<HeroesName, Integer> countersMap, List<Hero> pickedHeroes) {

		int pickedHeroesAmmount = pickedHeroes.size();

		// first analyses the counters contained in this map, one by one
		for (HeroesName key : countersMap.keySet()) {

			Hero heroInTheMap = configHero(key);
			List<HeroesName> countersFromThisHero = heroInTheMap.getCounters();
			int countersAmmount = countersFromThisHero.size();

			// Then analyses all counters from each hero in the map
			for (int i = 0; i < countersAmmount; i++) {
				
				for (int j = 0; j < pickedHeroesAmmount; j++) {
					if (countersFromThisHero.get(i) == pickedHeroes.get(j).getName()) {
						countersMap.put(key, Integer.MIN_VALUE);
					}
				}
			}
		}
		return countersMap;
	}

	private void printSpell(List<Spell> spells) {

		Set<Spell> set      = new LinkedHashSet<Spell>();
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
	private void printTopScored(Map<HeroesName, Integer> damageCountersMap, Map<HeroesName, Integer> tankCountersMap,
			Map<HeroesName, Integer> supportCountersMap, Map<HeroesName, Integer> soldierCountersMap,
			Map<HeroesName, Integer> mageCountersMap) {

		List<HeroesName> topRankedDamage  = rankTheCounters(damageCountersMap);
		List<HeroesName> topRankedTank    = rankTheCounters(tankCountersMap);
		List<HeroesName> topRankedSupport = rankTheCounters(supportCountersMap);
		List<HeroesName> topRankedSoldier = rankTheCounters(soldierCountersMap);
		List<HeroesName> topRankedMage    = rankTheCounters(mageCountersMap);

		System.out.println("\nTANK		" + topRankedTank);
		System.out.println("SUPPORT		" + topRankedSupport);
		System.out.println("SOLDIER		" + topRankedSoldier);
		System.out.println("MAGE		" + topRankedMage);
		System.out.println("DAMAGE		" + topRankedDamage + "\n");
		
	}

	private List<HeroesName> rankTheCounters(Map<HeroesName, Integer> scorePerHero) {

		List<HeroesName> rankedHeroes = new ArrayList<HeroesName>();

		int score = getHighestScore(scorePerHero);

		for (HeroesName heroName : scorePerHero.keySet()) {
			if (scorePerHero.get(heroName) == score)
				rankedHeroes.add(heroName);
		}
		return rankedHeroes;
	}

	private int getHighestScore(Map<HeroesName, Integer> scorePerHero) {
		int max = 0;

		for (HeroesName heroName : scorePerHero.keySet()) {
			int score = scorePerHero.get(heroName);
			
			if (score > max)
				max = score;
		}
		return max;
	}

	private Hero configHero(HeroesName name) {
		Spell counterSpell = SpellCounter.of(name);
		ArrayList<HeroesName> counters = Counter.of(name);
		ArrayList<Equipment> counterEquipments = getCounterEquipments(name);

		Hero hero = new Hero();
		hero.setName(name);
		hero.setCounterSpell(counterSpell);
		hero.setCounters(counters);
		hero.setCounterEquipments(counterEquipments);

		return hero;
	}

	//TODO after
	private ArrayList<Equipment> getCounterEquipments(HeroesName name) {

		return null;
	}

}