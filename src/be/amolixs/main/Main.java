package be.amolixs.main;

import be.amolixs.app.Application;

/**
 * Classe principal du programme.
 * @version 1.0
 * @author amolixs
 */

public class Main {

	/**
	 * Méthode principal du programme.
	 * @author amolixs
	 * @param args
	 * 		Tableau de String contenant les arguments passé au programme
	 */
	public static void main(String[] args) {
		Application app = new Application();
		app.run();
	}
}
