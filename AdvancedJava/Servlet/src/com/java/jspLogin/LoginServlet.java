package com.java.jspLogin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		/*System.out.println(request.getLocalAddr());
		System.out.println(request.getLocalName());
		System.out.println(request.getRemoteAddr());
		System.out.println(request.getRemoteHost());
		System.out.println(request.getRemoteUser());*/
		
		String contextLevel = getServletContext().getInitParameter("contextlevel");

		String userName = request.getParameter("username");
		String password = request.getParameter("password");

		if ((null != userName) && (password != null)) {
			if((userName.trim().length() > 0) && (password.trim().length() > 0)){

				if (userName.equals("raghu") && password.equals("pass")) {
					HttpSession session = request.getSession();
					
					session.setAttribute("username", userName);
					Cookie co = new Cookie("ppp","prasad");
					
					response.addCookie(co);
					RequestDispatcher rd = request.getRequestDispatcher("/pages/welcome.jsp");
					rd.forward(request, response);
				} else {
					request.setAttribute("error", "please enter valid username and password");
					RequestDispatcher rd = request.getRequestDispatcher("/pages/jspLogin.jsp");
					rd.forward(request, response);
				}

			} else {
				request.setAttribute("error", "please enter valid username and password");
				RequestDispatcher rd = request.getRequestDispatcher("/pages/jspLogin.jsp");
				rd.forward(request, response);
			}

		}else {
			request.setAttribute("error", "please enter valid username and password");
			RequestDispatcher rd = request.getRequestDispatcher("/pages/jspLogin.jsp");
			rd.forward(request, response);
		}
	}
}

