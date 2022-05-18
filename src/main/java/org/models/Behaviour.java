package org.models;

public enum Behaviour {
	REGENERATION_REDUCTION(null), REGENERATION(null), CROWD_CONTROL(null), SHIELD(null), ESCAPE(null),
	CONTROL_IMMUNITY(null), REAL_DAMAGE(null), CHARGE(null), INVULNERABILITY(null), SHIELD_STEALING(null),
	LONG_RANGE(null), REFLECTION(null), HIGH_HP(null), REAP(null) ;

	Behaviour counterBehaviour;

	Behaviour(Behaviour counterBehaviour) {
		this.counterBehaviour = counterBehaviour;
	}

}
