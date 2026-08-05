package com.qsp.prefixsum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PrefixSum {
	public static void main(String[] args) {
		int[] a = { 2, 6, 4, 1, 5 };
		System.out.println(Arrays.toString(prefixSum(a))); // [2, 8, 12, 13, 18]

		// ==============================
		int[] a2 = { 2, 1, -1, 2, -3, 1 };
		int[] a3 = { 2, -2, 1, 4, 5 };
		System.out.println(subArrSumZero(a3)); // true

		// =================
		System.out.println(Arrays.toString(subArrIdx(a3))); // [1, 2]
	}

	static int[] prefixSum(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			arr[i] = arr[i] + arr[i - 1];
		}
		return arr;
	}

	static boolean subArrSumZero(int[] arr) {
		int prefixsum = 0;
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			prefixsum += arr[i];
			if (prefixsum == 0) {
				return true;
			}
			if (set.contains(prefixsum)) {
				return true;
			} else {
				set.add(prefixsum);
			}
		}
		return false;
	}

	static int[] subArrIdx(int[] arr) {
		int prefixsum = 0;
		Map<Integer, int[]> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			prefixsum += arr[i];
			if (prefixsum == 0) {
				int[] temp = new int[] { 0, i };
				map.put(prefixsum, temp);
				return temp;
			}
			if (map.containsKey(prefixsum)) {
				int temp[] = map.get(prefixsum);
				int res[] = new int[] { temp[1] + 1, i };
				return res;
			} else {
				map.put(prefixsum, new int[] { 0, i });
			}
		}
		return new int[] { -1, -1 };
	}
}
