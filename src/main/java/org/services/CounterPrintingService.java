package org.services;

import java.util.List;
import java.util.Map;

public class CounterPrintingService {

    public void printCounters(Map<String, List<String>> counters) {
        counters.forEach((role, countersList) -> System.out.println(role + ": " + countersList));
    }
    
}
