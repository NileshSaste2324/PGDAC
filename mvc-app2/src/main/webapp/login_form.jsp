<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<form action="login.jsp" method="post">
		<div>
			<label>User Name</label>
			<input type="text" name="uname" placeholder="Enter User Name">
		</div>
		<div>
			<label>Password</label>
			<input type="password" name="upass" placeholder="Enter Password">
		</div>
		<button type="submit">Login</button>
	</form>

</body>
</html>