package com.java.simpleservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
	
		System.out.println("Servlet init() method is called");
	}
	
	@Override
	public void destroy() {
	
		System.out.println("Servlet destroy method is called");
	}
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String companyName = getInitParameter("company");
		
		System.out.println("ServletContext Name : " + getServletContext().getServletContextName());
		System.out.println("Context Path : " + getServletContext().getContextPath());
		
		System.out.println(getServletContext().getInitParameter("instructor"));		
		System.out.println(getServletConfig().getInitParameter("company"));		
		getServletContext().setInitParameter("Address", "350 WalNut Hill Ln,Irving");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Welcome to "+companyName+" from Hello Servlet");
		out.println("</body>");
		out.println("</html>");
		
		
		
	}
}
