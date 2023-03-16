<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee</title>
</head>
<body>
	<form action="emp_add.jsp" method="post">
		<div>
			<label>ID</label>
			<input type="text" name="eid">
		</div>
		<div>
			<label>Name</label>
			<input type="text" name="ename">
		</div>
		<div>
			<label>Salary</label>
			<input type="text" name="sal">
		</div>
		<button type="submit">Add</button>
	</form>

</body>
</html>