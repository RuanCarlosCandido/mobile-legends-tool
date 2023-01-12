package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;

import org.facade.BehaviourFacade;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.models.Behaviour;
import org.models.Hero;
import org.models.HeroesResponse;
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
                        { Arrays.asList(Hero.LOLITA, Hero.ANGELA, Hero.HILDA, Hero.URANUS),
                                Arrays.asList(Hero.ESMERALDA) },
                        { Arrays.asList(Hero.ESTES, Hero.RAFAELA, Hero.HILDA), Arrays.asList(Hero.BAXIA) },
                        { Arrays.asList(Hero.TIGREAL, Hero.GUINEVERE, Hero.SILVANNA, Hero.AKAI),
                                Arrays.asList(Hero.DIGGIE) },
                        { Arrays.asList(Hero.HYLOS), Arrays.asList(Hero.KARRIE) },
                        { Arrays.asList(Hero.AAMON),
                                Arrays.asList(Hero.CHOU, Hero.RUBY, Hero.SABER, Hero.FRANCO, Hero.PHOVEUS, Hero.GLOO,
                                        Hero.BAXIA, Hero.LANCELOT, Hero.HAYABUSA) },
                        { Arrays.asList(Hero.AKAI), Arrays.asList(Hero.DIGGIE, Hero.MARTIS, Hero.MELISSA) },
                        { Arrays.asList(Hero.ALICE), Arrays.asList(Hero.BAXIA) },
                        { Arrays.asList(Hero.ANGELA, Hero.FREYA, Hero.HILDA), Arrays.asList(Hero.BAXIA) },
                        { Arrays.asList(Hero.ALICE), Arrays.asList(Hero.BRODY) },
                        { Arrays.asList(Hero.ALUCARD), Arrays.asList(Hero.SUN) },
                        { Arrays.asList(Hero.BARATS), Arrays.asList(Hero.XBORG, Hero.THAMUZ, Hero.KARRIE) },
                        { Arrays.asList(Hero.CLINT, Hero.MOSKOV), Arrays.asList(Hero.BELERICK) },
                        { Arrays.asList(Hero.VALE), Arrays.asList(Hero.SABER) },
                        { Arrays.asList(Hero.VALENTINA), Arrays.asList(Hero.HELCURT) },
                        { Arrays.asList(Hero.ALUCARD), Arrays.asList(Hero.GUINEVERE) },
                        { Arrays.asList(Hero.ODETTE), Arrays.asList(Hero.SABER) },
                        { Arrays.asList(Hero.LOLITA), Arrays.asList(Hero.MINSITTHAR) },
                        { Arrays.asList(Hero.HARLEY), Arrays.asList(Hero.SILVANNA) },
                        { Arrays.asList(Hero.CHANGE), Arrays.asList(Hero.LOLITA) },
                        { Arrays.asList(Hero.MATHILDA), Arrays.asList(Hero.LAYLA) },
                        { Arrays.asList(Hero.SILVANNA), Arrays.asList(Hero.KADITA) },
                        { Arrays.asList(Hero.LESLEY,Hero.SABER,Hero.EUDORA), Arrays.asList(Hero.HYLOS) },
                        { Arrays.asList(Hero.AURORA, Hero.EUDORA), Arrays.asList(Hero.HELCURT) },
                        { Arrays.asList(Hero.ZILONG), Arrays.asList(Hero.BELERICK) },
                        { Arrays.asList(Hero.BADANG), Arrays.asList(Hero.LANCELOT) },
                        { Arrays.asList(Hero.IRITHEL, Hero.MOSKOV, Hero.BRUNO), Arrays.asList(Hero.BELERICK) } });

    }

    @Test
    public void all_heroes_must_have_counters_sucess_expected() throws Exception {

        Map<String, List<String>> result = null;
        boolean isEmpty = true;
        Hero[] heroes = Hero.values();
        for (Hero hero : heroes) {
            heroService.addPickedHero(hero.name());
            result = heroService.getCounterHeroes();
            isEmpty = true;
            for (String role : result.keySet()) {
                if (!result.get(role).isEmpty())
                    isEmpty = false;
            }
            heroService.clearPickedHeroes();
            if (isEmpty)
                throw new Exception(hero + " has no counters");

        }
    }

    @Test
    public void get_counters_from_one_hero_sucess_expected() {
        heroService.addPickedHero("akai");
        Map<String, List<String>> result = heroService.getCounterHeroes();

        assertEquals(false, result.get("soldier").isEmpty());
    }
    
    @Test
    public void get_counters_from_two_heroes_sucess_expected() {
        heroService.addPickedHero("akai");
        heroService.addPickedHero("alpha");
        Map<String, List<String>> result = heroService.getCounterHeroes();

        assertEquals(true, Optional.ofNullable(result.get("tank")).isPresent());
        assertEquals(true, Optional.ofNullable(result.get("mage")).isPresent());
    }

    @Test
    public void picking_hero_existing_in_couterList_must_remove_it() {
        heroService.addPickedHero("akai");
        heroService.getCounterHeroes();
        heroService.addPickedHero("esmeralda");
        heroService.getCounterHeroes();

    }

    @Test
    public void picking_a_hero_that_counters_one_in_counterList_must_remove_it() {
        heroService.addPickedHero("lolita");
        Map<String, List<String>> result = heroService.getCounterHeroes();
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
            Map<String, List<String>> result = heroService.getCounterHeroes();

            if (result.values().stream().anyMatch(list -> list.isEmpty())) 
                throw new Exception(hero + " does not have sufficient counters " + result + "\nweak againts: "
                        + hero.getWeaknesses() + "\nstrong against :" + BehaviourFacade.strongAgainst(hero));
            
        }

    }

    @ParameterizedTest
    @MethodSource("heroData")
    public void general(List<Hero> heroList, List<Hero> expectedCounterHeroes) throws Exception {
        Map<String, List<String>> counters = new HashMap<>();

        for (Hero hero : heroList) {

            boolean isCounter = false;

            heroService.addPickedHero(hero.name());
            counters = heroService.getCounterHeroes();

            for (Entry<String, List<String>> calculatedEntry : counters.entrySet()) {
                if (expectedCounterHeroes.stream().anyMatch(calculatedEntry.getValue()::contains)) {
                    isCounter = true;
                }
            }
            if (!isCounter) {
                throw new Exception(descreverMotivo(expectedCounterHeroes, hero));
            }
        }
    }


    /**
     * @param expectedCounterHeroes
     * @param hero
     * @return
     */
    private String descreverMotivo(List<Hero> expectedCounterHeroes, Hero hero) {
        StringBuilder result = new StringBuilder();

        List<Behaviour> heroStrengths = hero.getStrengths();

        for (Hero counterHero : expectedCounterHeroes) {
            Set<Behaviour> counterHeroWeaknesses = counterHero.getWeaknesses();

            for (Behaviour counterHeroWeakness : counterHeroWeaknesses) {
                for (Behaviour heroStrength : heroStrengths) {
                    if (canHeroCounterTheExpectedCounter(counterHeroWeakness, heroStrength)) {
                        result.append(hero + " has ");
                        result.append(counterHeroWeakness + " and this is one of the weaknesses of ");
                        result.append(counterHero + "\n");

                        List<Behaviour> counterHeroStrengths = counterHero.getStrengths();
                        for (Behaviour counterHeroStrength : counterHeroStrengths) {
                            if (counterHeroStrength.getWeaknesses().contains(heroStrength)) {
                                result.append(counterHero + " shas " + counterHeroStrength
                                        + " and this behaviour has the following weaknesses: "
                                        + counterHeroStrength.getWeaknesses());
                            }
                        }
                    }

                }
            }

        }
//TODO adicionar na mensagem o caso de o counter não ter nenhuma força contra as fraquezas do heroi a ser counterado
        return result.toString();

    }

    /**
     * @param counterHeroWeakness
     * @param heroStrength
     * @return
     */
    private boolean canHeroCounterTheExpectedCounter(Behaviour counterHeroWeakness, Behaviour heroStrength) {
        return counterHeroWeakness.equals(heroStrength);
    }
    
    
    @Test
    public void testBuildWeaknesses() {
    
        List<Behaviour> strengths = new ArrayList<>();
        strengths.add(Behaviour.SHIELD);
        
        Set<Behaviour> weaknesses = BehaviourFacade.buildWeaknesses(strengths);

        Behaviour expectedWeakness = Behaviour.SHIELD_STEALING;
        
        assertTrue(weaknesses.contains(expectedWeakness));
    }
    
    
}