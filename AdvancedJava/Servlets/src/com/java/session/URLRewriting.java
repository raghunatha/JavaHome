package com.java.session;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class URLRewriting extends HttpServlet {

public void doGet(HttpServletRequest request, HttpServletResponse response){
		try{

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String n=request.getParameter("userName");
		out.print("Welcome "+n);

		//appending the username in the query string
		out.print("<a href='servlet2?uname="+n+"'>visit</a>");
				
		out.close();

                }catch(Exception e){System.out.println(e);}
	}

}

