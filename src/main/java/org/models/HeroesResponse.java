package org.models;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HeroesResponse {
    private final String name;
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
        this.name = Optional.ofNullable(name).orElse("");
        this.roles = Optional.ofNullable(roles).orElse("");
        this.specialties = Optional.ofNullable(specialties).orElse("");
        this.laning = Optional.ofNullable(laning).orElse("");
        this.counters = Optional.ofNullable(counters).orElse(Collections.emptyList());
    }

    public String getName() {
        return Optional.ofNullable(name).orElse("").toLowerCase();
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
        return counters.stream()
                .map(String::toLowerCase)
                .map(counter -> counter.replaceAll("\\s", ""))
                .map(counter -> counter.replaceAll("[-_]", ""))
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "HeroesResponse [name=" + name + ", roles=" + roles + ", specialties=" + specialties + ", laning="
                + laning + ", counters=" + counters + "]";
    }

}