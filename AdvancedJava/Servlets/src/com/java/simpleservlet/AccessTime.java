package com.java.simpleservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AccessTime
 */
public class AccessTime extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AccessTime() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession(); // Create Session

		response.setContentType("text/html"); // Set Mime Type

		PrintWriter out = null; // Transmitting the response object;
		out = response.getWriter();

		String head = null;
		Integer count = new Integer(0);

		if (session.isNew())
			head = "New Session";
		else {
			head = "Old Session";
			Integer oldCount = (Integer) session.getAttribute("sessionCount");
			if (oldCount != null)
				count = new Integer(oldCount.intValue() + 1);
		}
		session.setAttribute("sessionCount", count);

		out.print("<html><body><h1>" + head + "<br>Count  :" + count
				+ "<br> Creation Date " + new Date(session.getCreationTime())
				+ "<br> Last Accessed "
				+ new Date(session.getLastAccessedTime())
				+ "</h1></body></html>");

	}

}
