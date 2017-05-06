package lotteries;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Euro {

	private static int minNumberFive = 1;
	private static int maxNumberFive = 50;
	private static int numberFive = 0;

	private static int minNumberEurozahl = 1;
	private static int maxNumberEurozahl = 10;
	private static int numberEuro = 0;

	private static List<Integer> fiveList = new ArrayList<>();
	private static List<Integer> euroList = new ArrayList<>();

	public static void main(String[] args) {

		System.out.println("Eurozahlen");
		makeRandomEuro();
		System.out.println(Arrays.deepToString(euroList.toArray()));

		System.out.println("\n5 aus 50");
		makeRandomFive();
		System.out.println(Arrays.deepToString(fiveList.toArray()));
		System.out.println("Size: " + fiveList.size());
	}

	private static void makeRandomFive() {
		for (int i = 0; i < 5; i++) {
			while (fiveList.size() < 5) {
				int selectedNumber = calcRandomEurozahl(minNumberFive, maxNumberFive);
				if (!(fiveList.contains(selectedNumber))) {
					fiveList.add(selectedNumber);
				}
			}
		}
		Collections.sort(fiveList);
	}

	private static void makeRandomEuro() {
		for (int i = 0; i < 2; i++) {
			while (euroList.size() < 2) {
				int selectedNumber = calcRandomEurozahl(minNumberEurozahl, maxNumberEurozahl);
				if (!(euroList.contains(selectedNumber))) {
					euroList.add(selectedNumber);
				}
			}
		}
		Collections.sort(euroList);
	}

	public static int calcRandomFive(int min, int max) {
		for (int i = 0; i < 3405149; i++) {
			numberFive = min + (int) (Math.random() * ((max - min) + 1));
		}
		return numberFive;
	}

	public static int calcRandomEurozahl(int min, int max) {
		for (int i = 0; i < 3405149; i++) {
			numberEuro = min + (int) (Math.random() * ((max - min) + 1));
		}
		return numberEuro;
	}
}