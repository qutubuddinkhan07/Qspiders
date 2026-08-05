package com.qsp.string;

import java.util.Arrays;

public class NumberOfWords {
	public static void main(String[] args) {
		splitStr("my name is khan");
	}

	static void splitStr(String s) {
		String str[] = s.split(" ");
		System.out.println(Arrays.toString(str)); // [my, name, is, khan]
		System.out.println(str.length); // 4
	}
}
