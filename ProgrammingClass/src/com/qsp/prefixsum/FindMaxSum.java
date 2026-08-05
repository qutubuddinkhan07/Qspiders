package com.qsp.prefixsum;

public class FindMaxSum {
	public static void main(String[] args) {
		int[] a = { 2, 3, 5, 1, 2, 5, 4 };
		System.out.println(maxSum(a, 3));
	}

	static int maxSum(int[] a, int k) {
		int sum = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < k; i++) {
			sum += a[i];
		}

		if (sum > max) {
			max = sum;
		}
		int end = 0;
		for (int i = k; i < a.length; i++) {
			sum += a[i];
			sum -= a[end];
			if (sum > max) {
				max = sum;
			}
			end++;
		}
		return sum;
	}
}
