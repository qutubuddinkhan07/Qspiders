package com.qsp.string;

public class CountDigitLett {
	public static void main(String[] args) {
		String s = "shkfjJDHSFHDSJ12312#$#@$#";
//		count(s);
//		System.out.println('s' - 0);
//		System.out.println('S' - 0);
//		System.out.println('@' - 0);
		arrange(s);
	}

	static void count(String s) {
		int upper = 0;
		int lower = 0;
		int digit = 0;
		int special = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				lower++;
			} else if (ch >= 'A' && ch <= 'Z') {
				upper++;
			} else if (ch >= '0' && ch <= '9') {
				digit++;
			} else {
				special++;
			}
		}
		System.out.println("Upper case: " + upper);
		System.out.println("Lower case: " + lower);
		System.out.println("Digit: " + digit);
		System.out.println("Special symbol: " + special);
	}

	static void arrange(String s) {
		String upperCase = "";
		String lowerCase = "";
		String digits = "";
		String specialSym = "";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				lowerCase = lowerCase + ch;
			} else if (ch >= 'A' && ch <= 'Z') {
				upperCase = upperCase + ch;
			} else if (ch >= '0' && ch <= '9') {
				digits += ch;
			} else {
				specialSym += ch;
			}
		}

		System.out.println("Upper case: " + upperCase);
		System.out.println("Lower case: " + lowerCase);
		System.out.println("Digit: " + digits);
		System.out.println("Special symbol: " + specialSym);
//		System.out.println(upperCase + lowerCase + digits + specialSym);
	}
}
