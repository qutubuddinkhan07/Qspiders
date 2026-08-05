package com.qsp.array;

public class SpiralMatrix2 {
	public static void main(String[] args) {
		int n = 5;
		int a[][] = new int[n][n];
		int val = 1;
		char dir = 'r';
		int row = 0;
		int col = 0;

		for (int i = 1; i <= n * n; i++) {
			switch (dir) {
			case 'r':
				a[row][col] = val;
				if (row + col == n - 1) {
					dir = 'd';
					row++;
				} else {
					col++;
				}
				break;
			case 'd':
				a[row][col] = val;
				if (row == col) {
					dir = 'l';
					col--;
				} else {
					row++;
				}
				break;
			case 'l':
				a[row][col] = val;
				if (row + col == n - 1) {
					dir = 'u';
					row--;
				} else {
					col--;
				}
				break;
			case 'u':
				a[row][col] = val;
				if (row - col == 1) {
					dir = 'r';
					val++;
					col++;
				} else {
					row--;
				}
			}
		}
		for (int[] arr : a) {
			for (int x : arr) {
				System.out.print(x + "\t");
			}
			System.out.println();
		}
	}
	/// <pre>
	/// 1 1 1 1 1
	/// 1 2 2 2 1
	/// 1 2 3 2 1
	/// 1 2 2 2 1
	/// 1 1 1 1 1
	/// </pre>
}
