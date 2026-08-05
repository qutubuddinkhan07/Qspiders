package com.qsp.string;

public class ReverseStr {
	public static void main(String[] args) {
		String str = "candidate";
		System.out.println(reverse(str)); // etadidnac
		System.out.println(reverse2(str)); // etadidnac
	}

	private static final String reverse(String str) {
		String op = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			op = op + ch;
		}
		return op;
	}

	private static final String reverse2(String s) {
		char[] ch = s.toCharArray();
		int l = 0;
		int r = s.length() - 1;
		while (l < r) {
			char temp = ch[l];
			ch[l] = ch[r];
			ch[r] = temp;
			l++;
			r--;
		}

		return new String(ch);
	}
}
