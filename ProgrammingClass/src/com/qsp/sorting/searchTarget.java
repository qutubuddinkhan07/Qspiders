package com.qsp.sorting;

import java.util.Arrays;

public class searchTarget {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int target = 13;
		// System.out.println(Arrays.toString(findTar(arr, target)));
		System.out.println(Arrays.toString(search(arr, target)));
	}

	static int[] search(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
		int[] res = { -1, -1 };

		while (left < right) {
			int temp = arr[left] + arr[right];
			if (target == temp) {
				res[0] = arr[left];
				res[1] = arr[right];
				break;
			} else if (target > temp) {
				left++;
			} else {
				right--;
			}
		}
		return res;
	}

	static int[] findTar(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
				if (sum == target) {
					return new int[] { i, j };
				}
			}
		}
		return new int[] { -1, -1 };
	}
}
