package com.qsp.methodrefer;

public class PrimeTest {
	public static boolean isPrime(int n) {
//		System.out.println("-----------");
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
