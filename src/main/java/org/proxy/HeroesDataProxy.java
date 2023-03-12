package org.proxy;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.models.HeroesResponse;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

/**
 * This class provides access to heroes data by deserializing the JSON file into
 * a list of HeroesResponse objects.
 */
public class HeroesDataProxy {

    private final Logger logger = LogManager.getLogger(this.getClass());

    private Map<String, HeroesResponse> data;

    /**
     * Creates a new instance of HeroesDataProxy and loads the data from the JSON
     * file.
     */
    public HeroesDataProxy() {
        ObjectMapper objectMapper = new ObjectMapper();
        CollectionType typeReference = objectMapper.getTypeFactory().constructCollectionType(List.class,
                HeroesResponse.class);
        InputStream inputStream = TypeReference.class.getResourceAsStream("/heroes_with_counters.json");
        try {
            String json = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
            List<HeroesResponse> heroesList = objectMapper.readValue(json, typeReference);
            heroesList.forEach(hero -> hero.setName(hero.getName()
                    .toLowerCase()
                    .replace("_", "")
                    .replace("-", "")
                    .replace(".", "")));
            data = new HashMap<String, HeroesResponse>();
            heroesList.forEach(hero -> data.put(
                    hero.getName()
                            .toLowerCase()
                            .replace("_", "")
                            .replace("-", "")
                            .replace(".", ""),
                    hero));

            logger.info("Heroes data loaded successfully");
        } catch (IOException e) {
            logger.error("Failed to read heroes.json", e);
            data = Collections.emptyMap();
        }
    }

    /**
     * Returns the list of heroes data. If an error occurred during initialization,
     * an empty list is returned.
     * 
     * @return The list of heroes data.
     */
    public Map<String, HeroesResponse> getData() {
        return data;
    }

}