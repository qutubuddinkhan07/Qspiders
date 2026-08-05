package com.qsp.programming;

public class FindPower {
	public static void main(String[] args) {
		System.out.println(power(2, 0));
		System.out.println(power2(2, 2));
	}

	static int power(int x, int y) {
		int result = 1;
		for (int i = 1; i <= y; i++) {
			result *= x;
		}
		return result;
	}

	static int power2(int x, int y) {
		if (y == 0) {
			return 1;
		}
		return x * power(x, y - 1);
	}
}
