package org.models;

import java.util.HashMap;
import java.util.Map;

public class HeroesData {

    private Map<String, Hero> data = new HashMap<>();

    public void setData(Map<String, Hero> data) {
        this.data = data;
    }

    public Hero getHeroInfo(String heroName) {
        return data.get(heroName);
    }

    public boolean isEmpty() {
        return data == null || data.isEmpty();
    }
}
