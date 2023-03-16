<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Add</title>
</head>
<body>
	<form action="product_add.jsp" method="post">
		<div>
			<label>Product Name</label>
			<input type="text" name="name" placeholder="Enter Product Name">
		</div>
		<div>
			<label>Product Price</label>
			<input type="text" name="price" placeholder="Enter Product price">
		</div>
		<div>
			<label>Product Category</label>
			<select name="category">
				<option value="electric">Electric</option>
				<option value="electronic">Electronic</option>
				<option value="home appliances">Home Appliances</option>
			</select>
		</div>
		<div>
			<label>Product Price</label>
			<input name="mdate" type="text" placeholder="Date YYYY-MM-DD">
			
		</div>
		<button type="submit">Add</button>
	</form>
	

</body>
</html>