package org.facade;

import java.util.ArrayList;
import java.util.List;

import org.models.Behaviour;

public class BehaviourFacade {

	/**
	 * Build the hero weaknesses from his strengths, i.e, weakness is opposite from
	 * strength
	 *
	 * @param hero
	 * @return
	 */
	public static List<Behaviour> buildWeaknesses(List<Behaviour> strenghts) {
		List<Behaviour> weaknesses = new ArrayList<Behaviour>();

		for (Behaviour strenght : strenghts) {

			weaknesses.addAll(strenght.getWeaknesses());

		}

		return weaknesses;
	}
}