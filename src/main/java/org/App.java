package org;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.controllers.HeroController;
import org.models.Hero;
import org.models.Role;
import org.utils.Util;

public class App {

	public static void main(String[] args) {
		Util.printWelcomeMesage();
		// PRECISO IMPLEMENTAR MAIS UMA FEATURE
		// REMOVER DA LISTA DE COUNTERS SE ALGUM HEROI DE LA FOR SELECIONADO
		Scanner in = new Scanner(System.in);
		String heroPicked = in.next().toUpperCase();
		
		
		HeroController heroController = new HeroController();
		Map<Role, List<Hero>> countersHeroes;
		int i = 0;
		while (i < 5) {
			try {
				System.out.println("Entre com o Nome do " + (i + 1) + "º Hero : ");
				countersHeroes = heroController.getCounterHeroes(heroPicked);
				System.out.println(countersHeroes);
				i++;
				// dont increment in case of error
			} catch (Exception e) {
				System.err.println(
						"\n[ATENCAO]	HERO INVALIDO\n");
			}
		}
		in.close();
	}
}
