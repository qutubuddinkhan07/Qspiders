package com.qsp.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
	public static void main(String[] args) {
		String pattern = "[a-z0-9]{4,}[@]gmail[.]com";
		String matcher = "rockybhai123@gmail.com";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(matcher);
		System.out.println(m.matches());
	}
}
