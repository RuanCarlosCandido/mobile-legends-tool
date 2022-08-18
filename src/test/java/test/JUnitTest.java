package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.models.Hero;
import org.models.Role;
import org.services.HeroService;

public class JUnitTest {

	HeroService heroService = new HeroService();

	@BeforeEach
	void cleanResult() {
		heroService.clearResult();
	}

	public static Collection<Object[]> heroData() {

		return Arrays.asList(new Object[][] {
				{ Arrays.asList(Hero.LOLITA, Hero.ANGELA, Hero.HILDA, Hero.URANUS), Hero.ESMERALDA, true },
				{ Arrays.asList(Hero.LOLITA, Hero.ANGELA, Hero.HILDA, Hero.URANUS, Hero.KARINA), Hero.ESMERALDA, false },
				{ Arrays.asList(Hero.KARINA, Hero.AURORA, Hero.FRANCO, Hero.LAYLA, Hero.CHOU), Hero.FARAMIS, false },
				{ Arrays.asList(Hero.IRITHEL, Hero.MOSKOV, Hero.BRUNO), Hero.BELERICK, true } });
		
	}

	@Test
	public void get_counters_from_one_hero_sucess_expected() {
		Map<Role, List<Hero>> result = heroService.getCounterHeroes("akai");

		assertEquals(true, result.get(Role.TANK).isEmpty());
		assertEquals(false, result.get(Role.DAMAGE).isEmpty());
		assertEquals(false, result.get(Role.MAGE).isEmpty());
		assertEquals(false, result.get(Role.SOLDIER).isEmpty());
		assertEquals(false, result.get(Role.SUPPORT).isEmpty());
	}

	@Test
	public void get_counters_from_two_heroes_sucess_expected() {
		Map<Role, List<Hero>> result = heroService.getCounterHeroes("akai");
		result = heroService.getCounterHeroes("alpha");

		assertEquals(false, result.get(Role.TANK).isEmpty());
		assertEquals(false, result.get(Role.MAGE).isEmpty());
	}

	@Test
	public void picking_hero_existing_in_couterList_must_remove_it() {
		heroService.getCounterHeroes("akai");
		Map<Role, List<Hero>> result = heroService.getCounterHeroes("kadita");

		assertEquals(false, result.get(Role.MAGE).contains(Hero.KADITA));
	}

	@Test
	public void picking_a_hero_that_counters_one_in_counterList_must_remove_it() {
		Map<Role, List<Hero>> result = heroService.getCounterHeroes("lolita");
		assertEquals(true, result.get(Role.MAGE).contains(Hero.ESMERALDA));
		result = heroService.getCounterHeroes("karina");
		assertEquals(false, result.get(Role.MAGE).contains(Hero.ESMERALDA));
	}
	

	@ParameterizedTest
	@MethodSource("heroData")
	public void general(List<Hero> heroList, Hero expectedHero, boolean result) {
		Map<Role, List<Hero>> counters = new HashMap<Role, List<Hero>>();

		for (Hero hero : heroList)
			counters = heroService.getCounterHeroes(hero.toString());

		assertEquals(result, counters.get(expectedHero.getRole()).contains(expectedHero));
	}
}