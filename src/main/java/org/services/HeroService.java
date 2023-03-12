package org.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.models.HeroesResponse;
import org.proxy.HeroesDataProxy;

public class HeroService {

    private final Logger logger = LogManager.getLogger(this.getClass());
    private Map<String, List<String>> countersMapResult;
    private Map<String, HeroesResponse> heroesData;
    private HeroCounterService heroCounterService;
    private HeroPickingService heroPickingService;

    public HeroService(HeroPickingService heroPickingService) {
        this.countersMapResult = new HashMap<>();
        this.heroesData = new HashMap<>();
        this.heroCounterService = new HeroCounterService(getHeroesData(), new HashMap<>(), heroPickingService.getPickedHeroes());
        this.heroPickingService = heroPickingService;
    }

    public Map<String, List<String>> getCounterHeroes() {
        countersMapResult = heroCounterService.getCounters(heroPickingService.getLastPickedHero());
        return countersMapResult;
    }

    public void clearResult() {
        countersMapResult.values().forEach(List::clear);
    }

    public Map<String, HeroesResponse> getHeroesData() {
        return heroesData == null || heroesData.isEmpty() ? heroesData = new HeroesDataProxy().getData() : heroesData;
    }

    public void setHeroesData(Map<String, HeroesResponse> heroes) {
        heroesData = heroes;
    }

}