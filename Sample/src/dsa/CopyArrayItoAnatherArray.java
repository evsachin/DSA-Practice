package dsa;

import java.util.Arrays;

public class CopyArrayItoAnatherArray {
	public static void main(String[] args) {

		int numbers[] = { 40, 50, 10, 20, 30 };

		int arr2[] = new int[5];

		// toString
		System.out.println(Arrays.toString(numbers));

		// sort
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));

		// copyof
		int copiedNumbers[] = Arrays.copyOf(numbers, numbers.length);
		System.out.println(Arrays.toString(copiedNumbers));

		// equals - to check two array are equal or not
		boolean isEqual = Arrays.equals(numbers, copiedNumbers);
		System.out.println(isEqual);

		isEqual = Arrays.equals(arr2, numbers);

		System.out.println(isEqual);

		// fill - arrays with some numbers

		int filledArray[] = new int[5];
		Arrays.fill(filledArray, 8);
		System.out.println(Arrays.toString(filledArray));

		// 2d Array

		int[][] matrix = { { 1, 2, 3 }, { 3, 4, 5 }, { 3, 4, 5 }, };

		System.out.println(Arrays.toString(matrix));
		System.out.println(matrix[1][2]);

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {

				System.out.print(" " + matrix[row][col]);
			}
			System.out.println();
		}

	}
}
