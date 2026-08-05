package com.qsp.string;

public class Encryption {
	public static void main(String[] args) {
		String enc = encrypt("abcdefstuvwxyz", 105);
		String dec = decryption(enc, 105);
		System.out.println("Original String: abcdefstuvwxyz");
		System.out.println("After encryption: " + enc);
		System.out.println("After decryption: " + dec);
	}

	static String encrypt(String s, int key) {
		// rule for modularing n % x => [0 to x-1]
		// x --> degree of the system
		// for binary [bi]2 => [0, 1]
		// for decimal [dec]10 => [0, .., 9]
		key = key % 26;
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			char c = s.charAt(i);
			if (c + key <= 'z') {
				ch[i] = (char) (ch[i] + key);
			} else {
				int limit = 'z' - c;
				int left = key - limit;
				char newchar = (char) ('a' + left - 1);
				ch[i] = newchar;
			}
		}
		System.out.println(new String(ch)); // fghijkxyzabcde
		return new String(ch);
	}

	static String decryption(String s, int key) {
		key = key % 26;
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			char c = s.charAt(i);
			if (c - key >= 'a') {
				ch[i] = (char) (ch[i] - key);
			} else {
				int limit = c - 'a';
				int left = key - limit;
				char newchar = (char) ('z' - left + 1);
				ch[i] = newchar;
			}
		}
		// System.out.println(new String(ch));
		return new String(ch);
	}
}
