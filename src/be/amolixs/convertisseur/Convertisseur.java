package be.amolixs.convertisseur;

/**
 * Class qui permet de gérer les conversion farenheit -> celsius.
 * @version 1.0
 * @author amolixs
 */

public class Convertisseur {
	
	/**
	 * Méthode qui permet de convertir des degrés celsius en fahrenheit
	 * @param celsius
	 * 		Degré en celsius
	 * @return
	 * 		Degré convertit en fahrenheit
	 */
	public float convertFahrenheit(float celsius) {
		float fahrenheit = (celsius * 9/5) + 32;
		
		return fahrenheit;
	}
	
	/**
	 * Méthode qui permet de convertir des degrés fahrenheit en celsius
	 * @param fahrenheit
	 * 		Degré en fahrenheit
	 * @return
	 * 		Degré converti en celsius
	 */
	public float convertCelsius(float fahrenheit) {
		float celsius = (fahrenheit - 32) * 5/9;
		
		return celsius;
	}
}
