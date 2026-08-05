package com.qsp.programming;

public class PalindromeRecursion {
	public static void main(String[] args) {
		System.out.println("Enter the number:");
		int n = new java.util.Scanner(System.in).nextInt();
		if (n == reverse(n, 0)) {
			System.out.println(n + " is palindrome");
		} else {
			System.out.println(n + " is not a palindrome");
		}
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
