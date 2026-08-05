package com.qsp.twoarray;

import java.util.Arrays;

public class Array2D {
	public static void main(String[] args) {
		int[][] arr = new int[3][];
		arr[0] = new int[] { 1, 2, 3 };
		arr[1] = new int[] { 2, 9, 6, 0, 4 };
		arr[2] = new int[] { 2, 8, 6, 0 };

		int[][] arr2 = new int[3][];
		arr2[0] = new int[3];
		arr2[1] = new int[5];
		arr2[2] = new int[3];
//		System.out.println(arr2[2]);

		creation(arr2);
	}

	static void creation(int[][] arr) {
		for (int[] x : arr) {
			System.out.println(Arrays.toString(x));
		}
		/**
		 * <pre>
		 * [1, 2, 3]
		 * [2, 9, 6, 0, 4]
		 * [2, 8, 6, 0]
		 * </pre>
		 */
	}
}
