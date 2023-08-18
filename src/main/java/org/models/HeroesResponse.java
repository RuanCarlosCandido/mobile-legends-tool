package org.models;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HeroesResponse {
    private String name;
    private final String roles;
    private final String specialties;
    private final String laning;
    private final List<String> counters;

    public HeroesResponse(
            @JsonProperty("Name") String name,
            @JsonProperty("Role(s)") String roles,
            @JsonProperty("Specialties") String specialties,
            @JsonProperty("Laning") String laning,
            @JsonProperty("counters") List<String> counters) {
        this.name = Optional.ofNullable(name).orElse("").toLowerCase();
        this.roles = Optional.ofNullable(roles).orElse("").toLowerCase();
        this.specialties = Optional.ofNullable(specialties).orElse("").toLowerCase();
        this.laning = Optional.ofNullable(laning).orElse("").toLowerCase();
        this.counters = Optional.ofNullable(counters).orElse(Collections.emptyList()).stream()
                .map(String::toLowerCase)
                .map(counter -> counter.replaceAll("\\s", ""))
                .map(counter -> counter.replaceAll("[-_.']", ""))
                .collect(Collectors.toList());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public List<String> getRoles() {
        return Optional.ofNullable(roles)
            .map(r -> Arrays.asList(r.split("\\|")))
            .orElseGet(() -> Arrays.asList())
            .stream()
            .map(String::trim)
            .map(String::toLowerCase)
            .collect(Collectors.toList());
    }

    public List<String> getSpecialties() {
        return Optional.ofNullable(specialties)
            .map(s -> Arrays.asList(s.split("\\|")))
            .orElseGet(() -> Arrays.asList())
            .stream()
            .map(String::trim)
            .map(String::toLowerCase)
            .collect(Collectors.toList());
    }
    
    public String getLaning() {
        return Optional.ofNullable(laning).orElse("").toLowerCase();
    }

    public List<String> getCounters() {
        return counters;
    }

    @Override
    public String toString() {
        return "HeroesResponse [name=" + name + ", roles=" + roles + ", specialties=" + specialties + ", laning="
                + laning + ", counters=" + counters + "]";
    }

}