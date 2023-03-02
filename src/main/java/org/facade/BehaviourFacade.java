package org.facade;

public class BehaviourFacade {

//	/**
//	 * Build the hero weaknesses from his strengths, i.e, weakness is opposite from
//	 * strength
//	 *
//	 * @param hero
//	 * @return
//	 */
//    public static Set<Behaviour> buildWeaknesses(List<Behaviour> strengths) {
//
//        return strengths.stream()
//                .map(Behaviour::getWeaknesses) //maps it to a stream of Behaviour objects representing the weaknesses of each strength
//                .flatMap(List::stream) //flattens the streams of weaknesses into a single stream
//                .filter(weakness -> strengths.stream().noneMatch(weakness::hasWeakness)) //filters out any weaknesses that are also strengths
//                .collect(Collectors.toSet());
//    }
//	
//	
//    /**
//     * Returns a list of behaviours that are strong against the strengths of the given hero.
//     *
//     * @param hero the hero whose strengths to consider
//     * @return a list of behaviours that are strong against the strengths of the given hero
//     */
//	public static List<Behaviour> strongAgainst(Hero hero) {
//        return hero.getStrengths().stream()
//                .map(str -> Stream.of(Behaviour.values()).filter(behaviour -> behaviour.getWeaknesses().contains(str)))
//                .flatMap(Function.identity()) // This effectively concatenates all the streams in the stream of streams into a single stream.
//                .collect(Collectors.toList());
//	}
}