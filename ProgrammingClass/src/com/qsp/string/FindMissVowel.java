package com.qsp.string;

public class FindMissVowel {
	public static void main(String[] args) {
		String s = "java class";
		missingVowel(s);
		countVowels("java is easy");
	}

	static void missingVowel(String s) {
		String vowels = "aeiou";

		for (int i = 0; i < vowels.length(); i++) {
			char ch = vowels.charAt(i);
			if (s.contains(ch + "") == false) {
				System.out.println(vowels.charAt(i));
			}
		}
		/// <pre>
		/// e
		/// i
		/// o
		/// u
		/// </pre>
	}

	static void countVowels(String s) {
		String vowels = "aeiou";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (vowels.contains(ch + "") == true) {
				count++;
			}
		}
		System.out.println("Number of vowels are: " + count); // 5
	}
}
