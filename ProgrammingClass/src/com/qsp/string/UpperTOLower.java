package com.qsp.string;

public class UpperTOLower {
	public static void main(String[] args) {
		String s = "heLLO WorLd";
		changeCase(s);
		// System.out.println((char) ('A' + 32)); // a
		// System.out.println((char) ('a' - 32)); // A
	}

	static void changeCase(String s) {
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z') {
				ch[i] = (char) (ch[i] - 32);
			} else if (ch[i] >= 'A' && ch[i] <= 'Z') {
				ch[i] = (char) (ch[i] + 32);
			}
		}
		String res = new String(ch);
		System.out.println(res); // HEllo wORlD
	}
}
