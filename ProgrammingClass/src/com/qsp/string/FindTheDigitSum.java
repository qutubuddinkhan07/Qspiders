package com.qsp.string;

public class FindTheDigitSum {
	public static void main(String[] args) {
		String s = "a1bc496de5";
		System.out.println(sumOfDigit(s)); // 25
		System.out.println(findChar(" maximum", 'm')); // true
		System.out.println(findCharRetIdx(" maximum", 'm')); // 1
		System.out.println(findCharLastIdx(" maximum", 'm')); // 7
	}

	static int sumOfDigit(String s) {
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				continue;
			}
			sum += s.charAt(i) - '0';
		}
		return sum;
		// unique code of '0' is 48
		// unique code of '9' is 57
	}

	static boolean findChar(String s, char tar) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == (tar)) {
				return true;
			}
		}
		return false;
	}

	static int findCharRetIdx(String s, char tar) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == (tar)) {
				return i;
			}
		}
		return -1;
	}

	static int findCharLastIdx(String s, char tar) {
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == (tar)) {
				return i;
			}
		}
		return -1;
	}
}
