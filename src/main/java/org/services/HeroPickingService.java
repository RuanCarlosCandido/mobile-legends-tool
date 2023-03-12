package org.services;

import java.util.ArrayList;
import java.util.List;

public class HeroPickingService {

    private List<String> pickedHeroes;

    public HeroPickingService() {
        this.pickedHeroes = new ArrayList<>();
    }

    public void addPickedHero(String pickedHero) {
        pickedHeroes.add(pickedHero);
    }

    public void clearPickedHeroes() {
        pickedHeroes.clear();
    }

    public List<String> getPickedHeroes() {
        return pickedHeroes;
    }

    public String getLastPickedHero() {
        return pickedHeroes.get(pickedHeroes.size() - 1);
    }

}
