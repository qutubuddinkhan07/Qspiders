package com.qsp.pattern;

public class Fibonacci {
	public static void main(String[] args) {
		FindFibo(8); // 0 1 1 2 3 5 8 13 21
		System.out.println("====");
		System.out.println(fib2(8)); // 13
		System.out.println("=========");
		fib3(0, 1, 1, 5); // 0 1 1 2 3
	}

	static void FindFibo(int n) {
		int a = 0;
		int b = 1;
		for (int i = 0; i <= n; i++) {
			System.out.print(a + " ");
			int c = a + b;
			a = b;
			b = c;
		}
	}

	static int fib2(int n) {
		if (n == 1) {
			return 0;
		}
		if (n == 2) {
			return 1;
		}
		return fib2(n - 1) + fib2(n - 2);
	}

	static void fib3(int a, int b, int count, int range) {
		if (count > range) {
			return;
		}
		System.out.print(a + " ");
		fib3(b, a + b, count + 1, range);
	}
}
