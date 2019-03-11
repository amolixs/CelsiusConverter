package be.amolixs.app;

import be.amolixs.menu.Menu;

/**
 * Classe qui gère le programme contient les méthodes à son bon
 * fonctionnement.
 * @version 1.0
 * @author amolixs
 */

public class Application {
	/**
	 * Object représentant le menu.
	 * @author amolixs
	 */
	private Menu menu;
	
	/**
	 * Constructeur.
	 * @author amolixs
	 */
	public Application() {
		this.menu = new Menu();
	}
	
	/**
	 * Méthode qui permet de lancer le programme.
	 * @author amolixs
	 */
	public void run() {
		menu.run();
	}
}
