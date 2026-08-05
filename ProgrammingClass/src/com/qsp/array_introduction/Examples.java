package com.qsp.array_introduction;

import java.util.Arrays;

public class Examples {
	public static void main(String[] args) {
		for (int n : buildArray(5)) {
			System.out.print(n + " ");
		}
		// 1 2 3 4 5

		System.out.println("\n" + Arrays.toString(buildArrayRecursive(new int[5], 5, 0)));
		// [1, 2, 3, 4, 5]

		System.out.println(Arrays.toString(recursive2(new int[6], 6)));
		System.out.println(Arrays.toString(traverse(new int[6], 0)));
	}

	static int[] buildArray(int n) {
		int[] newArr = new int[n];
		for (int i = 0; i < n; i++) {
			newArr[i] = i + 1;
		}
		return newArr;
	}

	static int[] buildArrayRecursive(int[] arr, int n, int index) {
		if (arr.length == index) {
			return arr;
		}
		arr[index] = index + 1;
		return buildArrayRecursive(arr, n, index + 1);
	}

	static int[] recursive2(int[] arr, int n) {
		if (n == 0) {
			return arr;
		}
//		arr[n - 1] = n;
		arr[arr.length - n] = n;
		return recursive2(arr, n - 1);
	}

	static int[] traverse(int[] arr, int idx) {
		if (arr.length == idx) {
			return arr;
		}
		arr[idx] = idx + 1;
		return traverse(arr, idx + 1);
	}
}
