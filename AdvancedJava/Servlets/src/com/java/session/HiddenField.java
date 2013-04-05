package com.java.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hidden
 */

public class HiddenField extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet1(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<html>");
		String str1 = req.getParameter("loginId");
		String str2 = req.getParameter("company");
		out.println("From get method");
		out.println("your login name is " + str1);
		out.println("<br>your Company is " + str2);
		out.println("</form>");
		out.println("</body>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<html>");
		String str1 = req.getParameter("loginId");
		String str2 = req.getParameter("company");
		out.println("From post method");
		out.println("your login name is " + str1);
		out.println("<br>your Company is " + str2);
		out.println("</form>");
		out.println("</body>");

	}

}
