package com.qsp.array;

import java.util.Arrays;

public class MaxEleToLast {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 34, 54, 23, 65, 12 };
//		bubbleLastEle(arr);
		bubbleLastEle2(arr);
		System.out.println(Arrays.toString(arr));

	}

	static void putMaxToLast(int[] arr) {
		int maxIdx = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[maxIdx]) {
				maxIdx = i;
			}
		}
		int temp = arr[maxIdx];
		arr[maxIdx] = arr[arr.length - 1];
		arr[arr.length - 1] = temp;
	}

	static void bubbleLastEle(int[] arr) {
		// bubling of max element
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
	}

	static void bubbleLastEle2(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			boolean isSwapped = true;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					isSwapped = false;
				}
			}
			if (isSwapped) {
				break;
			}
		}
	}
}
