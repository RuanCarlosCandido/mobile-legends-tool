package org.models;

public enum Behaviour {
	REGENERATION_REDUCTION("heroes like Baxia can reduce healing/regeneration"),
	REGENERATION("regenaration/healing effects from heroes like Rafaela, Alice, Esmeralda"),
	CROWD_CONTROL("Control like STUN and SLOW from heroes like Akai, Aurora"),
	SHIELD("Heroes that generate shields like Esmeralda, Lolita"),
	CONTROL_IMMUNITY("Heroes that can 'purify' like Diggie, Mya"),
	REAL_DAMAGE("Damage that pass through shield/armor like from Karrie"),
	HIGH_MOBILITY("Ability from heroes that can pursuit and escape quickly"),
	INVULNERABILITY("Ability from heroes that can become invencible sometimes like Lancelot and Khaleed"),
	SHIELD_STEALING("Absroving skill from Esmeralda"),
	LONG_RANGE("Poke like Lesley and long range damage like Layla"),
	REFLECTION("ability to reflect damage from Belerick"),
	ENDURANCE("Just Like Hylos"),
	REAP("Ability to do drain HP like WanWan, Mya"),
	SPLASH_DAMAGE("Area damage"),
	SUMMON("Summons ability like Zhask and Popol & Kupa"),
	ARMOR_BREAKER("Ability to reduce armor like ALucard"),
	ENCAGE("Ability to encage heroes, preventing them to escape or blink like Silvanna, Khufra, Barats"),
	EXPLOSION("High damage in a small space of time"),
	SKILL_SUPPRESSION("Silence skill like from helcurt and minsithar");




	String description;

	Behaviour(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

}