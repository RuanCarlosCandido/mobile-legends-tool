package org.controllers;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class HeroControllerTest {

//    @Mock
//    private HeroService heroService;
//    @Mock
//    private CounterPrintingService counterPrintingService;
//    @InjectMocks
//    private HeroController heroController;
//
//    @BeforeEach
//    public void setup() {
//    }
//
//    @Test
//    public void testAddPickedHero() {
//        String heroName = "Belerick";
//
//        when(heroService.getHeroesData())
//                .thenReturn(Collections.singletonMap(heroName, createHeroesResponse(heroName)));
//
//        heroController.addPickedHero(heroName);
//
//        List<String> pickedHeroes = heroController.getPickedHeroes();
//        assert(pickedHeroes.size() == 1);
//        assert(pickedHeroes.get(0).equals(heroName));
//    }
//
//    public Hero createHeroesResponse(String name) {
//        String roles = "Marksman";
//        String specialties = "Reap | Damage";
//        String laning = "Gold Laner";
//        List<String> counters = Arrays.asList("Natalia", "Alucard", "Clint", "Layla", "Eudora", "Zilong");
//
//        return new Hero(name, roles, specialties, laning, counters);
//    }
//    
//    @Test
//    public void testAddPickedHero_invalid() {
//        String heroName = "InvalidHero";
//        when(heroService.getHeroesData()).thenReturn(Collections.emptyMap());
//        assertThrows(UnknownHeroException.class, () -> heroController.addPickedHero(heroName));
//        List<String> pickedHeroes = heroController.getPickedHeroes();
//        assertTrue(pickedHeroes.isEmpty());
//    }
//    
//    @Test
//    public void testGetCounterHeroes() {
//        Map<String, List<String>> counterHeroes = Collections.singletonMap(
//                "Belerick", Arrays.asList("Natalia", "Alucard", "Clint", "Layla", "Eudora", "Zilong"));
//        when(heroService.getCounterHeroes()).thenReturn(counterHeroes);
//        assertEquals(counterHeroes, heroController.getCounterHeroes());
//    }
//    
//    @Test
//    public void testPrintCounters() {
//        Map<String, List<String>> counterHeroes = Collections.singletonMap(
//                "Belerick", Arrays.asList("Natalia", "Alucard", "Clint", "Layla", "Eudora", "Zilong"));
//        heroController.printCounters(counterHeroes);
//        verify(counterPrintingService).printCounters(counterHeroes);
//    }
    
}
