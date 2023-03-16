<%@page import="com.nilesh.entity.Employee" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
</head>
<body>
	<%
		Employee e =(Employee)session.getAttribute("emp_data");
	%>
	<%=e.getEmpId() %><br>
	<%=e.getEmpName() %><br>
	<%=e.getSalary() %><br>
</body>
</html>