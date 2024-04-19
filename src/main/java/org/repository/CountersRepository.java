package org.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountersRepository {
    Map<String, List<String>> counters;

    public CountersRepository() {
        if (counters == null)
            counters = new HashMap<>();
    }

    public Map<String, List<String>> getCounters() {
        return counters;
    }

    public void setCounters(Map<String, List<String>> counters) {
        this.counters = counters;
    }

}