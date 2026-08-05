package com.qsp.matrix;

import java.util.Arrays;

public class SumMatrix {
	public static void main(String[] args) {
		int[][] a = { { 1, 4, 2 }, { 3, 1, 2 }, { 5, 9, 1 } };
		int[][] b = { { 5, 1, 2 }, { 9, 4, 3 }, { 3, 1, 6 } };
		matrixSum(a, b);
	}

	static void matrixSum(int[][] a, int[][] b) {
		int[][] c = new int[a.length][b[0].length];
		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			for (int j = 0; j < b.length; j++) {
				sum = a[i][j] + b[i][j];
				c[i][j] = sum;
			}
		}
		for (int[] n : c) {
			System.out.println(Arrays.toString(n));
		}
	}
	/**
	 * <pre>
	 * [6, 5, 4]
	[12, 5, 5]
	[8, 10, 7]
	 * </pre>
	 */
}
