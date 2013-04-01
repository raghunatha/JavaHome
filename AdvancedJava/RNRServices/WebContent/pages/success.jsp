<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.java.util.Constants"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><%=Constants.APPLICATION_NAME%></title>
</head>
<body style="width: 100%; height: 100%;">
	<jsp:include page="header.jsp" />
	<%
		String user = request.getParameter("username");
		session.setAttribute("username", user);
	%>
	Hello welcome
	<%=user%>
	to the online application
	<jsp:include page="footer.jsp" />
</body>
</html>