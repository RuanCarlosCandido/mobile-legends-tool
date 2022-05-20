package org.controllers;

import static org.models.Hero.getHeroesNameMap;

import java.util.List;
import java.util.Map;

import org.models.Hero;
import org.models.Role;
import org.models.exceptions.UnknownHeroException;
import org.services.HeroService;

public class HeroController {

	HeroService heroService = new HeroService();

	public Map<Role, List<Hero>> getCounterHeroes(String pickedHero) {

		if (!getHeroesNameMap().containsKey(pickedHero)) throw new UnknownHeroException(pickedHero);
		
		return heroService.getCounterHeroes(pickedHero);
	}

}
