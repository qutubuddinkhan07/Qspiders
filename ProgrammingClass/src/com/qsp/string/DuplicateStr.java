package com.qsp.string;

public class DuplicateStr {
	public static void main(String[] args) {
		String s = "hhellllo wworldd";
		removeDuplicate(s);
	}

	static void removeDuplicate(String str) {
		char[] ch = str.toCharArray();
		StringBuilder sb = new StringBuilder();

		for (int i = 1; i < ch.length; i++) {
			if (ch[i] == ch[i - 1]) {
				ch[i] = '\u0000';
			}
		}
		System.out.println(ch);
		for (char c : ch) {
			if (c != '\u0000') {
				sb.append(c);
			}
		}
		System.out.println(sb); // hello world
	}
}
