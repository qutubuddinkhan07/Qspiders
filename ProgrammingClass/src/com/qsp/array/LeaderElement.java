package com.qsp.array;

public class LeaderElement {
	public static void main(String[] args) {
		int[] a = { 8, 5, 9, 1, 4, 1, 3, 2 };
		int max = Integer.MIN_VALUE;
		for (int i = a.length - 1; i >= 0; i--) {
			if (a[i] > max) {
				System.out.println(a[i]);
				max = a[i];
			}
		}
	}
}
