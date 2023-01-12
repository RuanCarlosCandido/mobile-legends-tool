package org.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class HeroesResponse {
    private final List<String> behaviours;
    private final String role;

    public HeroesResponse(@JsonProperty("role") String role, @JsonProperty("behaviours") List<String> behaviours) {
        this.behaviours = behaviours;
        this.role = role;
    }

    public List<String> getBehaviours() {
        return behaviours;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "HeroesResponse [behaviours=" + behaviours + ", role=" + role + "]";
    }

}
