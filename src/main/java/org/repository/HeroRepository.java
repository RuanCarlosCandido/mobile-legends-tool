package org.repository;

import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.models.Hero;
import org.models.HeroesData;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * This class provides access to heroes data by deserializing the JSON file into
 * a list of HeroesResponse objects.
 */
public class HeroRepository {

    private static final Logger logger = LogManager.getLogger(HeroRepository.class);
    private HeroesData heroesData = new HeroesData();

    public HeroRepository() {
    }

    public void loadData() {
        var objectMapper = new ObjectMapper();
        var typeReference = new TypeReference<List<Hero>>() {
        };
        try (InputStream inputStream = getClass().getResourceAsStream("/heroes_with_counters.json")) {
            List<Hero> heroesList = objectMapper.readValue(inputStream, typeReference);
            Map<String, Hero> data = heroesList.stream()
                    .peek(hero -> hero.setName(normalizeName(hero)))
                    .collect(Collectors.toMap(Hero::getName, Function.identity(), (hero1, hero2) -> hero1));

            heroesData.setData(data);
            logger.info("Heroes data loaded successfully");
        } catch (Exception e) {
            logger.error("Failed to read heroes.json", e);
        }
    }

    /**
     * @param hero
     * @return
     */
    private String normalizeName(Hero hero) {
        return hero.getName().toLowerCase().replaceAll("[_\\-.'']", "");
    }

    public HeroesData getHeroesData() {

        if (heroesData.isEmpty())
            loadData();

        return heroesData;
    }

}