package com.qsp.programming;

import java.util.Scanner;

public class Pattern3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = sc.nextInt();
		pattern4(n);
		/***
		 * <pre>
		 =======
		 *****
		 **** 
		 ***  
		 **   
		 * 
		 =======
		 * </pre>
		 */
		pattern5(n);
		/***
		 * <pre>
		 =======
		 11111
		 2222 
		 333  
		 44   
		 5  
		 =======
		 * </pre>
		 */
		pattern6(n);
		/***
		 * <pre>
		 =======
		 12345
		 1234 
		 123  
		 12   
		 1  
		 =======
		 * </pre>
		 */
		pattern7(n);
		/***
		 * <pre>
		 =======
		 55555
		 4444
		 333
		 22
		 1
		 =======
		 * </pre>
		 */
		pattern8(n);
		/***
		 * <pre>
		 =======
		 54321
		 4321
		 321
		 21
		 1
		 =======
		 * </pre>
		 */
		pattern9(n);
		/***
		 * <pre>
		 =======
		 *****
		 *  *
		 * *
		 **
		 *
		 =======
		 * </pre>
		 */
	}

	static void pattern4(int n) {
		System.out.println("========\n");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i + j <= n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void pattern5(int n) {
		System.out.println("========\n");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i + j <= n - 1) {
					System.out.print(i + 1);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void pattern6(int n) {
		System.out.println("========\n");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i + j <= n - 1) {
					System.out.print(j + 1);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void pattern7(int n) {
		System.out.println("========\n");
		for (int i = n; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	static void pattern8(int n) {
		System.out.println("========\n");
		for (int i = n; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	static void pattern9(int n) {
		System.out.println("========\n");
		for (int i = n; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				if (i == j || i == n || j == 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
