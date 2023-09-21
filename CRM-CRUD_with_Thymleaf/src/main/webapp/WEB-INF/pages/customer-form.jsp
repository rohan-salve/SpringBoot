<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SAVE Customer</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" >
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/add-customer-style.css" >
</head>
<body>
	<div id = "wrapper">
		<div id = "header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>
	<div id = "container">
		<h3>SAVE Customer</h3>
		<form:form action="saveCustomer" method="post" modelAttribute="customer">
			<form:hidden path="id"/>
			<table>
				<tbody>
					<tr>
						<td>First Name</td>
						<td><form:input path="firstName"/></td>
					</tr>
					<tr>
						<td>Last Name</td>
						<td><form:input path="lastName"/></td>
					</tr>
					<tr>
						<td>Email</td>
						<td><form:input path="email"/></td>
					</tr>
					<tr>
						<td></td>
						<td><input type='submit' value='save' class='save'/></td>
					</tr>
				</tbody>
			</table>
		</form:form>
	</div>
</body>
</html>