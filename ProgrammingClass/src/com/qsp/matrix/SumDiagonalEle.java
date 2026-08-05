package com.qsp.matrix;

import java.util.Arrays;

public class SumDiagonalEle {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4, 5 }, { 5, 4, 3, 2, 1, }, { 2, 3, 4, 5, 1 }, { 4, 5, 1, 2, 3 },
				{ 3, 2, 1, 4, 5 } };
		printArr(arr);
		System.out.println();
		diagonalSum(arr);
		System.out.println();

		// ===========================
		int[][] arr2 = { { 1, 2, 3, 4 }, { 4, 2, 1, 3 }, { 3, 2, 1, 4 }, { 2, 4, 3, 1 } };
		printArr(arr2);
		System.out.println();
		diagonalSum(arr2);
	}

	static void diagonalSum(int[][] arr) {
		int sum = 0;
		int l = arr.length;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i][i];
			if (l % 2 == 1 && i == l / 2) {
				continue;
			}
			sum = sum + arr[i][l - i - 1];
		}
		System.out.println("Sum of it's diagonals: " + sum);
	}

	static void printArr(int[][] arr) {
		for (int[] n : arr) {
			System.out.println(Arrays.toString(n));
		}
	}
	/**
	 * <pre>
	 * [1, 2, 3, 4, 5]
	[5, 4, 3, 2, 1]
	[2, 3, 4, 5, 1]
	[4, 5, 1, 2, 3]
	[3, 2, 1, 4, 5]
	
	Sum of it's diagonals: 31
	
	[1, 2, 3, 4]
	[4, 2, 1, 3]
	[3, 2, 1, 4]
	[2, 4, 3, 1]
	
	Sum of it's diagonals: 14
	 * </pre>
	 */
}
