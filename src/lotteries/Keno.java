package lotteries;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.time.StopWatch;

public class Keno {

	private static int minNumberKeno = 1;
	private static int maxNumberKeno = 70;
	private static int numberKeno = 0;

	private static List<Integer> kenoList = new ArrayList<>();

	public static void main(String[] args) {

		System.out.println("Keno");
		makeRandomKeno();
		System.out.println(Arrays.deepToString(kenoList.toArray()));
		System.out.println("Size: " + kenoList.size());
	}

	private static void makeRandomKeno() {
		for (int i = 0; i < 10; i++) {
			while (kenoList.size() < 10) {
				int selectedNumber = calcRandomKeno(minNumberKeno, maxNumberKeno);
				if (!(kenoList.contains(selectedNumber))) {
					kenoList.add(selectedNumber);
				}
			}
		}
		Collections.sort(kenoList);
	}

	public static int calcRandomKeno(int min, int max) {
		for (int i = 0; i < 9; i++) {
			numberKeno = min + (int) (Math.random() * ((max - min) + 1));
		}
		return numberKeno;
	}

}
