<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.java.util.Constants"%>
<%@include file="/pages/header.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><%=Constants.APPLICATION_NAME %></title>

<script type="text/javascript">
	function isValid() {
		var userName = document.getElementById('userid').value;
		if (userName == "") {
			alert('please enter username')
			document.getElementById('userid').focus();
			return false;
		}
		var password = document.getElementById('password').value;
		if (password == "") {
			alert('please enter password')
			document.getElementById('password').focus();
			return false;
		}
	}
</script>

</head>
<body style="width: 100%; height: 100%;">
	<center>
		<form action="login" method="post">
			<table align="center" border="0" bgcolor="COCOCO">
				<tr>
					<td colspan=3>&nbsp;</td>
				</tr>
				<tr>
					<td colspan=3>&nbsp;</td>
				</tr>
				<tr>
					<td><b>username :</b></td>
					<td><input name="username" id="userid" type="text"> <br>
					</td>
				</tr>
				<tr>
					<td><b>password :</b></td>
					<td><input name="password" id="password" type="password">
						<br></td>
				</tr>
				<tr>
					<td colspan=3 style="color: red">
						<%
							String attribute = (String) request.getAttribute("loginError");
							if (attribute != null) {
						%> <%=attribute%> <%
 						}
				 		%>
					</td>
				</tr>
				<tr>
					<td></td>
					<td>
						<p>
							<a href="/RNRServices/pages/register.jsp">Register</a> <input
								value="login" type="submit" onclick="return isValid();">
						</p>
					</td>
				</tr>
			</table>
		</form>
	</center>
<jsp:include page="/pages/footer.jsp"/>	
</body>
</html>