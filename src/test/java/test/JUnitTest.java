package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

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
		heroService.clearPickedHeroes();
	}

	public static Collection<Object[]> heroData() {

		return Arrays.asList(new Object[][] {
				{ Arrays.asList(Hero.LOLITA, Hero.ANGELA, Hero.HILDA, Hero.URANUS), Hero.ESMERALDA, true },
				{ Arrays.asList(Hero.LOLITA, Hero.ANGELA, Hero.HILDA, Hero.URANUS, Hero.KARINA), Hero.ESMERALDA,
						false },
				{ Arrays.asList(Hero.KARINA, Hero.AURORA, Hero.FRANCO, Hero.LAYLA, Hero.CHOU), Hero.FARAMIS, false },
				{ Arrays.asList(Hero.GUINEVERE, Hero.ANGELA, Hero.ESTES, Hero.RAFAELA, Hero.HILDA), Hero.BAXIA, true },
				{ Arrays.asList(Hero.ZHASK, Hero.POPOL, Hero.PHARSA, Hero.LAYLA, Hero.GORD, Hero.MYA, Hero.CLINT), Hero.LANCELOT, true },
				{ Arrays.asList(Hero.KARRIE, Hero.VEXANA, Hero.VALIR, Hero.ANGELA, Hero.ZHASK), Hero.HYLOS, false },
				{ Arrays.asList(Hero.HYLOS), Hero.KARRIE, true },
				{ Arrays.asList(Hero.NANA), Hero.NATALIA, true },
				{ Arrays.asList(Hero.MYA), Hero.ALICE, true },
				{ Arrays.asList(Hero.AKAI), Hero.DIGGIE, true },
				{ Arrays.asList(Hero.AAMON), Hero.SABER, true },
				{ Arrays.asList(Hero.ALDOUS), Hero.ANGELA, true },
				{ Arrays.asList(Hero.ALICE), Hero.BAXIA, true },
				{ Arrays.asList(Hero.ALPHA), Hero.RUBY, true },
				{ Arrays.asList(Hero.ALUCARD), Hero.SUN, true },
				{ Arrays.asList(Hero.ANGELA), Hero.BAXIA, true },
				{ Arrays.asList(Hero.ARGUS), Hero.AKAI, true },
				{ Arrays.asList(Hero.ATLAS), Hero.DIGGIE, true },
				{ Arrays.asList(Hero.AULUS), Hero.SABER, true },
				{ Arrays.asList(Hero.AURORA), Hero.HELCURT, true },
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
	public void all_heroes_must_have_counters_sucess_expected() throws Exception {

		Map<Role, List<Hero>> result = null;
		boolean isEmpty = true;
		for(Hero hero : Hero.values()){	
			result = heroService.getCounterHeroes(hero.name());
			isEmpty = true;
			for(Role role : result.keySet()){
				if(!result.get(role).isEmpty())
					isEmpty = false;
		}
		heroService.clearPickedHeroes();
			if(isEmpty)	
				throw new Exception(hero + " has no counters");
				
		}
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