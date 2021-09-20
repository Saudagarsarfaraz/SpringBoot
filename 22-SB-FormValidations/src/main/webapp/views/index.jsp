<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>User Data</h2>
	<form:form action="saveData" modelAttribute="user" method="post">
		<table>
			<tr>
				<td>Username :</td>
				<td><form:input path="uName" /></td>
				<td><form:errors path="uName"/></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><form:password path="pwd" /></td>
				<td><form:errors path="pwd"/></td>
			</tr>
			<tr>
				<td>Email :</td>
				<td><form:input path="email" /></td>
				<td><form:errors path="email"/></td>
			</tr>
			<tr>
				<td>Phone Number :</td>
				<td><form:input path="phno" /></td>
				<td><form:errors path="phno"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="submit"> </td>
			</tr>
		</table>

	</form:form>

</body>
</html>