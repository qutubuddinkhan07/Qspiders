package com.qsp.container;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qsp.repository.StudentRepository;

@WebServlet("/addstudent") // DDL (description deployment tool
public class AddStudent extends HttpServlet {

	private StudentRepository studentRepo = StudentRepository.getInstance();

	@Override
	public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Add student service");
		RequestDispatcher rd = req.getRequestDispatcher("/emptydata");
		String name = req.getParameter("name");
		if (name == null || name.isEmpty()) {
			req.setAttribute("error", "name is empty");
			rd.forward(req, resp);
			return;
		}

		String age = req.getParameter("age");
		if (age == null || age.isEmpty()) {
			req.setAttribute("error", "age is empty");
			rd.forward(req, resp);
			return;
		}

		String phone = req.getParameter("phone");
		if (phone == null || phone.isEmpty()) {
			req.setAttribute("error", "phone is empty");
			rd.forward(req, resp);
			return;
		}

		String email = req.getParameter("email");
		if (email == null || email.isEmpty()) {
			req.setAttribute("error", "email is empty");
			rd.forward(req, resp);
			return;
		}

		System.out.println(name + " " + age + " " + phone + " " + email);

		String response = studentRepo.addStudent(name, age, phone, email); // call repo method

		String text = "<h1>" + response + "</h1>";
		PrintWriter pw = resp.getWriter();
		pw.println(text);
	}
}
