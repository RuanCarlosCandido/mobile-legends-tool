package org.proxy;


import java.io.File;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.models.HeroesResponse;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class HeroesDataProxy {

    private final org.apache.log4j.Logger LOGGER = LogManager.getLogger(this.getClass());

    private Map<String, HeroesResponse> data;

    public HeroesDataProxy() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            data = mapper.readValue(new File("heroes.json"), new TypeReference<Map<String, HeroesResponse>>() {});
        } catch (Exception e) {
            LOGGER.error("Error reading 'heroes.json' file", e);
        }
    }

    public Map<String, HeroesResponse> getData(){
        return data;
    }

}
