package org;

import static org.utils.Util.printWelcomeMesage;

import java.util.Scanner;

import org.apache.log4j.LogManager;
import org.controllers.EquipmentController;
import org.controllers.HeroController;


public class App {
	
	private static final org.apache.log4j.Logger LOGGER = LogManager.getLogger(App.class);

	// TODO do the code calculate a build and a proper spell for the enemy team and
	// the player pick
	
	public static void main(String[] args) {
		
		printWelcomeMesage();

		Scanner in = new Scanner(System.in);

		HeroController heroController = new HeroController();
		int i = 0;
		while (i < 5) {
			try {
				System.out.println("Entre com o Nome do " + (i + 1) + "º Hero : ");
		
				heroController.addPickedHero(in.next().toUpperCase());
				
				// LOGGER.info("Sugestões: " + countersHeroes);
				heroController.getCounterHeroes().entrySet().forEach(System.out::println);
				i++;
				
			} catch (Exception e) {// dont increment in case of error
				LOGGER.error("[ATENCAO]	HERO INVALIDO, DIGITE NOVAMENTE\n");
			}
		}
		in.close();
		System.out.println("\n---------------------EQUIPS-----------------------------------");
		EquipmentController equipController = new EquipmentController();
		equipController.setPickedHeroes(heroController.getPickedHeroes());
		equipController.getCounterEquipments().entrySet().forEach(System.out::println);;
	}
}
