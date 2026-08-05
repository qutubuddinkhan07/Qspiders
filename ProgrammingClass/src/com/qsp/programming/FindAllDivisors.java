package com.qsp.programming;

public class FindAllDivisors {
	public static void main(String[] args) {
		findDivisor(15, 1);

		System.out.println("\n=== 2nd way ====");
		FindAllDivisors2(16, 1);
	}

	static void findDivisor(int n, int start) {
		if (start > n) {
			return;
		}

		if (n % start == 0) {
			System.out.print(start + " "); // 1 3 5 15
		}
		findDivisor(n, start + 1);
	}

	static void FindAllDivisors2(int n, int start) {
		if (start * start > n) {
			return;
		}

		if (n % start == 0) {
			System.out.println(start);
			int res = n / start;
			if (res != start) {
				System.out.println(res);
			}
		}
		FindAllDivisors2(n, start + 1);
	}
}
