package org.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class BehaviourResponse {
    private final List<String> weakAgainst;
    private final List<String> strongAgainst;

    public BehaviourResponse(@JsonProperty("weak_against") List<String> weakAgainst,
                             @JsonProperty("strong_against") List<String> strongAgainst) {
        this.weakAgainst = weakAgainst;
        this.strongAgainst = strongAgainst;
    }

    public List<String> getWeakAgainst() {
        return weakAgainst;
    }

    public List<String> getStrongAgainst() {
        return strongAgainst;
    }
}