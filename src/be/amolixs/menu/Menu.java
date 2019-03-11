package be.amolixs.menu;

import java.util.Scanner;

/**
 * Classe qui gère le menu du programme.
 * @version 1.0
 * @author amolixs
 */

public class Menu {
	
	/**
	 * Méthode qui permet de lancer le menu
	 * @author amolixs
	 */
	public void run() {
		int choix = 0;
		do {
			print();
			choix = getChoice();
			choiceManagement(choix);
		}while(choix != 3);
	}

	/**
	 * Méthode qui affiche le menu dans la console.
	 * @author amolixs
	 */
	void print() {
		System.out.println("1- Convertisseur Celsius - Fahrenheit");
		System.out.println("2- Convertisseur Fahrenheit - Celsius");
		System.out.println("3- Quit");
		System.out.println("[*] Votre choix : ");
	} 
	
	/**
	 * Méthode qui permet de récupérer et renvoyé le choix d'option de l'utilisateur.
	 * @author amolixs
	 * @return
	 * 		Choix options entré par l'utilisateur
	 */
	int getChoice() {
		Scanner sc = new Scanner(System.in);
		int choix = sc.nextInt();
		return choix;
	}
	
	/**
	 * Méthode qui permet de gérer les options en fonction du choix rentré.
	 * @author amolixs
	 * @param choice
	 * 		Choix entré par l'utilisateur
	 */
	void choiceManagement(int choice) {
		switch (choice) {
			case 3:
				System.out.println("Merci et à bientot :) !");
			break;
			
			default : 
				System.out.println("Veuillez entrez une options valide svp !");
			break;
		}
	}
}
