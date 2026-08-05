package com.qsp.array_introduction;

import java.util.Arrays;

public class Reverse_Array {
	public static void main(String[] args) {
		int[] arr = { 9, 8, 7, 6, 5, 4, 3 };
		System.out.println("Original array: " + Arrays.toString(arr));
		System.out.println("1st approach: " + Arrays.toString(reverse1(new int[] { 1, 23, 4, 5, 6 })));
		System.out.println("2nd approach: " + Arrays.toString(reverse2(arr)));
		System.out.println("Recursive approach: " + Arrays.toString(reverseRecursive(arr, 0, arr.length - 1)));
	}

	static int[] reverse1(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		return arr;
	}

	static int[] reverse2(int[] arr) {
		int[] b = new int[arr.length];
		int idx = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			b[idx++] = arr[i];
		}
		return b;
	}

	static int[] reverseRecursive(int[] arr, int start, int end) {
		if (start > end) {
			return arr;
		}
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		return reverseRecursive(arr, ++start, --end);
	}
}
