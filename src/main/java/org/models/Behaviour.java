package org.models;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum Behaviour {
	//thhis iddentation must be removed after the tests are OK
	REGENERATION_REDUCTION	(Arrays.asList("LONG_RANGE")),
	REGENERATION		  	(Arrays.asList("REGENERATION_REDUCTION", "SUMMON", "LONG_RANGE")),
	CROWD_CONTROL		  	(Arrays.asList("CONTROL_IMMUNITY", "SKILL_SUPPRESSION")),
	SHIELD					(Arrays.asList("SHIELD_STEALING", "REAL_DAMAGE", "REGENERATION")),
	CONTROL_IMMUNITY		(Arrays.asList("EXPLOSION","LONG_RANGE","HIGH_MOBILITY", "SKILL_SUPPRESSION")),
	REAL_DAMAGE				(Arrays.asList("HIGH_MOBILITY","ENDURANCE")),
	HIGH_MOBILITY			(Arrays.asList("SKILL_SUPPRESSION","ENCAGE","EXPLOSION")),
	INVULNERABILITY			(Arrays.asList("SKILL_SUPPRESSION","CROWD_CONTROL","ENCAGE")),
	SHIELD_STEALING			(Arrays.asList("REGENERATION_REDUCTION","REAL_DAMAGE")),
	LONG_RANGE				(Arrays.asList("SUMMON","INVULNERABILITY","EXPLOSION","ENDURANCE")),
	REFLECTION				(Arrays.asList("SUMMON","LONG_RANGE")),
	ENDURANCE				(Arrays.asList("REAP","ARMOR_BREAKER")),
	REAP					(Arrays.asList("REFLECTION","INVULNERABILITY","SHIELD")),
	SPLASH_DAMAGE			(Arrays.asList("ENDURANCE","SHIELD","HIGH_MOBILITY")),
	SUMMON					(Arrays.asList("INVULNERABILITY","SPLASH_DAMAGE","SHIELD")),
	ARMOR_BREAKER			(Arrays.asList("REFLECTION","SHIELD")),
	ENCAGE					(Arrays.asList("CONTROL_IMMUNITY","CROWD_CONTROL")),
	EXPLOSION				(Arrays.asList("ENDURANCE","CROWD_CONTROL")),
	MAGIC_DEFENSE			(Arrays.asList("ARMOR_BREAKER","REAL_DAMAGE")),
	PHYSICAL_DEFENSE		(Arrays.asList("ARMOR_BREAKER","REAL_DAMAGE")),
	MANA_POOL				(Arrays.asList("")),
	MANA_REGENERATION		(Arrays.asList("")),
	HP_BASED_DAMAGE		    (Arrays.asList("REGENERATION")),
	HP_POOL		            (Arrays.asList("HP_BASED_DAMAGE")),
	SKILL_SUPPRESSION		(Arrays.asList("SHIELD","SUMMON"));



	static Map<String, Behaviour> namesMap = new HashMap<String, Behaviour>();

	static { Arrays.asList(values()).forEach(behaviour -> namesMap.put(behaviour.toString(), behaviour)); }



	List<String> weaknesses = new ArrayList<String>();
	Behaviour(List<String> weaknesses) {
		this.weaknesses = weaknesses;
	}


	public List<Behaviour> getWeaknesses() {

		List<Behaviour> result = new ArrayList<Behaviour>();
		for (String weaknessAsString : weaknesses) {
			result.add(namesMap.get(weaknessAsString));
		}

		return result;
	}



}