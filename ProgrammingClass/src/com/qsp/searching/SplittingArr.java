package com.qsp.searching;

import java.util.Arrays;

public class SplittingArr {
	public static void main(String[] args) {
		int[] arr = { 9, 2, 6, 0, 5, 3, 4, 1 };

		spilt(arr);
	}

	static void spilt(int[] arr) {
		int n = arr.length;
		int[] a1 = new int[n / 2];
		int[] a2 = new int[n - a1.length];

//		for (int i = 0; i < a1.length; i++) {
//			a1[i] = arr[i];
//		}
//
//		for (int i = 0; i < a2.length; i++) {
//			a2[i] = arr[i + a1.length];
//		}

		// ======== OR =======
//		for (int i = 0; i < arr.length; i++) {
//			if (i < a1.length) {
//				a1[i] = arr[i];
//			} else if (i >= a1.length) {
//				a2[i - a1.length] = arr[i];
//			}
//		}

		// ======== OR ==========
		System.arraycopy(arr, 0, a1, 0, a1.length);
		System.arraycopy(arr, a1.length, a2, 0, a2.length);

		System.out.println(Arrays.toString(a1)); // [9, 2, 6, 0]
		System.out.println(Arrays.toString(a2)); // [5, 3, 4, 1]
	}
}
