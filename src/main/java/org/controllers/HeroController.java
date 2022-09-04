package org.controllers;

import static org.models.Hero.getHeroesNameMap;

import java.util.List;
import java.util.Map;

import org.models.Hero;
import org.models.Role;
import org.models.exceptions.UnknownHeroException;
import org.services.HeroService;

public class HeroController {

	private HeroService heroService = new HeroService();

	public Map<Role, List<Hero>> getCounterHeroes() {

		

		return heroService.getCounterHeroes();
	}

	public List<Hero> getPickedHeroes() {

		return heroService.getPickedHeroes();
	}

	public void addPickedHero(String pickedHero) {
		if (!getHeroesNameMap().containsKey(pickedHero))
			throw new UnknownHeroException(pickedHero);
		
		heroService.addPickedHero(pickedHero);
	}
}
