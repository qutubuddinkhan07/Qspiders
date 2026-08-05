package com.qsp.programming;

public class CountDigits {
	public static void main(String[] args) {
		int n = 123;
		System.out.println(CountD(n)); // 3
	}

	static int notRecusrvive(int n) {
		if (n == 0) {
			return 0;
		}
		int count = 0;
		while (n > 0) {
			count++;
			n /= 10;
		}
		return count;
	}

	static int CountD(int n) {
		if (n <= 9) {
			return 1;
		}
		return 1 + CountD(n / 10);
	}
}
