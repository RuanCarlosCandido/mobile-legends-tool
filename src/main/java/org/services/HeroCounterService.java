package org.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.stream.Collectors;

import org.models.HeroesResponse;

public class HeroCounterService {
    
    private final Map<String, HeroesResponse> heroesData;
    Map<String, List<String>> countersMapResult;
    List<String> pickedHeroes;
    Map<String, Map<String, Long>> cumulativeCounters; // Estrutura para manter contagens cumulativas

    
    public HeroCounterService(Map<String, HeroesResponse> heroesData, Map<String, List<String>> countersMapResult, List<String> pickedHeroes) {
        this.heroesData = heroesData;
        this.countersMapResult = countersMapResult;
        this.pickedHeroes = pickedHeroes;
        this.cumulativeCounters = new HashMap<>(); // Inicializa o mapa de contagens cumulativas
    }
    
    public Map<String, List<String>> getCounters(String heroName) {
        groupHeroCountersByRole(heroName, countersMapResult);
        Map<String, List<String>> removedCounters = removeCounters(countersMapResult);
        updateCumulativeCountersAfterRemoval(removedCounters);
        rankCountersMapResult(countersMapResult);
        return countersMapResult;
    }

    private void updateCumulativeCountersAfterRemoval(Map<String, List<String>> removedCounters) {
        removedCounters.forEach((role, counters) -> {
            if (cumulativeCounters.containsKey(role)) {
                counters.forEach(counter -> cumulativeCounters.get(role).remove(counter));
            }
        });
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
        countersMapResult.forEach((role, counters) -> {
            Map<String, Long> currentCounts = new HashMap<>();
            counters.forEach(counter -> currentCounts.merge(counter, 1L, Long::sum));
            cumulativeCounters.computeIfAbsent(role, k -> new HashMap<>()).forEach((key, val) -> currentCounts.merge(key, val, Long::sum));
            cumulativeCounters.put(role, new HashMap<>(currentCounts));

            if (!currentCounts.isEmpty()) {
                TreeMap<Long, List<String>> sortedCounts = new TreeMap<>(currentCounts.entrySet().stream()
                    .collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList()))));
                
                if (!sortedCounts.isEmpty()) {
                    long maxCount = sortedCounts.lastKey();
                    List<String> maxHeroes = sortedCounts.get(maxCount);
                    countersMapResult.put(role, maxHeroes);
                } else {
                    countersMapResult.put(role, new ArrayList<>()); // Nenhuma contagem disponível
                }
            } else {
                countersMapResult.put(role, new ArrayList<>()); // Sem heróis restantes após remoção
            }
        });
    }


    
    private Map<String, List<String>> removeCounters(Map<String, List<String>> countersMapResult) {
        Map<String, List<String>> removedCounters = new HashMap<>();
        countersMapResult.forEach((role, counters) -> {
            List<String> remainingCounters = counters.stream()
                .filter(counter -> !heroesData.get(counter.toLowerCase())
                        .getCounters().stream()
                        .anyMatch(pickedHeroes::contains))
                .collect(Collectors.toList());
            List<String> removed = new ArrayList<>(counters);
            removed.removeAll(remainingCounters);
            removedCounters.put(role, removed);
            countersMapResult.put(role, remainingCounters);
        });
        return removedCounters;
    }

  }