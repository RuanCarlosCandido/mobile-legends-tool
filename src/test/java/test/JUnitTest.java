package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

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

		return Arrays
				.asList(new Object[][] {
						{ Arrays.asList(Hero.LOLITA, Hero.ANGELA, Hero.HILDA, Hero.URANUS), Hero.ESMERALDA, true }, {
								Arrays.asList(
										Hero.LOLITA, Hero.ANGELA, Hero.HILDA, Hero.URANUS, Hero.KARINA),
								Hero.ESMERALDA, false },
						{ Arrays.asList(Hero.KARINA, Hero.AURORA, Hero.FRANCO, Hero.LAYLA, Hero.CHOU), Hero.FARAMIS,
								false },
						{ Arrays.asList(Hero.GUINEVERE, Hero.ANGELA, Hero.ESTES, Hero.RAFAELA, Hero.HILDA), Hero.BAXIA,
								true },
						{ Arrays.asList(Hero.ZHASK, Hero.POPOL, Hero.PHARSA, Hero.LAYLA, Hero.GORD, Hero.MYA,
								Hero.CLINT), Hero.LANCELOT, true },
						{ Arrays.asList(Hero.KARRIE, Hero.VEXANA, Hero.VALIR, Hero.ANGELA, Hero.ZHASK), Hero.HYLOS,
								false },
						{ Arrays.asList(Hero.TIGREAL, Hero.GUINEVERE, Hero.SILVANNA, Hero.AKAI, Hero.HYLOS),
								Hero.DIGGIE, true },
						{ Arrays.asList(Hero.HYLOS), Hero.KARRIE, true },
						{ Arrays.asList(Hero.NANA), Hero.NATALIA, true }, { Arrays.asList(Hero.MYA), Hero.XBORG, true },
						{ Arrays.asList(Hero.AKAI), Hero.DIGGIE, true },
						{ Arrays.asList(Hero.AKAI), Hero.MARTIS, true },
						{ Arrays.asList(Hero.AAMON), Hero.SABER, true },
						{ Arrays.asList(Hero.ALDOUS), Hero.ANGELA, true },
						{ Arrays.asList(Hero.ALICE), Hero.BAXIA, true },
						{ Arrays.asList(Hero.ALICE), Hero.BRODY, true }, { Arrays.asList(Hero.ALPHA), Hero.RUBY, true },
						{ Arrays.asList(Hero.ALUCARD), Hero.SUN, true },
						{ Arrays.asList(Hero.ANGELA), Hero.BAXIA, true },
						{ Arrays.asList(Hero.ARGUS), Hero.AKAI, true },
						{ Arrays.asList(Hero.ATLAS), Hero.DIGGIE, true },
						{ Arrays.asList(Hero.AULUS), Hero.LESLEY, true },
						{ Arrays.asList(Hero.AURORA), Hero.HELCURT, true },
						{ Arrays.asList(Hero.GROCK), Hero.KARRIE, true },
						{ Arrays.asList(Hero.GUINEVERE), Hero.MINSITTHAR, true },
						{ Arrays.asList(Hero.LANCELOT), Hero.KAJA, true },
						{ Arrays.asList(Hero.KARINA), Hero.ALUCARD, false },
						{ Arrays.asList(Hero.BAXIA), Hero.BRODY, true }, { Arrays.asList(Hero.SUN), Hero.MYA, true },
						{ Arrays.asList(Hero.CLINT), Hero.BELERICK, true },
						{ Arrays.asList(Hero.BENEDETA), Hero.BELERICK, false },
						{ Arrays.asList(Hero.BELERICK), Hero.LESLEY, true },
						{ Arrays.asList(Hero.MOSKOV), Hero.BELERICK, true },
						{ Arrays.asList(Hero.VALE), Hero.SABER, true }, { Arrays.asList(Hero.VALE), Hero.ZILONG, true },
						{ Arrays.asList(Hero.VALE), Hero.LANCELOT, true },
						{ Arrays.asList(Hero.NATALIA), Hero.AKAI, true },
						{ Arrays.asList(Hero.VALENTINA), Hero.HELCURT, true },
						{ Arrays.asList(Hero.VALENTINA), Hero.POPOL, true },
						{ Arrays.asList(Hero.KARRIE), Hero.BELERICK, true },
						{ Arrays.asList(Hero.ALUCARD), Hero.GUINEVERE, true },
						// { Arrays.asList(Hero.BENEDETA), Hero.SILVANNA, true },
						{ Arrays.asList(Hero.IRITHEL, Hero.MOSKOV, Hero.BRUNO), Hero.BELERICK, true } });

	}

	@Test
	public void get_counters_from_one_hero_sucess_expected() {

		heroService.addPickedHero("akai");
		Map<Role, List<Hero>> result = heroService.getCounterHeroes();

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
		Hero[] heroes = Hero.values();
		for (Hero hero : heroes) {
			heroService.addPickedHero(hero.name());
			result = heroService.getCounterHeroes();
			isEmpty = true;
			for (Role role : result.keySet()) {
				if (!result.get(role).isEmpty())
					isEmpty = false;
			}
			heroService.clearPickedHeroes();
			if (isEmpty)
				throw new Exception(hero + " has no counters");

		}
	}

	@Test
	public void get_counters_from_two_heroes_sucess_expected() {
		heroService.addPickedHero("akai");
		heroService.addPickedHero("alpha");
		Map<Role, List<Hero>> result = heroService.getCounterHeroes();

		assertEquals(false, result.get(Role.TANK).isEmpty());
		assertEquals(false, result.get(Role.MAGE).isEmpty());
	}

	@Test
	public void picking_hero_existing_in_couterList_must_remove_it() {
		heroService.addPickedHero("akai");
		heroService.getCounterHeroes();
		heroService.addPickedHero("esmeralda");
		Map<Role, List<Hero>> result = heroService.getCounterHeroes();

		assertEquals(false, result.get(Role.MAGE).contains(Hero.ESMERALDA));
	}

	@Test
	public void picking_a_hero_that_counters_one_in_counterList_must_remove_it() {
		heroService.addPickedHero("lolita");
		Map<Role, List<Hero>> result = heroService.getCounterHeroes();
		assertEquals(true, result.get(Role.MAGE).contains(Hero.ESMERALDA));
		heroService.addPickedHero("karina");
		result = heroService.getCounterHeroes();
		assertEquals(false, result.get(Role.MAGE).contains(Hero.ESMERALDA));
	}

	@Test
	public void every_hero_must_have_counters_for_every_role_other_than_yours() throws Exception {
		Hero[] heroes = Hero.values();
		for (Hero hero : heroes) {
			heroService.clearPickedHeroes();
			heroService.clearResult();
			heroService.addPickedHero(hero.name());
			Map<Role, List<Hero>> result = heroService.getCounterHeroes();

			for (Entry<Role, List<Hero>> entry : result.entrySet())
				if (entry.getKey() != hero.getRole())
					if (entry.getValue().isEmpty())
						throw new Exception(hero + " does not have sufficient counters " + result);

		}

	}

	@ParameterizedTest
	@MethodSource("heroData")
	public void general(List<Hero> heroList, Hero expectedHero, boolean result) {
		Map<Role, List<Hero>> counters = new HashMap<Role, List<Hero>>();

		for (Hero hero : heroList) {
			heroService.addPickedHero(hero.name());
			counters = heroService.getCounterHeroes();
		}

		assertEquals(result, counters.get(expectedHero.getRole()).contains(expectedHero));
	}
}