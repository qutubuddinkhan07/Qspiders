package com.qsp.programming;

import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
		System.out.println("Enter a number:");
		int n = new Scanner(System.in).nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == j || i + j == n + 1) {
					System.out.print("@");
				} else if (i == 1 || j == 1 || i == n || j == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		System.out.println("\n=========\n");
		snakePattern(n);
	}

	public static void snakePattern(int n) {
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				int k = n * i;
				for (int j = 1; j <= n; j++) {
					System.out.print(k + "\t");
					k--;
				}
			} else {
				int k = ((i - 1) * n) + 1;
				for (int j = 1; j <= n; j++) {
					System.out.print(k + "\t");
					k++;
				}
			}
			System.out.println();
		}
	}

	public static void snakePattern2(int n) {
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				int k = n * i;
				for (int j = 1; j <= n; j++) {
					System.out.print(k + "\t");
				}
			}
		}
	}
}

/**
 * <pre>
 Enter a number:
 7
 &#64;*****@
 *&#64;   @*
 * &#64; @ *
 *  &#64;  *
 * &#64; @ *
 *&#64;   @*
 &#64;*****@
 
 =========

 1	2	3	4	5	6	7	
 14	13	12	11	10	9	8	
 15	16	17	18	19	20	21	
 28	27	26	25	24	23	22	
 29	30	31	32	33	34	35	
 42	41	40	39	38	37	36	
 43	44	45	46	47	48	49
 * </pre>
 */
