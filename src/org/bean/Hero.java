package org.bean;

import java.util.List;

public class Hero {

	private HeroesName name;
	private List<HeroesName> counters;
	private Spell counterSpell;
	private List<Equipment> counterEquipments;

	public HeroesName getName() {
		return name;
	}

	public void setName(HeroesName name) {
		this.name = name;
	}

	public List<HeroesName> getCounters() {
		return counters;
	}

	public void setCounters(List<HeroesName> counters) {
		this.counters = counters;
	}

	public Spell getCounterSpell() {
		return counterSpell;
	}

	public void setCounterSpell(Spell counterSpell) {
		this.counterSpell = counterSpell;
	}

	public List<Equipment> getCounterEquipments() {
		return counterEquipments;
	}

	public void setCounterEquipments(List<Equipment> counterEquipments) {
		this.counterEquipments = counterEquipments;
	}

}
