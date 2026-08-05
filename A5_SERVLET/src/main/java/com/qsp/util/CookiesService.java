package com.qsp.util;

import javax.servlet.ServletRequest;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class CookiesService {
	private static final CookiesService object = new CookiesService();

	private CookiesService() {
	}

	public static CookiesService getInstance() {
		return object;
	}

	public boolean validateCookies(ServletRequest req) {
		HttpServletRequest request = (HttpServletRequest) req;
		Cookie[] cookies = request.getCookies();
		if (cookies == null || cookies.length == 0) {
			return false;
		}
		for (Cookie cookie : cookies) {
			if (cookie.getName().equals("login") && cookie.getValue().equals(LogInStatus.VALID.getValue())) {
				return true;
			}
		}
		return false;
	}
}
