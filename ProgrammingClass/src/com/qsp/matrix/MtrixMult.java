package com.qsp.matrix;

import java.util.Arrays;

public class MtrixMult {
	public static void main(String[] args) {
		int a[][] = { { 1, 5, 4 }, { 3, 1, 2 }, { 5, 2, 1 } };
		int b[][] = { { 4, 3, 1 }, { 9, 6, 0 }, { 2, 1, 4 } };
		int n = a.length;

		int c[][] = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int sum = 0;
				for (int k = 0; k < n; k++) {
					sum = sum + a[i][k] * b[k][j];
				}
				c[i][j] = sum;
			}
		}

		for (int[] x : c) {
			System.out.println(Arrays.toString(x));
		}
	}
	/// <pre>
	/// [57, 37, 17]
	/// [25, 17, 11]
	/// [40, 28, 9]
	/// </pre>
}
