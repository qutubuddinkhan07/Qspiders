package com.qsp.array;

public class SumOfArr {
	public static void main(String[] args) {
		int[] a = { 1, 3, 4, 5, 6, 7 };
		System.out.println(arrSum(a)); // 26

		System.out.println("===============");
		System.out.println(maxInArr(a)); // 28
		System.out.println(findMissEle(a)); // 2

		int[] a2 = { 12, 11, 14, 16, 13, 15 };
		System.out.println(findRange(a2)); // 81
	}

	static int arrSum(int[] arr) {
		int sum = 0;
		for (int a : arr) {
			sum += a;
		}
		return sum;
	}

	static int maxInArr(int[] arr) {
		// 1 + 2 + 3 + .... + (n-2) + (n-1) + n + (n(n+1))/2
		int max = Integer.MIN_VALUE;
		for (int n : arr) {
			if (n > max) {
				max = n;
			}
		}
		return (max * (max + 1)) / 2;
	}

	static int findMissEle(int[] arr) {
		int max = Integer.MIN_VALUE;
		int actual = 0;
		for (int n : arr) {
			actual += n;
			if (n > max) {
				max = n;
			}
		}
		int expected = (max * (max + 1)) / 2;

		return expected - actual;
	}

	static int findRange(int[] arr) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int n : arr) {
			if (n > max) {
				max = n;
			} else if (n < min) {
				min = n;
			}
		}

		int sum1 = (max * (max + 1)) / 2;
		int sum2 = (min * (min - 1)) / 2;

		return sum1 - sum2;
	}
}
