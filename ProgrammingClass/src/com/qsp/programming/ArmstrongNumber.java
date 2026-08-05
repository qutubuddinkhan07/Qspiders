package com.qsp.programming;

public class ArmstrongNumber {
	public static void main(String[] args) {
		System.out.println(isArmstrong(153));
		System.out.println(noOfDigits(465));
	}

	static boolean isArmstrong(int n) {
		int digit = noOfDigits(n);
		int powerAdd = powerSum(n, digit);
		return n == powerAdd;

	}

	static int power(int x, int y) {
		if (y == 0) {
			return 1;
		}
		if (y == 1) {
			return x;
		}

		int temp = power(x, y / 2);
		return (y % 2 == 0) ? temp * temp : temp * temp * x;
	}

	static int noOfDigits(int n) {
//		if (n <= 9) {
//			return 1;
//		}
//		return 1 + noOfDigits(n / 10);
		return (n <= 9) ? 1 : 1 + noOfDigits(n / 10);
	}

	static int powerSum(int n, int noOfDigits) {
		if (n <= 9) {
			return power(n, noOfDigits);
		}
		int rem = n % 10;
		return power(rem, noOfDigits) + powerSum(n / 10, noOfDigits);
	}
}
