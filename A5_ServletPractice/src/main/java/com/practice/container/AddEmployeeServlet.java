package com.practice.container;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.practice.repository.EmployeeRepository;

@WebServlet("/adduser")
public class AddEmployeeServlet extends HttpServlet {
	private static EmployeeRepository empRepo = EmployeeRepository.getInstance();

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("/emptydata");

		String username = req.getParameter("username");
		if (username == null || username.isEmpty()) {
			req.setAttribute("error", "username is empty");
			rd.forward(req, resp);
			return;
		}

		String email = req.getParameter("email");
		if (email == null || email.isEmpty()) {
			req.setAttribute("error", "email is empty");
			rd.forward(req, resp);
			return;
		}

		String password = req.getParameter("password");
		if (password == null || password.isEmpty()) {
			req.setAttribute("error", "password is empty");
			rd.forward(req, resp);
			return;
		}

		String role = req.getParameter("role");
		if (role == null || role.isEmpty()) {
			req.setAttribute("error", "role is empty");
			rd.forward(req, resp);
			return;
		}

		System.out.printf("%s, %s, %s, %s \n", username, email, password, role);
		String message = empRepo.addEmployee(username, email, password, role);

		PrintWriter pw = resp.getWriter();
		String response = "<h1>" + message + "</h1>";
		pw.println(response);
	}
}
