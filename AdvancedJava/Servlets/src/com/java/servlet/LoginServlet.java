package com.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		String username = req.getParameter("username");
		String password = req.getParameter("password");

		String superUser = getServletConfig().getInitParameter("superUser");
		String superPass = getServletConfig().getInitParameter("superPassword");
		System.out.println("User entered username : " + username);
		System.out.println("User entered password : " + password);
		System.out.println("Instructor for this class is : " + getServletContext().getInitParameter("instructor"));
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		/*out.println("<html>");
		out.println("<body>");
		out.println("Login is restricted because of missing username/password");
		out.println("</body>");
		out.println("</html>");*/
		if (null != username && null != password) {
			if (username.equals(superUser) && password.equals(superPass)) {
				resp.sendRedirect("loginSuccess.html");
			} else {
				resp.sendRedirect("login.html");				
			}
		} else {
			resp.sendRedirect("login.html");
			out.println("Login is restricted because of wrong username/password");
		}
	}

}
