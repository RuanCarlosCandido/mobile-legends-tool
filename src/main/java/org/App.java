package org;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.apache.log4j.LogManager;
import org.controllers.HeroController;
import org.models.Hero;
import org.models.Role;
import org.utils.Util;

public class App {
	
	private static final org.apache.log4j.Logger LOGGER = LogManager.getLogger(App.class);

	// TODO do the code calculate a build and a proper spell for the enemy team and
	// the player pick
	public static void main(String[] args) {
		Util.printWelcomeMesage();

		Scanner in = new Scanner(System.in);
		String heroPicked = "";

		HeroController heroController = new HeroController();
		Map<Role, List<Hero>> countersHeroes;
		int i = 0;
		while (i < 5) {
			try {
				System.out.println("Entre com o Nome do " + (i + 1) + "º Hero : ");
				heroPicked = in.next().toUpperCase();
				countersHeroes = heroController.getCounterHeroes(heroPicked);
				
				LOGGER.info("Sugestões: " + countersHeroes);
				i++;
				// dont increment in case of error
			} catch (Exception e) {
				LOGGER.error("[ATENCAO]	HERO INVALIDO, DIGITE NOVAMENTE\n");
			}
		}
		in.close();
	}
}
