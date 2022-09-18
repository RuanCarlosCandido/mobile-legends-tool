package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.facade.BehaviourFacade;
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
					{ Arrays.asList(Hero.LOLITA, Hero.ANGELA, Hero.HILDA, Hero.URANUS), Arrays.asList(Hero.ESMERALDA) },
					{ Arrays.asList(Hero.ESTES, Hero.RAFAELA, Hero.HILDA), Arrays.asList(Hero.BAXIA)},
					{ Arrays.asList(Hero.TIGREAL, Hero.GUINEVERE, Hero.SILVANNA, Hero.AKAI, Hero.HYLOS), Arrays.asList(Hero.DIGGIE) },
					{ Arrays.asList(Hero.HYLOS), Arrays.asList(Hero.KARRIE) },
					{ Arrays.asList(Hero.AAMON), Arrays.asList(Hero.CHOU,Hero.RUBY,Hero.SABER,Hero.FRANCO,Hero.PHOVEUS,Hero.GLOO,Hero.BAXIA,Hero.LANCELOT,Hero.HAYABUSA) },
					{ Arrays.asList(Hero.AKAI), Arrays.asList(Hero.DIGGIE,Hero.MARTIS,Hero.MELISSA) },
					{ Arrays.asList(Hero.ALICE), Arrays.asList(Hero.BAXIA) },
					{ Arrays.asList(Hero.ALICE), Arrays.asList(Hero.BRODY) },
					{ Arrays.asList(Hero.ALUCARD), Arrays.asList(Hero.SUN) },
					{ Arrays.asList(Hero.BARATS), Arrays.asList(Hero.XBORG,Hero.THAMUZ, Hero.KARRIE, Hero.CLINT) },
					{ Arrays.asList(Hero.CLINT), Arrays.asList(Hero.BELERICK) },
					{ Arrays.asList(Hero.LAYLA), Arrays.asList(Hero.ALUCARD) },
					{ Arrays.asList(Hero.BAXIA), Arrays.asList(Hero.FLORYN) },
					{ Arrays.asList(Hero.BELERICK), Arrays.asList(Hero.LESLEY) },
					{ Arrays.asList(Hero.MOSKOV), Arrays.asList(Hero.BELERICK) },
					{ Arrays.asList(Hero.VALE), Arrays.asList(Hero.SABER) },
					{ Arrays.asList(Hero.VALENTINA), Arrays.asList(Hero.HELCURT) },
					{ Arrays.asList(Hero.ALUCARD), Arrays.asList(Hero.GUINEVERE) },
					{ Arrays.asList(Hero.ODETTE), Arrays.asList(Hero.SABER) },
					{ Arrays.asList(Hero.LOLITA), Arrays.asList(Hero.MINSITTHAR) },
					{ Arrays.asList(Hero.DIGGIE), Arrays.asList(Hero.HILDA) },
					{ Arrays.asList(Hero.HARLEY), Arrays.asList(Hero.SILVANNA) },
					{ Arrays.asList(Hero.CHANGE), Arrays.asList(Hero.LOLITA) },
					{ Arrays.asList(Hero.MATHILDA), Arrays.asList(Hero.LAYLA) },
					{ Arrays.asList(Hero.DIGGIE), Arrays.asList(Hero.FRANCO) },
					{ Arrays.asList(Hero.SILVANNA), Arrays.asList(Hero.KADITA) },
					{ Arrays.asList(Hero.AURORA, Hero.EUDORA), Arrays.asList(Hero.HELCURT) },
					{ Arrays.asList(Hero.IRITHEL, Hero.MOSKOV, Hero.BRUNO), Arrays.asList(Hero.BELERICK) } });

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
		assertEquals(true, result.get(Hero.ESMERALDA.getRole()).contains(Hero.ESMERALDA));
		heroService.addPickedHero("karina");
		result = heroService.getCounterHeroes();
		assertEquals(false, result.get(Hero.ESMERALDA.getRole()).contains(Hero.ESMERALDA));
	}

	@Test
	public void every_hero_must_have_counters_for_every_role() throws Exception {
		Hero[] heroes = Hero.values();
		for (Hero hero : heroes) {
			heroService.clearPickedHeroes();
			heroService.clearResult();
			heroService.addPickedHero(hero.name());
			Map<Role, List<Hero>> result = heroService.getCounterHeroes();

			for (Entry<Role, List<Hero>> entry : result.entrySet())
				//				if (entry.getKey() != hero.getRole())
				if (entry.getValue().isEmpty()) {
					
					throw new Exception(hero + " does not have sufficient counters " + result + "\nweak againts: " + hero.getWeaknesses() 
					+"\nstrong against :" + BehaviourFacade.strongAgainst(hero));
				}
		}

	}



	@ParameterizedTest
	@MethodSource("heroData")
	public void general(List<Hero> heroList, List<Hero> expectedCounterHeroes) throws Exception {
		Map<Role, List<Hero>> counters = new HashMap<Role, List<Hero>>();

		for (Hero hero : heroList) {
			heroService.addPickedHero(hero.name());
			counters = heroService.getCounterHeroes();
		}

		for (Hero counterHero : expectedCounterHeroes) {
			if(!counters.get(counterHero.getRole()).contains(counterHero)) {
				throw new Exception(counterHero + " doesnt exists in counter list \nweaknesses :" + counterHero.getWeaknesses() +"\nstrong against :" + BehaviourFacade.strongAgainst(counterHero));
			}
		}

	}
}