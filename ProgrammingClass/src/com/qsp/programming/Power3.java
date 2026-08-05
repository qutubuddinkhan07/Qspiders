package com.qsp.programming;

public class Power3 {
	public static void main(String[] args) {
		System.out.println(Pow_Using_Dynamic_P(2, 9)); // 512
	}

	static int Pow_Using_Dynamic_P(int x, int y) {
		if (y == 0) {
			return 0;
		}
		if (y == 1) {
			return x;
		}
		int temp = Pow_Using_Dynamic_P(x, y / 2);
		if (y % 2 == 0) {
			return temp * temp;
		}
		return temp * temp * x;
	}
}
