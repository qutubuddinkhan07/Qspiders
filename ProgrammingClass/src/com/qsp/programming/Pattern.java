package com.qsp.programming;

public class Pattern {
	public static void main(String[] args) {
		/*
		 * Pattern 1
		 */
		Pattern2 p1 = (int n) -> {
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		};
		p1.pattern(5);

		System.out.println("\n==========");
		/*
		 * Pattern 2
		 */
		Pattern2 p2 = (int n) -> {
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(j);
				}
				System.out.println();
			}
		};
		p2.pattern(5);

		System.out.println("\n==========");
		/*
		 * Pattern 3
		 */
		Pattern2 p3 = (int n) -> {
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(i);
				}
				System.out.println();
			}
		};
		p3.pattern(5);

		System.out.println("\n==========");
		/*
		 * Pattern 4
		 */
		Pattern2 p4 = (int n) -> {
			for (int i = 1; i <= n; i++) {
				for (int j = i; j >= 1; j--) {
					System.out.print(j);
				}
				System.out.println();
			}
		};
		p4.pattern(5);

		System.out.println("\n==========");
		/*
		 * Pattern 5
		 */
		Pattern2 p5 = (int n) -> {
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if (i == j || j == 1 || (i >= n && j <= n)) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		};
		p5.pattern(5);
	}
}
/**
 * <pre>
 *
 **
 ***
 ****
 *****

 ==========
 1
 12
 123
 1234
 12345
 
 ==========
 1
 22
 333
 4444
 55555
 
 ==========
 1
 21
 321
 4321
 54321
 
 ==========
 *    
 **   
 * *  
 *  *
 *****
 * </pre>
 */
