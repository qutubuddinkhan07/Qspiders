package com.qsp.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainClass {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("a?");
		Matcher matcher = pattern.matcher("aba");
		while (matcher.find()) {
			System.out.println("[" + matcher.group() + "]");
		}
		/// <pre>
		/// [a]
		/// []
		/// [a]
		/// []
		/// </pre>
	}
}
