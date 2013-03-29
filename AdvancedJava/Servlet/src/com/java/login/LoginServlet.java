package com.java.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.core.ApplicationContext;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		super.init(config);	
	}


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//if the user sends a get request the doPost will be called and the request will be served
		doPost(request, response);
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		/*
		 * Each servlet will have its own servlet config
		 */
		String authorName = getServletConfig().getInitParameter("author");
		String authorPlace = getServletConfig().getInitParameter("place");

		System.out.println("Author Name : " + authorName);
		System.out.println("Location : " + authorPlace);

		/*
		 * One servlet context can be shared by all servlets in the application
		 */
		String contextLevel = getServletContext().getInitParameter("contextParam");
		
		/*
		 * The values submitted by the user are bound to the request object and
		 * they can be retrieved by using request.getParameter
		 */
		String userName = request.getParameter("username");
		String password = request.getParameter("password");

		if((null != userName) && (null != password)){
			if((userName.trim().length() > 0) || (password.trim().length() > 0)){
				if (userName.equals("raghu") && password.equals("pass")) {
	
					response.setContentType("text/html");
					PrintWriter out = response.getWriter();
	
					//The user needs to build the whole page to be displayed
					out.println("<HTML>");
					out.println("<HEAD><TITLE>Hello World </TITLE></HEAD>");
					out.println("<BODY>");
					out.println("<a href=../index.html>HomePage</a></td>");
					out.println("<br>");
					out.println("<br>");
					out.println("Hi User <b>" + userName + "</b>");
					out.println("<br>");
					out.println("<br>");
					out.println("Author name <b>" + authorName);
					out.println("</b>");
					out.println("<br>");
					out.println("Author location <b>" + authorPlace + "</b>");
					out.println("</BODY></HTML>");
				} 
			}
		}else {
			String destination = "/pages/login.html"; 
			RequestDispatcher rd = request.getRequestDispatcher(destination);
			rd.forward(request, response);
		}
	}	
}
