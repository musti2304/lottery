package lotteries;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lotto {

	private static int minNumberSix = 1;
	private static int maxNumberSix = 49;
	private static int numberSix = 0;

	private static int minNumberSuperzahl = 0;
	private static int maxNumberSuperzahl = 9;
	private static int numberSuper = 0;

	private static List<Integer> sixList = new ArrayList<>();
	private static List<Integer> superList = new ArrayList<>();

	public static void main(String[] args) {

		System.out.println("Superzahl");
		makeRandomSuperZahl();
		System.out.println(Arrays.deepToString(superList.toArray()));

		System.out.println("\n6 aus 49");
		makeRandomSix();
		System.out.println(Arrays.deepToString(sixList.toArray()));
		System.out.println("Size: " + sixList.size());
	}

	private static void makeRandomSuperZahl() {
		superList.add(calcRandomSuperzahl(minNumberSuperzahl, maxNumberSuperzahl));
	}

	private static void makeRandomSix() {
		for (int i = 0; i < 6; i++) {
			while (sixList.size() < 6) {
				int selectedNumber = calcRandomSix(minNumberSix, maxNumberSix);
				if (!(sixList.contains(selectedNumber))) {
					sixList.add(selectedNumber);
				}
			}
		}
		Collections.sort(sixList);
	}

	public static int calcRandomSix(int min, int max) {
		for (int i = 0; i < 1; i++) {
			numberSix = min + (int) (Math.random() * ((max - min) + 1));
		}
		return numberSix;
	}

	public static int calcRandomSuperzahl(int min, int max) {
		for (int i = 0; i < 1; i++) {
			numberSuper = min + (int) (Math.random() * ((max - min) + 1));
		}
		return numberSuper;
	}
}