package com.qsp.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import com.qsp.util.CookiesService;
import com.qsp.util.SessionService;

@WebFilter(urlPatterns = { "/addstudent", "/adduser" })
public class RequestAuthenticationFilter implements Filter {
	private CookiesService cookiesService = CookiesService.getInstance();
	private SessionService sessionService = SessionService.getInstance(); // for session

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		// filter initialization
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Security filter is activated");
		if (cookiesService.validateCookies(request)) {
			sessionService.validateSession(request); // for session
			chain.doFilter(request, response);
			return;
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			rd.forward(request, response);
			return;
		}
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}
}
