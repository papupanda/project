<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Registration Page</h1>

<form:form action="save" method="POST" modelAttribute="emp">
<table>
<tr>
<th>Employee Name</th>
<td><form:input path="empname"/></td>
</tr>

<tr>
<th>Employee Salary</th>
<td><form:input path="salary"/></td>
</tr>
<tr>
<th>Employee Mobilenmber</th>
<td><form:input path="mobilenum"/></td>
</tr>
<tr>
<td><input type="submit" value="Submit"/></td>
<td>${sucess}</td>
</tr>
</table>

</form:form>

</body>
</html>