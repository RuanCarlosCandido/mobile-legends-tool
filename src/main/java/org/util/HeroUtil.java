package org.util;

import static org.models.Behaviour.ARMOR_BREAKER;
import static org.models.Behaviour.CONTROL_IMMUNITY;
import static org.models.Behaviour.CROWD_CONTROL;
import static org.models.Behaviour.ENDURANCE;
import static org.models.Behaviour.HIGH_MOBILITY;
import static org.models.Behaviour.INVULNERABILITY;
import static org.models.Behaviour.LONG_RANGE;
import static org.models.Behaviour.REAL_DAMAGE;
import static org.models.Behaviour.REAP;
import static org.models.Behaviour.REFLECTION;
import static org.models.Behaviour.REGENERATION;
import static org.models.Behaviour.REGENERATION_REDUCTION;
import static org.models.Behaviour.SHIELD;
import static org.models.Behaviour.SHIELD_STEALING;
import static org.models.Behaviour.SPLASH_DAMAGE;
import static org.models.Behaviour.SUMMON;
import static org.models.Behaviour.SKILL_SUPPRESSION;
import static org.models.Behaviour.ENCAGE;

import java.util.ArrayList;
import java.util.List;

import org.models.Behaviour;
import org.models.Hero;

public class HeroUtil {

	/**
	 * Build the hero weaknesses from his strengths, i.e, weakness is opposite from
	 * strength
	 * 
	 * @param hero
	 * @return
	 */
	public static List<Behaviour> buildWeaknesses(Hero hero) {
		List<Behaviour> weaknesses = new ArrayList<Behaviour>();

		for (Behaviour strenght : hero.getStrengths()) {


			if (strenght.equals(ENCAGE)) {
				weaknesses.add(CONTROL_IMMUNITY);
			}

			if (strenght.equals(SKILL_SUPPRESSION)) {
				weaknesses.add(SHIELD);
			}

			
			if (strenght.equals(SUMMON)) {
				weaknesses.add(INVULNERABILITY);
			}

			if (strenght.equals(SPLASH_DAMAGE)) {
				weaknesses.add(ENDURANCE);
				
			}

			if (strenght.equals(REGENERATION)) {
				weaknesses.add(REGENERATION_REDUCTION);
				weaknesses.add(SUMMON);
			}

			if (strenght.equals(REGENERATION_REDUCTION)) {
				weaknesses.add(LONG_RANGE);
			}

			if (strenght.equals(CROWD_CONTROL)) {
				weaknesses.add(CONTROL_IMMUNITY);	
				weaknesses.add(SKILL_SUPPRESSION);
			}

			if (strenght.equals(REAL_DAMAGE)){
				weaknesses.add(HIGH_MOBILITY);
				weaknesses.add(REGENERATION);
			}
				

			if (strenght.equals(SHIELD_STEALING)) {
				weaknesses.add(REGENERATION_REDUCTION);
				weaknesses.add(REAL_DAMAGE);
			}

			if (strenght.equals(LONG_RANGE)) {
				weaknesses.add(SUMMON);
				weaknesses.add(INVULNERABILITY);
			}

			if (strenght.equals(REFLECTION)) {
				weaknesses.add(SUMMON);
			}

			if (strenght.equals(SHIELD)) {
				weaknesses.add(SHIELD_STEALING);
				weaknesses.add(REAL_DAMAGE);
				weaknesses.add(REGENERATION);
					
			}

			if (strenght.equals(HIGH_MOBILITY)) {
				weaknesses.add(LONG_RANGE);
				weaknesses.add(ENCAGE);
				
			}

			if (strenght.equals(CONTROL_IMMUNITY)) {
				weaknesses.add(HIGH_MOBILITY);
			}
			
			if (strenght.equals(INVULNERABILITY)) {
				weaknesses.add(SKILL_SUPPRESSION);
				weaknesses.add(CROWD_CONTROL);
				weaknesses.add(ENCAGE);
			}

			if (strenght.equals(ARMOR_BREAKER)) {
				weaknesses.add(REFLECTION);
	
			}

			if (strenght.equals(REAP)) {
				weaknesses.add(REFLECTION);
				weaknesses.add(SUMMON);
			}

			if (strenght.equals(ENDURANCE)){
				weaknesses.add(REAP);
				weaknesses.add(ARMOR_BREAKER);
			}

		}

		hero.getWeaknesses().addAll(weaknesses);
		return weaknesses;
	}
}
