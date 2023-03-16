
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:useBean id="emp" class="com.nilesh.entity.Employee" scope="session"></jsp:useBean>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
</head>
<body>
	<jsp:getProperty name="emp" property="empId"/><br>
	<jsp:getProperty name="emp" property="empName"/><br>
	<jsp:getProperty name="emp" property="salary"/><br>
</body>
</html>