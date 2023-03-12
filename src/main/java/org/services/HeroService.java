package org.services;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.apache.log4j.LogManager;
import org.models.HeroesResponse;
import org.proxy.HeroesDataProxy;

public class HeroService {

    private final org.apache.log4j.Logger logger = LogManager.getLogger(this.getClass());

    private Map<String, List<String>> countersMapResult = new HashMap<>();
    private List<String> pickedHeroes = new ArrayList<>();

    private Map<String, HeroesResponse> heroesData;

    public Map<String, List<String>> getCounterHeroes() {

        String hero = pickedHeroes.get(pickedHeroes.size() - 1);

        groupHeroCountersByRole(hero);

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

    private void rankCountersMapResult() {
        Map<String, List<String>> rankedCountersMapResult = countersMapResult.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, entry -> {
                    Map<String, Long> counterFrequency = entry.getValue().stream()
                            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
                    long maxFrequency = counterFrequency.values().stream().max(Long::compare).orElse(0L);
                    return counterFrequency.entrySet().stream()
                            .filter(counterEntry -> counterEntry.getValue() == maxFrequency)
                            .map(Map.Entry::getKey)
                            .collect(Collectors.toList());
                }));

        countersMapResult.clear();
        countersMapResult.putAll(rankedCountersMapResult);
    }

    private void groupHeroCountersByRole(String heroName) {
        Optional<HeroesResponse> hero = Optional.ofNullable(getHeroesData().get(heroName));
        hero.ifPresent(h -> h.getCounters().stream()
                .map(counterName -> getHeroesData().get(counterName))
                .filter(Objects::nonNull)
                .flatMap(counter -> counter.getRoles().stream()
                        .map(String::toLowerCase)
                        .map(role -> new AbstractMap.SimpleEntry<>(role, counter.getName())))
                .forEach(entry -> countersMapResult.computeIfAbsent(entry.getKey(), k -> new ArrayList<>())
                        .add(entry.getValue())));
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
        logger.info("Hero selected: " + pickedHero);

        pickedHeroes.add(pickedHero);
    }

    public void printCounters() {
        getCounterHeroes().entrySet().forEach(System.out::println);
    }


    public Map<String, HeroesResponse> getHeroesData() {
        if (this.heroesData == null || this.heroesData.isEmpty())
            this.heroesData = new HeroesDataProxy().getData();
        return heroesData;
    }

    public void setHeroesData(Map<String, HeroesResponse> heroes) {
        this.heroesData = heroes;
    }

}