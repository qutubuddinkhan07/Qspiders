package com.qsp.container;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qsp.util.UserAuthenticationUtil;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private UserAuthenticationUtil userAuth = UserAuthenticationUtil.getInstance();
	// inject --> means inserting another class object in a servlet

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("/emptyuser");
		String username = req.getParameter("username");
		if (username == null || username.isEmpty()) {
			req.setAttribute("error", "Username is empty");
			rd.forward(req, resp);
			return;
		}

		String password = req.getParameter("password");
		if (password == null || password.isEmpty()) {
			req.setAttribute("error", "Password is empty");
			rd.forward(req, resp);
			return;
		}

		String response = "Some unexpected error occured";
		try {
			response = userAuth.userNameAndPasswordAuthenticate(req, resp);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		PrintWriter pw = resp.getWriter();
		String text = "<h1>" + response + "</h1>";
		pw.println(text);
	}
}
