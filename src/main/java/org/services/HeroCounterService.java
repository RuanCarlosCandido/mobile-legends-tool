package org.services;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.models.HeroesResponse;

public class HeroCounterService {
    
    private final Map<String, HeroesResponse> heroesData;
    Map<String, List<String>> countersMapResult;
    List<String> pickedHeroes;
    
    public HeroCounterService(Map<String, HeroesResponse> heroesData, Map<String, List<String>> countersMapResult, List<String> pickedHeroes) {
        this.heroesData = heroesData;
        this.countersMapResult = countersMapResult;
        this.pickedHeroes = pickedHeroes;
    }
    
    public Map<String, List<String>> getCounters(String heroName) {
        groupHeroCountersByRole(heroName, countersMapResult);
        rankCountersMapResult(countersMapResult);
        removeCounters(countersMapResult);
        return countersMapResult;
    }

    private void groupHeroCountersByRole(String heroName, Map<String, List<String>> countersMapResult) {
        Optional.ofNullable(heroesData.get(heroName)).ifPresent(hero ->
            hero.getCounters().stream()
                .map(counterName -> heroesData.get(counterName))
                .flatMap(counter -> counter.getRoles().stream().map(String::toLowerCase)
                        .map(role -> Map.entry(role, counter.getName())))
                .forEach(entry -> countersMapResult.computeIfAbsent(entry.getKey(), k -> new ArrayList<>())
                        .add(entry.getValue())));
    }
    
    private void rankCountersMapResult(Map<String, List<String>> countersMapResult) {
        countersMapResult.replaceAll((role, counters) -> counters.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .entrySet().stream()
            .collect(Collectors.groupingBy(Map.Entry::getValue, LinkedHashMap::new, Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
            .values().stream().findFirst().orElse(List.of()));
    }
    
    private void removeCounters(Map<String, List<String>> countersMapResult) {
        countersMapResult.replaceAll((role, counters) ->
            counters.stream()
                .filter(counter -> !heroesData.get(counter.toLowerCase())
                        .getCounters().stream()
                        .anyMatch(pickedHeroes::contains))
                .collect(Collectors.toList()));
    }
}