package com.practice.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.practice.repository.EmployeeRepository;

public class EmployeeAuthenticationUtil {
	private EmployeeRepository empRepo = EmployeeRepository.getInstance();

	private static EmployeeAuthenticationUtil object = new EmployeeAuthenticationUtil();

	private EmployeeAuthenticationUtil() {
	}

	public static EmployeeAuthenticationUtil getInstance() {
		return object;
	}

	public String userNameAndPasswordAuthenticate(HttpServletRequest req, HttpServletResponse res) throws SQLException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");

		ResultSet rs = empRepo.getEmployeeByUserName(username);
		String role = null;

		boolean isUserPresent = false;
		boolean isPasswordValidate = false;

		while (rs.next()) {
			isUserPresent = true;
			String dbPassword = rs.getString(3);
			if (password.equals(dbPassword)) {
				isPasswordValidate = true;
				role = rs.getString(3);
				break;
			}
		}

		if (isUserPresent == false) {
			return "User not present";
		}

		if (isPasswordValidate == false) {
			return "Invalid password";
		}

		Cookie cookie1 = new Cookie("login", "valid");
		Cookie cookie2 = new Cookie("role", role);

		res.addCookie(cookie1);
		res.addCookie(cookie2);

		return "Login Success";
	}
}
