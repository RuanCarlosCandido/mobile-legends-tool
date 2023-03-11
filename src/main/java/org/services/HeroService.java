package org.services;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.apache.log4j.LogManager;
import org.models.HeroesResponse;
import org.proxy.HeroesDataProxy;

public class HeroService {

    private final org.apache.log4j.Logger LOGGER = LogManager.getLogger(this.getClass());

    Map<String, List<String>> countersMapResult = new HashMap<>();
    List<String> pickedHeroes = new ArrayList<String>();

    private Map<String, HeroesResponse> heroes;

    /**
     * Retrieves the counter heroes for the last hero picked in the pickedHeroes
     * list.
     * The heroes will be sorted and ranked based on the counter effectiveness, and
     * then adjusted to include the picked hero.
     *
     * @return a map with keys as Role and values as the counter heroes of that
     *         role.
     */
    public Map<String, List<String>> getCounterHeroes() {

        String hero = pickedHeroes.get(pickedHeroes.size() - 1);

        getHeroCountersGroupedByRole(hero);

        rankCountersMapResult();

        removeCounters();

        return countersMapResult;
    }

    private void removeCounters() {
        countersMapResult.entrySet().forEach(entry -> {
            List<String> counters = entry.getValue();
            Iterator<String> counterHeroIterator = counters.iterator();

            while (counterHeroIterator.hasNext()) {
                String counterHero = counterHeroIterator.next();
                List<String> counterHeroCounters = getHeroesData().get(counterHero.toLowerCase()).getCounters();
                boolean shouldRemoveCounterHero = counterHeroCounters.stream().anyMatch(pickedHeroes::contains);

                if (shouldRemoveCounterHero) {
                    counterHeroIterator.remove();
                }
            }
        });
    }
    /**
     * 
     * Adjust the counter heroes list by removing heroes that either can counter the
     * picked hero, or has been picked by the player.
     * Also remove the picked hero from the counter heroes list.
     * 
     * @param lastHeroSelectedName - the picked hero for which the counter heroes
     *                             list is being adjusted
     */
//	private void adjust(String lastHeroSelectedName) {
//		countersMapResult.values().forEach(countersListForRole -> countersListForRole.removeIf(
//				heroAlreadyInCountersList -> pickedHeroes.stream()
//						.anyMatch(previousPickedHero -> canCounter(getHeroes().get(lastHeroSelectedName).getBehaviours(), getHeroes().get(heroAlreadyInCountersList).getBehaviours())
//								|| canCounter(getHeroes().get(previousPickedHero).getBehaviours(), getHeroes().get(heroAlreadyInCountersList).getBehaviours())
//								|| heroAlreadyInCountersList.equals(lastHeroSelectedName))));
//	}


    
    private void rankCountersMapResult() {
        Map<String, List<String>> rankedCountersMapResult = new HashMap<>();

        for (Map.Entry<String, List<String>> entry : countersMapResult.entrySet()) {
            String role = entry.getKey();
            List<String> counters = entry.getValue();
            Map<String, Long> counterFrequency = counters.stream()
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            long maxFrequency = counterFrequency.values().stream().max(Long::compare).orElse(0L);
            List<String> rankedCounters = counterFrequency.entrySet().stream()
                    .filter(counterEntry -> counterEntry.getValue() == maxFrequency)
                    .map(Map.Entry::getKey)
                    .collect(Collectors.toList());
            rankedCountersMapResult.put(role, rankedCounters);
        }

        countersMapResult = rankedCountersMapResult;
    }
    
    
    /**
     * Retrieves all heroes that can counter the provided hero and adds them to the
     * result Map.
     * The counter heroes will be added to the result Map, under the role key,
     *
     * @param heroName the hero for which the counter heroes will be retrieved
     */

    private void getHeroCountersGroupedByRole(String heroName) {
        HeroesResponse hero = getHeroesData().get(heroName);
        if (hero == null) {
            LOGGER.error("hero " + heroName + " not found in the heroes.json");
            return;
        }

        hero.getCounters().stream()
            .map(counterName -> getHeroesData().get(counterName))
            .filter(counter -> counter != null && counter.getRoles() != null)
            .flatMap(counter -> counter.getRoles().stream()
                .map(String::toLowerCase)
                .map(role -> new AbstractMap.SimpleEntry<>(role, counter.getName())))
            .forEach(entry -> countersMapResult.computeIfAbsent(entry.getKey(), k -> new ArrayList<>()).add(entry.getValue()));
    }

    public void clearResult() {
        countersMapResult.values().forEach(List::clear);
    }

    public void clearPickedHeroes() {
        pickedHeroes.clear();
    }

    public List<String> getPickedHeroes() {
        return pickedHeroes;
    }

    public void addPickedHero(String pickedHero) {
        LOGGER.info("Heroi selecionado: " + pickedHero);

        pickedHeroes.add(pickedHero);
    }

    // Corrigir a lógica pois este método não deveria fazer os calculos, deveria
    // somente exibir
    public void printCounters() {
        getCounterHeroes().entrySet().forEach(System.out::println);
    }

    public Map<String, HeroesResponse> getHeroesData() {
        if (this.heroes == null || this.heroes.isEmpty())
            this.heroes = new HeroesDataProxy().getData();
        return heroes;
    }
    
    public void setHeroesData(Map<String, HeroesResponse> heroes) {
        this.heroes = heroes;
    }

}