package org.proxy;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.models.HeroesResponse;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * This class provides access to heroes data by deserializing the JSON file into
 * a list of HeroesResponse objects.
 */
public class HeroesDataProxy {

    private static final Logger logger = LogManager.getLogger(HeroesDataProxy.class);
    private Map<String, HeroesResponse> data = new HashMap<>();

    public HeroesDataProxy() {
        loadData();
    }

    private void loadData() {
        var objectMapper = new ObjectMapper();
        var typeReference = new TypeReference<List<HeroesResponse>>() {};
        try (InputStream inputStream = getClass().getResourceAsStream("/heroes_with_counters.json")) {
            List<HeroesResponse> heroesList = objectMapper.readValue(inputStream, typeReference);
            data = heroesList.stream()
                    .peek(hero -> hero.setName(hero.getName().toLowerCase().replaceAll("[_\\-.'']", "")))
                    .collect(Collectors.toMap(HeroesResponse::getName, hero -> hero, (hero1, hero2) -> hero1));
            logger.info("Heroes data loaded successfully");
        } catch (Exception e) {
            logger.error("Failed to read heroes.json", e);
        }
    }

    public Map<String, HeroesResponse> getData() {
        return new HashMap<>(data);
    }
}