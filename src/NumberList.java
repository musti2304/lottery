import java.util.Arrays;

public class NumberList {

	public static void bubbleSort(int[][] array) {
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

	private static void swapNumbers(int i, int j, int k, int[][] array) {
		int temp;
		temp = array[i][j];
		array[i][j] = array[i][k];
		array[i][k] = temp;
	}

	public static void main(String[] args) {
		int[][] array = new int[][] { 
			
		};
		bubbleSort(array);
	}
}