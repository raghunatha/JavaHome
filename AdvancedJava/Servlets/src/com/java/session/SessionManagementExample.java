package com.java.session;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionManagementExample")
public class SessionManagementExample extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		Date creationTime = new Date(session.getCreationTime());
		Date lastAccessedTime = new Date(session.getLastAccessedTime());
		Integer count;
		count = (Integer) session.getAttribute("Count");
		if (count == null) {
			count = 0;
		} else {
			count = new Integer(count + 1);
		}
		session.setAttribute("Count", count);
		try {
			out.println("<h2>Sevlet Session Example</h2>");
			if (count == 0 || count == 1) {
				out.println("<b>In current session this site is accessed "
						+ count + " time.</b>");
			} else
				out.println("<b>In current session this site is accessed "
						+ count + "times. </b>");
			out.println("<br>Session ID = (" + session.getId() + ")</br>");
			out.println("<br>Session creation time = (" + creationTime + ")");
			out.println("<br>Session last accessed time (" + lastAccessedTime
					+ ")");
			out.println("<br>The complete url = " + request.getRequestURL());
		} catch (Exception ex) {
			out.println(ex);
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}