package com.qsp.array;

public class SpiralMatrix {
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
				val++;
				if (row + col == n - 1) {
					dir = 'd';
					row++;
				} else {
					col++;
				}
				break;
			case 'd':
				a[row][col] = val;
				val++;
				if (row == col) {
					dir = 'l';
					col--;
				} else {
					row++;
				}
				break;
			case 'l':
				a[row][col] = val;
				val++;
				if (row + col == n - 1) {
					dir = 'u';
					row--;
				} else {
					col--;
				}
				break;
			case 'u':
				a[row][col] = val;
				val++;
				if (row - col == 1) {
					dir = 'r';
					col++;
				} else {
					row--;
				}
			}
		}

//		for (int[] arr : a) {
//			System.out.println(Arrays.toString(arr));
//		}

		for (int[] arr : a) {
			for (int ele : arr) {
				System.out.print(ele + "\t");
			}
			System.out.println();
		}
		/// <pre>
		/// 1 2 3 4 5
		/// 16 17 18 19 6
		/// 15 24 25 20 7
		/// 14 23 22 21 8
		/// 13 12 11 10 9
		/// </pre>
	}
}
