<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
	<form action="reg.jsp" method="post">
		<div>
			<label>User Name</label>
			<input type="text" name="uname">
		</div>
		<div>
			<label>Password</label>
			<input type="Password" name="upass">
		</div>
		<button type="submit">Register</button>
	</form>
	<a href="login_form.jsp">Back</a>
</body>
</html>