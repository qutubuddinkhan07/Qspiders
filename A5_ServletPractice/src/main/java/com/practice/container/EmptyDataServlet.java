package com.practice.container;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/emptydata")
public class EmptyDataServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String message = (String) req.getAttribute("error");
		String text = "<h1>" + message + "</h1>";
		PrintWriter pw = resp.getWriter();
		pw.println(text);
	}
}
