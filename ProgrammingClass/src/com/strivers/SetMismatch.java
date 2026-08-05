package com.strivers;

import java.util.Arrays;

public class SetMismatch {
	public static void main(String[] args) {
		/* 645. Set Mismatch */
		SetMismatchSolution sol = new SetMismatchSolution();
		int[] arr = { 1, 1 };
		int[] arr2 = { 2, 2 };
		int[] arr3 = { 1, 2, 2, 4 };

		System.out.println(Arrays.toString(sol.findErrorNums2(arr)));
		System.out.println(Arrays.toString(sol.findErrorNums2(arr2)));
		System.out.println(Arrays.toString(sol.findErrorNums2(arr3)));
	}
}

class SetMismatchSolution {
	public int[] findErrorNums(int[] nums) {
		int n = nums.length;
		int repeatingno = -1;
		int missing = -1;
		for (int i = 1; i <= n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (i == nums[j]) {
					count++;
				}
			}
			if (count == 2) {
				repeatingno = i;
				break;
			} else if (count == 0) {
				missing = i;
			}
			if (repeatingno != -1 && missing != -1) {
				break;
			}

		}
		return new int[] { repeatingno, missing };
	}

	public int[] findErrorNums2(int[] arr) {
		int n = arr.length;
		boolean[] seen = new boolean[n];
		int repeat = 0;
		for (int i = 0; i < n; i++) {
			if (seen[arr[i] - 1] != true) {
				seen[arr[i] - 1] = true;
			} else {
				repeat = arr[i];
			}
		}
		for (int i = 0; i < n; i++) {
			if (!seen[i]) {
				return new int[] { repeat, i + 1 };
			}
		}
		return new int[] {};
	}
}
