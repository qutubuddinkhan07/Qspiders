package com.qsp.programming;

public class StrongNumber {
	public static void main(String[] args) {
		int n = 121; // not a strong number
		int x = 145;
		if (x == findNum(x)) {
			System.out.println(x + " is strong number"); // 145 is strong number
		} else {
			System.out.println(x + " is not a strong number");
		}
	}

	static int findNum(int n) {
		if (n <= 9) {
			return n;
		}
		return fact(n % 10) + findNum(n / 10);
	}

	static int fact(int n) {
		if (n <= 1) {
			return 1;
		}
		return n * fact(n - 1);
	}

	static boolean isStrong1(int n) {
		int backup = n;
		int factSum = 0;
		while (n > 0) {
			factSum = factSum + fact(n % 10);
			n /= 10;
		}
		return backup == factSum;
	}
}
