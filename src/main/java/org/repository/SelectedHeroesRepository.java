package org.repository;

import java.util.ArrayList;
import java.util.List;

public class SelectedHeroesRepository {

    private List<String> selectedHeroes;

    public SelectedHeroesRepository() {
        this.selectedHeroes = new ArrayList<>();
    }

    public void addSelectedHero(String pickedHero) {
        selectedHeroes.add(pickedHero);
    }

    public void clearSelectedHeroes() {
        selectedHeroes.clear();
    }

    public List<String> getSelectedHeroes() {
        return selectedHeroes;
    }

    public String getLastSelectedHero() {
        return selectedHeroes.get(selectedHeroes.size() - 1);
    }

}
