package org.proxy;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.LogManager;
import org.models.BehaviourResponse;

import java.io.File;
import java.util.Map;

public class BehavioursDataProxy {

    private final org.apache.log4j.Logger LOGGER = LogManager.getLogger(this.getClass());

    private Map<String, BehaviourResponse> data;

    public BehavioursDataProxy() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            data = mapper.readValue(new File("behaviours.json"), new TypeReference<Map<String, BehaviourResponse>>() {});
        } catch (Exception e) {
            LOGGER.error("Error reading 'behaviours.json' file", e);
        }
    }

    public Map<String, BehaviourResponse> getData(){
        return data;
    }

}
