package org.models;

import static org.models.Behaviour.SLOW;
import static org.models.Behaviour.ENDURANCE;
import static org.models.Behaviour.HIGH_MOBILITY;
import static org.models.Behaviour.INVULNERABILITY;
import static org.models.Behaviour.MAGIC_DEFENSE;
import static org.models.Behaviour.MANA_POOL;
import static org.models.Behaviour.MANA_REGENERATION;
import static org.models.Behaviour.PHYSICAL_DEFENSE;
import static org.models.Behaviour.ARMOR_BREAKER_REAL_DAMAGE;
import static org.models.Behaviour.REFLECTION;
import static org.models.Behaviour.REGENERATION;
import static org.models.Behaviour.REGENERATION_REDUCTION;
import static org.models.Behaviour.SHIELD;
import static org.models.Behaviour.SPLASH_DAMAGE;
import static org.models.Behaviour.HP_POOL;
import static org.models.EquipmentType.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum Equipment {

	RADIANT_ARMOR(DEFENSE, Arrays.asList(MAGIC_DEFENSE, REGENERATION, ENDURANCE)),
	TWILIGHT_ARMOR(DEFENSE, Arrays.asList(PHYSICAL_DEFENSE, ENDURANCE)),
	BRUTE_FORCE(DEFENSE, Arrays.asList(ENDURANCE, MAGIC_DEFENSE, PHYSICAL_DEFENSE, HIGH_MOBILITY)),
	IMMORTALITY(DEFENSE, Arrays.asList(ENDURANCE, PHYSICAL_DEFENSE, REGENERATION, INVULNERABILITY)),
	DOMINANCE_ICE(DEFENSE, Arrays.asList(MANA_POOL, SLOW, REGENERATION_REDUCTION, PHYSICAL_DEFENSE)),
	ATHENAS_SHIELD(DEFENSE, Arrays.asList(ENDURANCE, MAGIC_DEFENSE)),
	ORACLE(DEFENSE, Arrays.asList(ENDURANCE, MAGIC_DEFENSE, REGENERATION, SHIELD)),
	ANTIQUE_CUIRASS(DEFENSE, Arrays.asList(ENDURANCE, PHYSICAL_DEFENSE)),
	GUARDIAN_HELMET(DEFENSE, Arrays.asList(HP_POOL, REGENERATION)),
	CURSED_HELMET(DEFENSE, Arrays.asList(ENDURANCE, MAGIC_DEFENSE, SPLASH_DAMAGE)),
	THUNDER_BELT(DEFENSE, Arrays.asList(ENDURANCE, MANA_REGENERATION, PHYSICAL_DEFENSE, ARMOR_BREAKER_REAL_DAMAGE, SLOW)),
	QUEENS_WINGS(DEFENSE, Arrays.asList(ENDURANCE)), 
	BLADE_ARMOR(DEFENSE, Arrays.asList(PHYSICAL_DEFENSE, REFLECTION)),
	DEMON_SHOES(MOVEMENT, Arrays.asList(MANA_REGENERATION)),
	RAPID_BOOTS(MOVEMENT,Arrays.asList(HIGH_MOBILITY)),
	SWIFT_BOOTS(MOVEMENT,Arrays.asList()), //TODO
	ARCANE_BOOTS(MOVEMENT,Arrays.asList(ARMOR_BREAKER_REAL_DAMAGE)),
	MAGIC_SHOES(MOVEMENT,Arrays.asList()), //TODO
	THOUGH_BOOTS(MOVEMENT,Arrays.asList(MAGIC_DEFENSE)),
	WARRIOR_BOOTS(MOVEMENT,Arrays.asList(PHYSICAL_DEFENSE)),
	;

	EquipmentType equipmentType;
	List<Behaviour> strengths;

	Equipment(EquipmentType equipmentType, List<Behaviour> strengths) {
		this.equipmentType = equipmentType;
		this.strengths = strengths;
	}

	static Map<EquipmentType, List<Equipment>> equipmentsByType = new HashMap<EquipmentType, List<Equipment>>();

	static {

		Arrays.asList(EquipmentType.values()).forEach(type -> equipmentsByType.put(type, new ArrayList<Equipment>()));

		Arrays.asList(values()).forEach(equipment -> equipmentsByType.get(equipment.equipmentType).add(equipment));
	}

	public static Map<EquipmentType, List<Equipment>> getEquipmentsByType() {
		return equipmentsByType;
	}

	public EquipmentType getEquipmentType() {
		return equipmentType;
	}

	public List<Behaviour> getStrengths() {
		return strengths;
	}

}
