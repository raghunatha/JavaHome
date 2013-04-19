package com.java.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ResponseFilter implements Filter {
	private FilterConfig config = null;

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain filterchain) throws IOException, ServletException {
		filterchain.doFilter(request, response);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<b>Filter Received Your Message Successfully:</b>"
				+ config.getInitParameter("response"));
	}

	public void destroy() {
	}

	public void init(FilterConfig config) {
		this.config = config;
	}
}