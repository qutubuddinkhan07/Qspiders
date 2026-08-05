package com.qsp.sorting;

import java.util.Arrays;

public class Sorting {
	public static void main(String[] args) {
		int[] arr = { 2, 1, 3, 0, 4, 2, 6, 7 };
		// swap(arr);
		// System.out.println(Arrays.toString(arr)); // [0, 1, 3, 2, 4, 2, 6, 7]
		selectionSort(arr);
		System.out.println(Arrays.toString(arr)); // [0, 1, 2, 2, 3, 4, 6, 7]
	}

	static void swap(int[] arr) {
		// swapping minimum value to the first index
		int min = 0;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] < arr[min]) {
				min = j;
			}
		}
		if (min != 0) {
			int temp = arr[min];
			arr[min] = arr[0];
			arr[0] = temp;
		}
	}

	static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}

			if (min != i) {
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}
	}
}
