package org.models;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum Behaviour {
	
	//this iddentation must be removed after the tests are OK
	ARMOR_BREAKER_REAL_DAMAGE	(Arrays.asList("HP_POOL","RESSURRECTION")),	
	CONTROL_IMMUNITY		    (Arrays.asList("HIGH_MOBILITY","EXPLOSION", "LONG_RANGE")),
	DASH					    (Arrays.asList("DASH_SUPPRESSION","ENCAGE", "SKILL_SUPPRESSION")),
	DASH_SUPPRESSION		    (Arrays.asList("REFLECTION","HIGH_MOBILITY")),
	ENDURANCE				    (Arrays.asList("ARMOR_BREAKER_REAL_DAMAGE","SLOW","REAP")),
	ENCAGE					    (Arrays.asList("CONTROL_IMMUNITY","ENDURANCE")),
	EXPLOSION				    (Arrays.asList("SHIELD","RESSURRECTION","ENDURANCE")),
	HP_BASED_DAMAGE		        (Arrays.asList("PULL","SHIELD")),
	HP_POOL		                (Arrays.asList("HP_BASED_DAMAGE", "ENDURANCE")),
	HIGH_MOBILITY			    (Arrays.asList("SLOW","INVULNERABILITY")),
	INVULNERABILITY			    (Arrays.asList("STUN","ENCAGE")),
	INVISIBILITY		        (Arrays.asList("SPLASH_DAMAGE","ENCAGE")),
	KNOCK_BACK   			    (Arrays.asList("CONTROL_IMMUNITY","DASH")),
	LONG_RANGE				    (Arrays.asList("EXPLOSION","INVISIBILITY")),
	MAGIC_DAMAGE			    (Arrays.asList("MAGIC_DEFENSE")),
	MAGIC_DEFENSE			    (Arrays.asList("ARMOR_BREAKER_REAL_DAMAGE")),
	MANA_POOL				    (Arrays.asList("SKILL_SUPPRESSION")), //temp
	MANA_REGENERATION		    (Arrays.asList("SKILL_SUPPRESSION")),	//temp
	PHYSICAL_DEFENSE		    (Arrays.asList("ARMOR_BREAKER_REAL_DAMAGE")),
	PULL					    (Arrays.asList("ENDURANCE","SUMMON")),
	REFLECTION				    (Arrays.asList("SUMMON","LONG_RANGE")),
	REGENERATION		  	    (Arrays.asList("REGENERATION_REDUCTION","SUMMON")),
	REGENERATION_REDUCTION	    (Arrays.asList("SUMMON","KNOCK_BACK")),
	RESSURRECTION		  	    (Arrays.asList("HIGH_MOBILITY","LONG_RANGE")),
	REAP					    (Arrays.asList("REFLECTION","INVULNERABILITY")),
	SLOW				  		(Arrays.asList("CONTROL_IMMUNITY","PULL")),
	SPLASH_DAMAGE			    (Arrays.asList("REFLECTION","INVULNERABILITY")),
	STUN					    (Arrays.asList("SKILL_SUPPRESSION","ENDURANCE","KNOCK_BACK")),
	SUMMON					    (Arrays.asList("SPLASH_DAMAGE","INVISIBILITY")),
	SHIELD					    (Arrays.asList("SHIELD_STEALING","REAP")),
	SHIELD_STEALING			    (Arrays.asList("REGENERATION_REDUCTION","ARMOR_BREAKER_REAL_DAMAGE","HP_POOL")),
	SKILL_SUPPRESSION		    (Arrays.asList("CONTROL_IMMUNITY","REAP"));



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