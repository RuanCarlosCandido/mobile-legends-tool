package org.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.models.HeroesResponse;

public class HeroCounterServiceTest {
    @Test
    public void testGetCounters() {
        // create mock heroes data
        HeroesResponse layla = new HeroesResponse("Layla", "Marksman", null, null, Arrays.asList("Clint"));
        HeroesResponse clint = new HeroesResponse("Clint", "Marksman", null, null, Arrays.asList("Karina"));
        HeroesResponse karina = new HeroesResponse("Karina", "Assassin", null, null, Collections.emptyList());
        Map<String, HeroesResponse> heroesData = new LinkedHashMap<>();
        heroesData.put("Layla", layla);
        heroesData.put("Clint", clint);
        heroesData.put("Karina", karina);

        // create mock data for HeroCounterService constructor arguments
        Map<String, List<String>> countersMapResult = new LinkedHashMap<>();
        List<String> pickedHeroes = new ArrayList<>();

        // create HeroCounterService instance with mocked dependencies
        HeroCounterService service = new HeroCounterService(heroesData, countersMapResult, pickedHeroes);

        // test getCounters() with "Layla" as input
        Map<String, List<String>> result1 = service.getCounters("Layla");
        assertEquals(2, result1.size());
        assertEquals(Arrays.asList("Clint"), result1.get("Marksman"));

        // add "Karina" to pickedHeroes list
        pickedHeroes.add("Karina");

        // test getCounters() with "Karina" as input
        Map<String, List<String>> result2 = service.getCounters("Karina");
        assertEquals(6, result2.size());
        assertEquals(Collections.emptyList(), result2.get("Marksman"));
}
}
    