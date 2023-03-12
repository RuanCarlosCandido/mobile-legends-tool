package org.controllers;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.models.exceptions.UnknownHeroException;
import org.services.HeroService;

public class HeroController {

    private HeroService heroService = new HeroService();

    public Map<String, List<String>> getCounterHeroes() {
        return heroService.getCounterHeroes();
    }

    public List<String> getPickedHeroes() {
        return heroService.getPickedHeroes();
    }

    public void addPickedHero(String pickedHero) {
        Optional.ofNullable(heroService.getHeroesData().get(pickedHero))
                .orElseThrow(() -> new UnknownHeroException(pickedHero));
        heroService.addPickedHero(pickedHero);
    }

    public void printCounters() {
        heroService.printCounters();
    }
}
