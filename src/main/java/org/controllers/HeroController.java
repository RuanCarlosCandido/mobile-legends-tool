package org.controllers;

import java.util.Optional;

import org.models.exceptions.UnknownHeroException;
import org.repository.CountersRepository;
import org.repository.HeroRepository;
import org.repository.SelectedHeroesRepository;
import org.services.CounterPrintingService;
import org.services.HeroService;
import org.services.IHeroService;

public class HeroController {

    private IHeroService heroService;
    private SelectedHeroesRepository selectedHeroesRepository;
    private CounterPrintingService counterPrintingService;
    private HeroRepository heroRepository;
    private CountersRepository countersRepository;

    public HeroController() {
        this.selectedHeroesRepository = new SelectedHeroesRepository();
        this.counterPrintingService = new CounterPrintingService();
        this.countersRepository = new CountersRepository();
        this.heroRepository = new HeroRepository();
        this.heroService = new HeroService(selectedHeroesRepository, countersRepository);
    }

    public void addPickedHero(String pickedHero) {
        Optional.ofNullable(heroRepository.getHeroesData().getHeroInfo(pickedHero))
                .orElseThrow(() -> new UnknownHeroException(pickedHero));
        selectedHeroesRepository.addSelectedHero(pickedHero);
    }

    public void calculateCounters() {
        heroService.calculateCounters();
    }

    public void printCounters() {
        counterPrintingService.printCounters(countersRepository.getCounters());
    }

}
