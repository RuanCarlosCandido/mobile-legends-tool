package org.facade;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.models.Behaviour;
import org.models.Hero;

public class BehaviourFacade {

	/**
	 * Build the hero weaknesses from his strengths, i.e, weakness is opposite from
	 * strength
	 *
	 * @param hero
	 * @return
	 */
	public static Set<Behaviour> buildWeaknesses(List<Behaviour> strenghts) {
		Set<Behaviour> outWeaknesses = new HashSet<Behaviour>();

		for (Behaviour outStrenght : strenghts) {

			List<Behaviour> innerWeakness = outStrenght.getWeaknesses();

			for (Behaviour innerStrenght : strenghts)
				innerWeakness.removeIf(weakness -> weakness.getWeaknesses().contains(innerStrenght));

			outWeaknesses.addAll(innerWeakness);

		}
		return outWeaknesses;
	}
	
	
	/**
	 * @param hero
	 * @param weaknesses
	 * @return
	 */
	public static List<Behaviour> strongAgainst(Hero hero) {
		Set<Behaviour> result = new HashSet<Behaviour>();
		for(Behaviour str : hero.getStrengths()) {
			result.addAll(Stream.of(Behaviour.values()).filter(behaviour -> behaviour.getWeaknesses().contains(str)).collect(Collectors.toList()));
			
		}
		return new ArrayList<Behaviour>(result);
	}
}