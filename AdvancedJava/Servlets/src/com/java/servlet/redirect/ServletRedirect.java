package com.java.servlet.redirect;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletRedirect extends HttpServlet {

	@Override
	public void init() throws ServletException {

		System.out.println("Servlet init() method is called");
	}

	@Override
	public void destroy() {

		System.out.println("Servlet destroy method is called");
	}

	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		/*
		 * Destination, it can be any relative or context specific path. if the
		 * path starts without '/' it is interpreted as relative to the current
		 * request URI. if the path starts with '/' it is interpreted as
		 * relative to the context.
		 */

		String destination = "rediretToThis";
		// String destination = "/login.html";
		response.setHeader("nameofUser", "raghu");
		response.sendRedirect(response.encodeRedirectURL(destination));
		//response.sendRedirect(response.encodeRedirectURL("http://www.google.com"));
	}
}
