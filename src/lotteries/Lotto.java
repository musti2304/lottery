package lotteries;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.commons.lang3.time.StopWatch;

public class Lotto {

	// Spiel 6 aus 49
	private static int minNumberSechser = 1;
	private static int maxNumberSechser = 49;
	private static int numberSix = 0;

	// Superzahl
	private static int minNumberSuperzahl = 0;
	private static int maxNumberSuperzahl = 9;
	private static int numberSuper = 0;

	// Output Array
	public static List<Integer> sixList = new ArrayList<>();
	public static List<Integer> superList = new ArrayList<>();
	// private static int[] outputArraySix = new int[6];
	// private static int[] outputArraySuper = new int[1];

	private static StopWatch timer = new StopWatch();

	public static void main(String[] args) {

		System.out.println("Berechne Superzahl . . .");
		timer.start();

		superList.add(calcRandomOfSuperzahl(minNumberSuperzahl, maxNumberSuperzahl));

		// Outlines Superzahl
		System.out.println(Arrays.deepToString(superList.toArray()));

		timer.stop();
		long elapsedTimeSuperzahl = (timer.getNanoTime() / 1000000);
		System.out.println("\nZeit: " + elapsedTimeSuperzahl + "ms");

		// Reset the timer
		timer.reset();

		/////////////////////////////////////////////////////////////////////
		System.out.println("\nBerechne Sechser . . .");
		timer.start();

		// Loop 6 aus 49
		for (int i = 0; i < 6; i++) {
			while (sixList.size() < 6) {
				int selectedNumber = calcRandomOfSechser(minNumberSechser, maxNumberSechser);
				if (!(sixList.contains(selectedNumber))) {
					sixList.add(selectedNumber);
				}
			}
		}

		// Outlines 6 aus 49
		System.out.println(Arrays.deepToString(sixList.toArray()));
		Collections.sort(sixList);
		System.out.println(Arrays.deepToString(sixList.toArray()));

		timer.stop();
		long elapsedTimeSechser = (timer.getNanoTime() / 1000000);
		System.out.println("\nZeit: " + elapsedTimeSechser + "ms");

		System.out.println("\n\nEnde!");
	}

	public static int calcRandomOfSechser(int min, int max) {
		for (int i = 0; i <= 1; i++) {
			numberSix = min + (int) (Math.random() * ((max - min) + 1));
		}
		return numberSix;
	}

	public static int calcRandomOfSuperzahl(int min, int max) {
		for (int i = 0; i <= 1; i++) {
			numberSuper = min + (int) (Math.random() * ((max - min) + 1));
		}
		return numberSuper;
	}
}