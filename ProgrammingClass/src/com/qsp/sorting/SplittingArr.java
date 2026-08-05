package com.qsp.sorting;

import java.util.Arrays;

public class SplittingArr {
	public static void main(String[] args) {
		int[] arr = { 4, 5, 9, 1, 6, 3, 2 };
		split(arr);
	}

	static void split(int[] arr) {
		System.out.println(Arrays.toString(arr));

		if (arr.length == 1) {
			return;
		}

		int[] left = new int[arr.length / 2];
		int[] right = new int[arr.length - left.length];
		System.arraycopy(arr, 0, left, 0, left.length);
		System.arraycopy(arr, left.length, right, 0, right.length);

		split(left);
		split(right);
	}
}
