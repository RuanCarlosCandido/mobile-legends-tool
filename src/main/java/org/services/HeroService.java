package org.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.models.Hero;
import org.repository.CountersRepository;
import org.repository.HeroRepository;
import org.repository.SelectedHeroesRepository;

public class HeroService implements IHeroService {

    private HeroRepository repository;
    private SelectedHeroesRepository selectedHeroesRepository;
    private CountersRepository countersRepository;
    private Map<String, Integer> counterFrequency = new HashMap<>();
    private Map<String, Map<String, Integer>> roleCounterFrequency = new HashMap<>();

    public HeroService(SelectedHeroesRepository selectedHeroesRepository, CountersRepository countersRepository) {
        this.repository = new HeroRepository();
        this.selectedHeroesRepository = selectedHeroesRepository;
        this.countersRepository = countersRepository;
    }

    @Override
    public void calculateCounters() {

        processSelectedHeroes();
        removeCountersOfSelectedHeroes();
        calculateTopHeroesByRole();
    }

    public void processSelectedHeroes() {
        counterFrequency = new HashMap<>();
        for (String heroName : selectedHeroesRepository.getSelectedHeroes()) {
            Hero hero = repository.getHeroesData().getHeroInfo(heroName);
            List<String> counters = hero.getCounters();
            for (String counter : counters) {
                int newCount = counterFrequency.getOrDefault(counter, 0) + 1;
                counterFrequency.put(counter, newCount);

                Hero counterHero = repository.getHeroesData().getHeroInfo(counter);
                List<String> roles = counterHero.getRoles();

                for (String role : roles) {
                    Map<String, Integer> roleMap = roleCounterFrequency.computeIfAbsent(role, k -> new HashMap<>());
                    roleMap.put(counter, newCount);
                }
            }
        }
    }

    public void removeCountersOfSelectedHeroes() {
        for (String role : roleCounterFrequency.keySet()) {
            Map<String, Integer> counters = roleCounterFrequency.get(role);
            Iterator<String> iterator = counters.keySet().iterator();
            while (iterator.hasNext()) {
                String hero = iterator.next();
                Hero heroInfo = repository.getHeroesData().getHeroInfo(hero);
                List<String> heroCounters = heroInfo.getCounters();

                if (!Collections.disjoint(heroCounters, selectedHeroesRepository.getSelectedHeroes())) {
                    iterator.remove();
                }
            }
        }
    }

    public void calculateTopHeroesByRole() {
        for (Map.Entry<String, Map<String, Integer>> entry : roleCounterFrequency.entrySet()) {
            String role = entry.getKey();
            Map<String, Integer> counters = entry.getValue();

            int maxCount = -1;
            List<String> topHeroes = new ArrayList<>();

            for (Map.Entry<String, Integer> counterEntry : counters.entrySet()) {
                int count = counterEntry.getValue();
                String hero = counterEntry.getKey();

                if (count > maxCount) {
                    maxCount = count;
                    topHeroes = new ArrayList<>();
                    topHeroes.add(hero);
                } else if (count == maxCount) {
                    topHeroes.add(hero);
                }
            }

            if (!topHeroes.isEmpty()) {
                countersRepository.getCounters().put(role, topHeroes);
            }
        }
    }

}
