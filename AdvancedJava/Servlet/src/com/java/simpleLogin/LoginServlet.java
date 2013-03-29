package com.java.simpleLogin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		super.init(config);

		String authorName = config.getInitParameter("author");
		String authorPlace = config.getInitParameter("place");

		System.out.println("Author Name : " + authorName);
		System.out.println("Location : " + authorPlace);

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String contextLevel = getServletContext().getInitParameter("contextParam");

		String authorName = getServletConfig().getInitParameter("author");
		String authorPlace = getServletConfig().getInitParameter("place");

		System.out.println("Author Name : " + authorName);
		System.out.println("Location : " + authorPlace);
		
		String userName = request.getParameter("username");
		String password = request.getParameter("password");

		if ((null != userName) && (null != password)) {
			if((userName.trim().length() > 0) || (password.trim().length() > 0)){
				if (userName.equals("raghu") && password.equals("pass")) {	
					RequestDispatcher rd = request.getRequestDispatcher("/pages/homePage.html");
					rd.forward(request, response);
				}else {
					RequestDispatcher rd = request.getRequestDispatcher("/pages/simpleLogin.html");
					rd.forward(request, response);
				}
			}
		else {
				RequestDispatcher rd = request.getRequestDispatcher("/pages/simpleLogin.html");
				rd.forward(request, response);
			}
		} 
	}

}
