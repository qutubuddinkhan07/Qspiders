package com.qsp.searching;

public class LinearSearch {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 1, 3 };
		int target = 1;
		search(arr, target);
	}

	static int search(int[] arr, int targer) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == targer) {
				return i;
			}
		}
		return -1;
	}
}
