package com.java.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreatingCookies extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException {

		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		Cookie cookie = new Cookie("ID", "123");		
		cookie.setMaxAge(60 * 60); // 1 hour
		response.addCookie(cookie);
		
		Cookie cookie1 = new Cookie("Message", "Hello User");		
		cookie1.setMaxAge(60 * 60); // 1 hour
		response.addCookie(cookie1);
		
		pw.println("Cookies created");
	}
}
