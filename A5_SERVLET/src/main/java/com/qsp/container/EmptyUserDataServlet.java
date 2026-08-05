package com.qsp.container;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/emptyuser")
public class EmptyUserDataServlet extends HttpServlet {
	@Override
	public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String message = (String) req.getAttribute("error");
		PrintWriter pw = resp.getWriter();
		String response = "<h1>" + message + "</h1>";
		pw.println(response);
	}
}
