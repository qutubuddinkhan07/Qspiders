package com.qsp.pattern2;

public class AutomorphicNum {
	public static void main(String[] args) {
		int n = 5;
		System.out.println(findAutomorphicNum(n)); // true

		System.out.println("========== using recursion =====");
		System.out.println(isAutomorphicNumRecursive(n, n * n));
	}

	static boolean findAutomorphicNum(int n) {
		int square = n * n;
		while (n < 0) {
			if ((n % 10) != (square % 10)) {
				return false;
			}
			n /= 10;
			square /= 10;
		}
		return true;
	}

	static boolean practice(int n) {
		int sq = n * n;
		while (n > 0) {
			if (n % 10 != sq % 10) {
				return false;
			}
			n /= 10;
			sq /= 10;
		}
		return true;
	}

	static boolean isAutomorphicNumRecursive(int n, int square) {
		if (n == 0) {
			return true;
		}
		if ((n % 10) != (square % 10)) {
			return false;
		}
		return isAutomorphicNumRecursive(n / 10, square / 10);
	}
}
