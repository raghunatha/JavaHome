<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.java.util.Constants"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><%=Constants.HEADER_NAME%></title>
</head>
<body>
	<table width="100%" height="20%" bgcolor="Orange">
		<tr>
			<td align="center" style="colour: purple; font-style: italic;">
				<b><%=Constants.APPLICATION_NAME%></b>
			</td>
		</tr>
	</table>
	<%
		String user =(String) request.getAttribute("reqname");
		if(user != null) {
	%>
	<table width="100%" height="20%" >
		<tr>
			<td align="right"><a href="login.jsp">logout</a></td>
			<td> </td>
		</tr>
	</table>
	<%} %>
</body>
</html>