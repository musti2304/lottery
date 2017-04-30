package lotteries;
import java.util.Arrays;
import org.apache.commons.lang3.time.StopWatch;

public class Keno {

	// KENO
	private static int minNumberKeno = 1;
	private static int maxNumberKeno = 70;
	private static int numberKeno = 0;

	// Output Array
	private static int[] outputArrayKeno = new int[10];

	private static StopWatch timer = new StopWatch();

	public static void main(String[] args) {

		///////////////////////////// /////////////////////////////
		///////////////////////////// /////////////////////////////
		///////////////////////////// KENO /////////////////////////////
		///////////////////////////// /////////////////////////////
		///////////////////////////// /////////////////////////////

		System.out.println("\nBerechne Keno Zahlen . . .");

		int count = 0;
		while (count < 2147182) {
			// timer.start();

			// Loop 6 aus 49
			for (int i = 0; i < 10; i++) {
				outputArrayKeno[i] = calcRandomOfSechser(minNumberKeno, maxNumberKeno);
			}

			// Outlines 6 aus 49
			// System.out.println(Arrays.toString(outputArrayKeno));
			//
			// timer.stop();
			// long elapsedTimeSechser = (timer.getNanoTime() / 1000000);
			// System.out.println("\nZeit: " + elapsedTimeSechser + "ms");
			//
			// System.out.println("\n\nEnde!");
			// timer.reset();
			 count++;

		}
		Arrays.sort(outputArrayKeno);
		System.out.println(Arrays.toString(outputArrayKeno));

	}

	public static int calcRandomOfSechser(int min, int max) {
		for (int i = 0; i < 9; i++) {
			numberKeno = min + (int) (Math.random() * ((max - min) + 1));
		}
		return numberKeno;
	}

}
