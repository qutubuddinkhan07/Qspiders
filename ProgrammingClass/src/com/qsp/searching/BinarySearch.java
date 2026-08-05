package com.qsp.searching;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 5, 8, 9, 11, 13, 14, 16 };
		System.out.println(search(arr, 3)); // -1
		System.out.println(searchRecursion(arr, 14, 0, arr.length - 1)); // 7
	}

	static int search(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;
	}

	static int searchRecursion(int[] arr, int target, int start, int end) {
		if (start > end) {
			return -1;
		}

		int mid = (start + end) / 2;
		if (arr[mid] == target) {
			return mid;
		} else if (target > arr[mid]) {
			return searchRecursion(arr, target, mid + 1, end);
		} else {
			return searchRecursion(arr, target, start, mid - 1);
		}
	}
}
