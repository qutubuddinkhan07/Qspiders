package com.qsp.programming;

public class Multiply_OfN_Num {
	public static void main(String[] args) {
		System.out.println(mul(5)); // 15
	}

	static int mul(int n) {
		if (n == 0) {
			return 0;
		}
		return n + mul(n - 1);
	}
}
