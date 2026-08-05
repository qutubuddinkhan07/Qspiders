package com.qsp.stream;

import java.util.List;

public class DemoStream1 {
	public static void main(String[] args) {
		List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> l2 = list.stream().filter(i -> isPrime(i)).toList();
		System.out.println(l2); // [2, 3, 5, 7]
		System.out.println(list); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
	}

	static boolean isPrime(int n) {
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
