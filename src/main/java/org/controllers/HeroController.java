package org.controllers;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.models.exceptions.UnknownHeroException;
import org.services.CounterPrintingService;
import org.services.HeroPickingService;
import org.services.HeroService;

public class HeroController {

    private HeroService heroService;
    private HeroPickingService heroPickingService;
    private CounterPrintingService counterPrintingService;

    public HeroController() {
        this.heroPickingService = new HeroPickingService();
        this.counterPrintingService = new CounterPrintingService();
        this.heroService = new HeroService(heroPickingService);
    }

    public Map<String, List<String>> getCounterHeroes() {
        return heroService.getCounterHeroes();
    }

    public List<String> getPickedHeroes() {
        return heroPickingService.getPickedHeroes();
    }

    public void addPickedHero(String pickedHero) {
        Optional.ofNullable(heroService.getHeroesData().get(pickedHero))
                .orElseThrow(() -> new UnknownHeroException(pickedHero));
        heroPickingService.addPickedHero(pickedHero);
    }

    public void printCounters(Map<String, List<String>> counters) {
        counterPrintingService.printCounters(counters);
    }
}
