import java.util.Arrays;

import org.apache.commons.lang3.time.StopWatch;

public class Euro {

	// Spiel Fives
	private static int minNumberFive = 1;
	private static int maxNumberFive = 50;
	private static int numberFive = 0;

	// Eurozahlen
	private static int minNumberEurozahl = 1;
	private static int maxNumberEurozahl = 10;
	private static int numberEuro = 0;
	
	// Output Array
	private static int[] outputArrayFives = new int[5];
	private static int[] outputArrayEuro = new int[2];

	private static StopWatch timer = new StopWatch();

	public static void main(String[] args) {

		///////////////////////////// 	     	   	/////////////////////////////
		/////////////////////////////   		  	/////////////////////////////
		/////////////////////////////   EUROZAHLEN	/////////////////////////////
		///////////////////////////// 				/////////////////////////////
		/////////////////////////////				/////////////////////////////

		System.out.println("Berechne Eurozahlen . . .");

		timer.start();

		// Loop Eurozahlen
		for (int i = 0; i < 2; i++) {
			outputArrayEuro[i] = calcRandomOfEurozahl(minNumberEurozahl, maxNumberEurozahl);
		}

		// Outlines Eurozahlen
		System.out.println(Arrays.toString(outputArrayEuro));
		
		timer.stop();
		long elapsedTimeSuperzahl = (timer.getNanoTime() / 1000000);
		System.out.println("Zeit: " + elapsedTimeSuperzahl + "ms");

		// Reset the timer
		timer.reset();

		///////////////////////////// 	     	   	/////////////////////////////
		/////////////////////////////   		  	/////////////////////////////
		/////////////////////////////     FIVES		/////////////////////////////
		///////////////////////////// 				/////////////////////////////
		/////////////////////////////				/////////////////////////////

		System.out.println("\nBerechne Fünfer . . .");

		timer.start();

		// Loop Fives
		for (int i = 0; i < 5; i++) {
			outputArrayFives[i] = calcRandomOfFives(minNumberFive, maxNumberFive);
		}

		// Outlines Fives
		System.out.println(Arrays.toString(outputArrayFives));
		Arrays.sort(outputArrayFives);
		System.out.println(Arrays.toString(outputArrayFives));

		timer.stop();
		long elapsedTimeSechser = (timer.getNanoTime() / 1000000);
		System.out.println("Zeit: " + elapsedTimeSechser + "ms");

		System.out.println("\nBerechnung beendet!");
	}

	public static int calcRandomOfFives(int min, int max) {
		for(int i = 0; i < 681030; i++) {
			numberFive = min + (int) (Math.random() * ((max - min) + 1));			
		}
		return numberFive;
	}

	public static int calcRandomOfEurozahl(int min, int max) {
		for(int i = 0; i < 681030; i++) {
			numberEuro = min + (int) (Math.random() * ((max - min) + 1));			
		}
		return numberEuro;
	}
}