package com.qsp.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.qsp.repository.UserRepository;

public class UserAuthenticationUtil {
	private static UserAuthenticationUtil object = new UserAuthenticationUtil();

	private UserAuthenticationUtil() {
	}

	public static UserAuthenticationUtil getInstance() {
		return object;
	}

	private UserRepository userRepo = UserRepository.getInstance();

	public String userNameAndPasswordAuthenticate(HttpServletRequest req, HttpServletResponse resp)
			throws SQLException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		ResultSet rs = userRepo.getUsersByUserName(username);

		String role = null;

		boolean isUserPresent = false;
		boolean isPasswordValidate = false;
		while (rs.next()) {
			isUserPresent = true;
			String dbPassword = rs.getString(2);
			if (password.equals(dbPassword)) {
				isPasswordValidate = true;
				role = rs.getString(3);
				break;
			}
		}
		if (isUserPresent == false) {
			return "User not present with name " + username;
		}
		if (isPasswordValidate == false) {
			return "Invalid password";
		}

		// cookie creation
		Cookie cookie1 = new Cookie("login", LogInStatus.VALID.getValue());
		Cookie cookie2 = new Cookie("role", role);

		// cookie age of expiration
		cookie1.setMaxAge(300); // 5 min
		cookie2.setMaxAge(300);

		resp.addCookie(cookie1);
		resp.addCookie(cookie2);

		HttpSession session = req.getSession();
		session.setAttribute("login", LogInStatus.VALID.getValue());
		session.setAttribute("role", role);

		return "Login success";
	}

}
