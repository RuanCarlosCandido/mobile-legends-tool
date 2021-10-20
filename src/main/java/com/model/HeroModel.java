package com.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.Bean.Equipment;
import com.Bean.Hero;
import com.Bean.HeroesName;
import com.Bean.Spell;
import static com.Bean.HeroesName.*;

public class HeroModel {

	public void init() {
		List<Hero> pickedHeroes                     = new ArrayList<Hero>();
		List<Spell> allSpellCounterinOneList        = new ArrayList<Spell>();
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

						 if	(Validator.isTank(heroName))
						tankCountersMap    = addCounterInMap(tankCountersMap, heroName, heroPicked);
					else if (Validator.isSupport(heroName))
						supportCountersMap = addCounterInMap(supportCountersMap, heroName, heroPicked);
					else if (Validator.isSoldier(heroName))
						soldierCountersMap = addCounterInMap(soldierCountersMap, heroName, heroPicked);
					else if (Validator.isMage(heroName))
						mageCountersMap    = addCounterInMap(mageCountersMap, heroName, heroPicked);
					else
						damageCountersMap  = addCounterInMap(damageCountersMap, heroName, heroPicked);

					tankCountersMap    = adjustWithPick(tankCountersMap, pickedHeroes);
					supportCountersMap = adjustWithPick(supportCountersMap, pickedHeroes);
					soldierCountersMap = adjustWithPick(soldierCountersMap, pickedHeroes);
					mageCountersMap    = adjustWithPick(mageCountersMap, pickedHeroes);
					damageCountersMap  = adjustWithPick(damageCountersMap, pickedHeroes);
				}

				allSpellCounterinOneList.add(hero.getCounterSpell());

				printTopScored(damageCountersMap, tankCountersMap, supportCountersMap, soldierCountersMap,
						mageCountersMap);
				
				i++;

			} else {
				System.err.println("\n[ATENCAO]	DIGITOU O NOME ERRADO ANIMAL DO CARALHO!!! Digita essa merda direito agora\n");
			}
		}

		printSpell(allSpellCounterinOneList);
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

	private void printSpell(List<Spell> list) {

		Set<Spell> set      = new LinkedHashSet<Spell>();
		int ammountCounters = list.size();

		for (int i = 0; i < ammountCounters - 1; i++) {

			for (int j = i + 1; j < ammountCounters; j++) {

				if (list.get(i).equals(list.get(j))) {
					set.add(list.get(i));

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

	private List<HeroesName> rankTheCounters(Map<HeroesName, Integer> allCountersMap) {

		List<HeroesName> list = new ArrayList<HeroesName>();

		int higher = verifyTheHigherNumberInMap(allCountersMap);

		for (HeroesName key : allCountersMap.keySet()) {
			if (allCountersMap.get(key) == higher)
				list.add(key);
		}

		return list;
	}

	private int verifyTheHigherNumberInMap(Map<HeroesName, Integer> allCountersMap) {
		int higher = 0;

		for (HeroesName key : allCountersMap.keySet()) {
			if (allCountersMap.get(key) > higher)
				higher = allCountersMap.get(key);
		}

		return higher;
	}

	private Hero configHero(HeroesName name) {
		Spell counterSpell = SpellCounter.of(name);
		ArrayList<HeroesName> counters = Counter.of(name);
		ArrayList<Equipment> counterEquipment = getCounterEquipments(name);

		Hero hero = new Hero();
		hero.setName(name);
		hero.setCounterSpell(counterSpell);
		hero.setCounters(counters);
		hero.setCounterEquipments(counterEquipment);

		return hero;
	}

	private ArrayList<Equipment> getCounterEquipments(HeroesName name) {

		return null;
	}

}