package com.qsp.array;

public class FindSecMax {
	public static void main(String[] args) {
		int[] arr = { 2, 5, 8, 4, 3, 7, 6, 5, 10, 9, 11 };
		System.out.println(findSecMax(arr)); // 10
	}

	static int findSecMax(int[] arr) {
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max1) {
				max2 = max1;
				max1 = arr[i];
			} else if (arr[i] > max2 && arr[i] != max2) {
				max2 = arr[i];
			}
		}

		return max2;
	}
}
