package com.java.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AccessingCookies extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException {

		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		Cookie[] cookie = request.getCookies();
		pw.println("All Cookies in your browsers");

		for (Cookie obj : cookie) {			
			
			pw.println(obj.getName() + " : " + obj.getValue());
			pw.println("<br>");

			/*if (obj.getName().equals("cookie1")) {
				pw.println(obj.getName() + " : " + obj.getValue());
				break;
			}*/
		}
	}
}
