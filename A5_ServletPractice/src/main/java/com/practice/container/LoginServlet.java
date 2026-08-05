package com.practice.container;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.practice.utils.EmployeeAuthenticationUtil;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private EmployeeAuthenticationUtil empAuth = EmployeeAuthenticationUtil.getInstance();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("/emptydata");

		String username = req.getParameter("username");
		if (username == null || username.isEmpty()) {
			req.setAttribute("error", "username is empty");
			rd.forward(req, resp);
			return;
		}

		String password = req.getParameter("password");
		if (password == null || password.isEmpty()) {
			req.setAttribute("error", "password is empty");
			rd.forward(req, resp);
			return;
		}

		String response = "Some unexpected error occurred";

		try {
			response = empAuth.userNameAndPasswordAuthenticate(req, resp);
		} catch (SQLException e) {
			e.printStackTrace();
		}

//		System.out.println(username + " " + password);

		PrintWriter pw = resp.getWriter();
		String text = "<h1>" + response + "</h1>";
		pw.println(text);
	}
}
