package test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.models.HeroesResponse;
import org.services.HeroService;

public class HeroServiceTest {

    private HeroService heroService;

    @Mock
    private Map<String, HeroesResponse> mockHeroesData;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        heroService = new HeroService();
        heroService.setHeroesData(mockHeroesData);
    }

    @Test
    public void testGetCounterHeroes() {
        // Create some test data
        HeroesResponse hero1 = new HeroesResponse("alice", "Mage |  Tank", "Mid Laner", "Mid Laner", Arrays.asList("karrie", "Ruby"));
        HeroesResponse hero2 = new HeroesResponse("nana", "Mage |  Support", "Mid Laner", "laning2", Arrays.asList("alice"));

        Map<String, HeroesResponse> heroesData = new HashMap<>();
        heroesData.put("alice", hero1);
        heroesData.put("nana", hero2);

        heroService.setHeroesData(heroesData);

        // Set the pickedHeroes list
        heroService.addPickedHero("nana");
//        heroService.addPickedHero("alice");
        
        

        // Set the expected result
        Map<String, List<String>> expectedResult = new HashMap<>();
        expectedResult.put("mage", Arrays.asList("alice"));
        expectedResult.put("tank", Arrays.asList("alice"));

        
        // Test the method
        Map<String, List<String>> actualResult = heroService.getCounterHeroes();
        assertEquals(expectedResult, actualResult);

        // Verify that getHeroesData was called
        verify(mockHeroesData, times(3)).get(anyString());
    }

    @Test
    public void testGetCounterHeroesEmptyData() {
        // Set an empty heroes data map
        Map<String, HeroesResponse> heroesData = new HashMap<>();
        heroService.setHeroesData(heroesData);

        // Set the pickedHeroes list
        heroService.addPickedHero("nana");
        heroService.addPickedHero("alice");
        

        // Set the expected result
        Map<String, List<String>> expectedResult = new HashMap<>();

        // Test the method
        assertEquals(expectedResult, heroService.getCounterHeroes());

        // Verify that getHeroesData was not called
        verify(mockHeroesData, never()).get(anyString());
    }
    
    @Test
    public void testGetCounterHeroes2() {
        HeroService heroService = new HeroService();
        heroService.addPickedHero("gord");
        heroService.addPickedHero("alice");                    
        Map<String, List<String>> counterHeroes = heroService.getCounterHeroes();
        assertNotNull(counterHeroes);
        assertEquals(5, counterHeroes.size());
        assertTrue(counterHeroes.containsKey("Fighter"));
        assertTrue(counterHeroes.containsKey("Tank"));
        assertTrue(counterHeroes.containsKey("Assassin"));
        assertTrue(counterHeroes.containsKey("Marksman"));
        assertTrue(counterHeroes.containsKey("Mage"));
        List<String> fighterCounters = counterHeroes.get("Fighter");
        assertNotNull(fighterCounters);
        assertEquals(4, fighterCounters.size());
        assertTrue(fighterCounters.containsAll(Arrays.asList("Ruby", "Gusion", "Helcurt", "Fanny")));
    }

}