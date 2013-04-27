<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form action="loginSubmit.html" commandName="loginModel">

<form:errors path="userName" cssStyle="color:red;" htmlEscape="false"></form:errors>
Username : <form:input path="userName"/><br/>
<form:errors path="password" cssStyle="color:red;" htmlEscape="false"></form:errors>
Password : <form:input path="password"/><br/>
<form:button>Submit</form:button>
</form:form>
</body>
</html>