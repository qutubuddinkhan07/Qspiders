package com.qsp.programming;

public class Sum_OfAll_Using_Recursion {
	public static void main(String[] args) {
		System.out.println(sum1(82)); // 10
		System.out.println(sum2(82)); // 10
	}

	static int sum1(int n) {
		int sum = 0;
		while (n > 0) {
			sum += n % 10;
			n = n / 10;
		}
		return sum;
	}

	static int sum2(int n) {
		if (n <= 9) {
			return n;
		}
		return (n % 10) + sum2(n / 10);
	}

	private void demo() {
		System.out.println("This is my demo private method");
	}
}
