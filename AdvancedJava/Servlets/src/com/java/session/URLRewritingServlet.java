package com.java.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class URLRewritingServlet extends HttpServlet {
	// Initialize global variables

	public void init(ServletConfig config) throws ServletException {

		super.init(config);
	}

	// Process the HTTP Get request
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>URL Rewriting</title></head>");
		out.println("<body>");

		// Encode a URL string with the session id appended
		// to it.
		String url = response
				.encodeRedirectURL("http://localhost:8080/MyServlets/servlet2?sid=5748");

		// Redirect the client to the new URL
		response.sendRedirect(url);

		out.println("</body></html>");
		out.close();
	}

	// Get Servlet information
	public String getServletInfo() {

		return "URLRewritingServlet Information";
	}
}
