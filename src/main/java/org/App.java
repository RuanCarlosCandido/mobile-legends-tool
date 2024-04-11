package org;

import static org.utils.Util.printWelcomeMesage;

import java.util.Scanner;

import org.apache.log4j.LogManager;
import org.services.HeroSelectionService;

public class App {

    private static final org.apache.log4j.Logger LOGGER = LogManager.getLogger(App.class);

    // TODO do the code calculate a build and a proper spell for the enemy team and
    // the player pick
    public static void main(String[] args) {

        printWelcomeMesage();

        runHeroSelectionProcess();

    }

    private static void runHeroSelectionProcess() {
        try (Scanner scanner = new Scanner(System.in)) {
            HeroSelectionService heroSelection = new HeroSelectionService(scanner);
            heroSelection.selectHeroes();
        } catch (Exception e) {
            LOGGER.error("An error occurred during the hero selection process.", e);
        }
    }
}