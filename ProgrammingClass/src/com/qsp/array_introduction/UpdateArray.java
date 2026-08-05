package com.qsp.array_introduction;

public class UpdateArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println(updateEle(arr, 3, 3)); // 4
		System.out.println(updateEle(arr, 10, 3)); // RE
	}

	static int updateEle(int[] arr, int idx, int key) {
		if (idx >= arr.length || idx < 0) {
			throw new RuntimeException("Invalid index!!");
		} else {
			int temp = arr[idx];
			arr[idx] = key;
			return temp;
		}
	}
}
