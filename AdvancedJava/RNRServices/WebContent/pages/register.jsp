<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

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
<jsp:include page="header.jsp"/>
	<table align="left" border="0">
		<tr>
			<td><a href="../login.jsp">HomePage</a></td>
		</tr>
	</table>
	<center>
		<form action="../pages/jspLogin" method="post">
			<table align="center" border="0">
				<tr>
					<td colspan=3>&nbsp;</td>
				</tr>
				<tr>
					<td colspan=3>&nbsp;</td>
				</tr>
				<tr>
					<td><b>firstname :</b></td>
					<td><input name="firstname" id="firstname" type="text"> <br>
					</td>
				</tr>
				<tr>
					<td><b>lastname :</b></td>
					<td><input name="lastname" id="lastname" type="text"> <br>
					</td>
				</tr>
				<tr>
					<td><b>emailid :</b></td>
					<td><input name="emailid" id="emailid" type="text"> <br>
					</td>
				</tr>
				<tr>
					<td><b>password :</b></td>
					<td><input name="password" id="password" type="text"> <br>
					</td>
				</tr>
				<tr>
					<td><b>confirm password :</b></td>
					<td><input name="cpassword" id="cpassword" type="password">
						<br></td>
				</tr>
				<tr>
					<td colspan =3 style="color:red">
						<%
							String attribute = (String) request.getAttribute("error");
							if (attribute != null) {
						%> <%=attribute%> 
						<%
 							}
 						%>
					</td>
				</tr>
				<tr>
					<td></td>
					<td align="center"><input value="login" type="submit"
						onclick="return isValid();"></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>