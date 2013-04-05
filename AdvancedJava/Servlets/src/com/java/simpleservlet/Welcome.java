package com.java.simpleservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Welcome
 */
@WebServlet("/Welcome")
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Welcome() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {		
		super.service(request, response);
		// Service method call in a servlet
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<br>From service method ");
		out.println("<br>Date and Time at Server" + new Date());
		out.println("<br>");
		out.println("</body>");
		out.println("</html>");

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// This is the default method called in a servlet
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<br>From get method ");
		out.println("<br> Date and Time at Server" + new Date());
		out.println("<br>");
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<br>");
		out.println("From post method");
		out.println("</body>");
		out.println("</html>");
	}

}
