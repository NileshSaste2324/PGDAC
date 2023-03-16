<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3><%=new Date() %></h3>
	<form action="divide.jsp">
		<div>
			<label>Num1</label>
			<input type="text" name="num1">
		</div>
		<div>
			<label>Num2</label>
			<input type="text" name="num2">
		</div>
		<button type="submit">Divide</button>
	</form>

</body>
</html>