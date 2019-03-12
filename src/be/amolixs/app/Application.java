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
		printLogo();
		menu.run();
	}
	
	/**
	 * Méthode qui permet d'affiché le logo
	 * @author amolixs
	 */
	void printLogo() {	
		System.out.println("###########################################################################################################################");
		System.out.println("    _____ ______ _       _____ _____ _    _  _____ ");                                                 
		System.out.println("   / ____|  ____| |     / ____|_   _| |  | |/ ____|");                                                 
		System.out.println("  | |    | |__  | |    | (___   | | | |  | | (___   ");                                                 
	    System.out.println("  | |    |  __| | |     \\___ \\  | | | |  | |\\___ \\  ");                                                
	    System.out.println("  | |____| |____| |____ ____) |_| |_| |__| |____) | ");                                                
	    System.out.println("   \\_____|______|______|_____/|_____|\\____/|_____/_ _______ _____  _____ _____ ______ _    _ _____  ");
	    System.out.println("           / ____/ __ \\| \\ | \\ \\    / /  ____|  __ \\__   __|_   _|/ ____/ ____|  ____| |  | |  __ \\ ");
	    System.out.println("          | |   | |  | |  \\| |\\ \\  / /| |__  | |__) | | |    | | | (___| (___ | |__  | |  | | |__) |");
	    System.out.println("          | |   | |  | | . ` | \\ \\/ / |  __| |  _  /  | |    | |  \\___ \\___ \\|  __| | |  | |  _  / ");
	    System.out.println("          | |___| |__| | |\\  |  \\  /  | |____| | \\ \\  | |   _| |_ ____) |___) | |____| |__| | | \\ \\ ");
	    System.out.println("           \\_____\\____/|_| \\_|   \\/   |______|_|  \\_\\ |_|  |_____|_____/_____/|______|\\____/|_|  \\_\\ ");   
	    System.out.println();
		System.out.println("###########################################################################################################################");

	}
}
