package com.java.servlet.redirect;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletAfterRedirecting extends HttpServlet {

	@Override
	public void init() throws ServletException {
	
		System.out.println("Servlet init() method is called");
	}
	
	@Override
	public void destroy() {
	
		System.out.println("Servlet destroy method is called");
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("This is a new servlet after redirecting.");
		out.println("<br> The url is modified");
		out.println("<br> The user name set in previous servlet is : " + response.getHeader("nameofUser"));
		out.println("</body>");
		out.println("</html>");
		
	}
}
