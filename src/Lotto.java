import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

import org.apache.commons.lang3.time.StopWatch;

public class Lotto {

	// Spiel 6 aus 49
	private static int minNumberSechser = 1;
	private static int maxNumberSechser = 49;
	private static int[] arrayTableSechser = new int[50];
	private static int numberSix = 0;

	// Superzahl
	private static int minNumberSuperzahl = 0;
	private static int maxNumberSuperzahl = 9;
	private static int[] arrayTableSuperZahl = new int[10];
	private static int numberSuper = 0;

	// Output Array
	private static int[] outputArraySix = new int[6];
	private static int[] outputArraySuper = new int[1];

	private static StopWatch timer = new StopWatch();
	
	public static void main(String[] args) {

		

		///////////////////////////// 			/////////////////////////////
		///////////////////////////// 			/////////////////////////////
		///////////////////////////// SUPERZAHL /////////////////////////////
		///////////////////////////// 			/////////////////////////////
		///////////////////////////// 			/////////////////////////////
		
		System.out.println("Berechne Superzahl . . .");

		timer.start();

		// Loop Superzahl
		for (int i = 0; i < 1; i++) {
			outputArraySuper[i] = calcRandomOfSuperzahl(minNumberSuperzahl, maxNumberSuperzahl);
		}

		// Outlines Superzahl
		System.out.println(Arrays.toString(outputArraySuper));
		
		timer.stop();
		long elapsedTimeSuperzahl = (timer.getNanoTime() / 1000000);
		System.out.println("\nZeit: " + elapsedTimeSuperzahl + "ms");

		// Reset the timer
		timer.reset();

		///////////////////////////// 			/////////////////////////////
		///////////////////////////// 			/////////////////////////////
		///////////////////////////// SECHSER 	/////////////////////////////
		///////////////////////////// 			/////////////////////////////
		///////////////////////////// 			/////////////////////////////

		System.out.println("\nBerechne Sechser . . .");

		timer.start();

		// Loop 6 aus 49
		for (int i = 0; i < 6; i++) {
			outputArraySix[i] = calcRandomOfSechser(minNumberSechser, maxNumberSechser);
		}

		// Outlines 6 aus 49
		System.out.println(Arrays.toString(outputArraySix));
		Arrays.sort(outputArraySix);
		System.out.println(Arrays.toString(outputArraySix));

		timer.stop();
		long elapsedTimeSechser = (timer.getNanoTime() / 1000000);
		System.out.println("\nZeit: " + elapsedTimeSechser + "ms");

		System.out.println("\n\nEnde!");
	}

	public static int calcRandomOfSechser(int min, int max) {
		for (int i = 0; i < 2589596; i++) {
			numberSix = min + (int) (Math.random() * ((max - min) + 1));
		}
		return numberSix;
	}

	public static int calcRandomOfSuperzahl(int min, int max) {
		for (int i = 0; i < 2589596; i++) {
			numberSuper = min + (int) (Math.random() * ((max - min) + 1));
		}
		return numberSuper;
	}
}