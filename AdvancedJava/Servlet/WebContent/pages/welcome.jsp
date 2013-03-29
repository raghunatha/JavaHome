<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="javax.servlet.http.Cookie"%>

<%
	String cookieName = "username";
	Cookie cookies[] = request.getCookies();
	Cookie myCookie = null;
	if (cookies != null) {
		for (int i = 0; i < cookies.length; i++) {
			System.out.print(cookies[i].getValue());
		}
	}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<table align="left" border="0">
		<tr>
			<td><a href="../index.html">HomePage</a></td>
		</tr>
	</table>
	<br>
	<br>
	<%
		String username = ((String) session.getAttribute("username"));
	%>
	<b><%=username%></b> Welcome to the Home Page
</body>
</html>