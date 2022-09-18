package org.services;

import static org.facade.BehaviourFacade.buildWeaknesses;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.models.Behaviour;
import org.models.Equipment;
import org.models.EquipmentType;
import org.models.Hero;

public class EquipmentService {

	List<Hero> pickedHeroes = new ArrayList<Hero>();
	Map<EquipmentType, List<Equipment>> result = EquipmentType.getTypes();

	public Map<EquipmentType, List<Equipment>> getCounterEquipments() {
		for (Hero hero : pickedHeroes) {
			getCounterEquipment(hero);
		}
		rank();
		return result;
	}

	private void getCounterEquipment(Hero hero) {

		Map<EquipmentType, List<Equipment>> allHeroes = Equipment.getEquipmentsByType();

		for (Entry<EquipmentType, List<Equipment>> entry : allHeroes.entrySet()) {
			boolean canCounter = false;

			List<Equipment> equips = entry.getValue();
			for (Equipment equip : equips) {
				canCounter = canCounter(equip, hero);
				if (canCounter)
					result.get(equip.getEquipmentType()).add(equip);
			}

		}
	}

	private boolean canCounter(Equipment equip, Hero hero) {
		List<Behaviour> equipStrengths = equip.getStrengths();
		Set<Behaviour> equipWeaknesses = buildWeaknesses(equip.getStrengths());

		Set<Behaviour> heroWeaknesses = buildWeaknesses(hero.getStrengths());
		hero.getWeaknesses().addAll(heroWeaknesses);

		boolean canCounter = false;

		canCounter = equipStrengths.stream().anyMatch(strength -> heroWeaknesses.contains(strength));

		if (canCounter) {

			for (Behaviour weakness : equipWeaknesses)
				if (hero.getStrengths().contains(weakness))
					canCounter = false;
		}
		return canCounter;

	}

	public void setPickedHeroes(List<Hero> pickedHeroes) {
		this.pickedHeroes = pickedHeroes;
	}

	private void rank() {

		for (Entry<EquipmentType, List<Equipment>> entry : result.entrySet()) {

			Map<Equipment, Long> groupByEquipmentCount = entry.getValue().stream()
					.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

			if (!groupByEquipmentCount.isEmpty()) {
				long maxValue = groupByEquipmentCount.values().stream().max(Comparator.comparing(t -> t)).get();

				result.put(entry.getKey(), groupByEquipmentCount.keySet().stream()
						.filter(key -> groupByEquipmentCount.get(key).equals(maxValue)).collect(Collectors.toList()));
			}
		}
	}

}
