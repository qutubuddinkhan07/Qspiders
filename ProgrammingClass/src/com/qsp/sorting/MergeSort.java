package com.qsp.sorting;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int[] a = { 4, 2, 6, 1, 5, 8, 0, 9 };
		mergeSort(a);
		System.out.println(Arrays.toString(a));
	}

	static void mergeSort(int a[]) {
		if (a.length == 1) {
			return;
		}
		int[] left = new int[a.length / 2];
		int[] right = new int[a.length - left.length];
		System.arraycopy(a, 0, left, 0, left.length);
		System.arraycopy(a, left.length, right, 0, right.length);
		mergeSort(left);
		mergeSort(right);
		merge(left, right, a);
	}

	static void merge(int[] left, int[] right, int[] a) {
		int i, j, k;
		i = k = j = 0;
		while (i < left.length && j < right.length) {
			if (left[i] < right[j]) {
				a[k] = left[i];
				i++;
				k++;
			} else {
				a[k] = right[j];
				j++;
				k++;
			}
		}
		while (i < left.length) {
			a[k] = left[i];
			i++;
			k++;
		}
		while (j < right.length) {
			a[k] = right[j];
			j++;
			k++;
		}
	}
}
