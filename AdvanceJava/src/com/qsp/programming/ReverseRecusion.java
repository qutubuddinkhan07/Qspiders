package com.qsp.programming;

public class ReverseRecusion {
	public static void main(String[] args) {
		System.out.println(reverse(51, 0));
	}

	public static int reverse(int n, int rev) {
		if (n <= 9) {
			return (rev * 10) + n;
		}
		int rem = n % 10;
		int temp = (rev * 10) + rem;
		return reverse(n / 10, temp);
	}
}
