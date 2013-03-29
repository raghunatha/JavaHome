package com.java.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletLifeCycle
 */
@WebServlet("/ServletLifeCycleDemo")
public class ServletLifeCycle extends HttpServlet {

	@Override
	public void init() throws ServletException {
		System.out.println("init method called");
	}

	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<a href=../Servlet/index.html>HomePage</a>");
		out.println("<br>");
		out.println("<br>");
		out.print("<img src='slc.jpg' alt='image' />");
		System.out.println("service method called");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy method called");
	}

}
