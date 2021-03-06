package sorting_algorithm;

import java.util.Arrays;

public class SortTwoDimensionalArray {

	public static void bubbleSort(Integer[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int m = array[i].length; m >= 0; m--) {
				for (int j = 0; j < array[i].length - 1; j++) {
					int k = j + 1;
					if (array[i][j] > array[i][k]) {
						swapNumbers(i, j, k, array);
					}
				}
			}
		}
		System.out.println(Arrays.deepToString(array));
	}

	private static void swapNumbers(int i, int j, int k, Integer[][] array) {
		int temp;
		temp = array[i][j];
		array[i][j] = array[i][k];
		array[i][k] = temp;
	}

	public static void main(String[] args) {
		Integer[][] array = new Integer[][] {
			//Paste the two dimensional array you want to be sorted
		};
		bubbleSort(array);
	}
}