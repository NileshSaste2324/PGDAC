<%@page import="com.nilesh.entity.Product"%>
<%@page import="com.nilesh.service.ProductServiceImpl"%>
<%@page import="com.nilesh.service.ProductService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
	String p = request.getParameter("no");
	int no= Integer.parseInt(p);
	ProductService productService= new ProductServiceImpl();
	Product product = productService.get(no);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Update</title>
</head>
<body>
	<%@ include file="menu_admin.jsp" %>
	<form action="product_update.jsp" method="post" >
		<input type="hidden" name="no" value="<%=product.getNo() %>" >
		<div>
			<label>Product Name</label>
			<input type="text" name="name" value="<%=product.getName() %>" >
		</div>
		<div>
			<label>Product Price</label>
			<input type="text" name="price" value="<%=product.getPrice() %>" >
		</div>
		<div>
			<label>Product Category</label>
			<select name="category">
			<%
				if(product.getCategory().equals("electric")){
			%>
				<option value="electric" selected="selected">Electric</option>
				<option value="electronic">Electronic</option>
				<option value="home appliances">Home Appliances</option>
			<%
				}else if(product.getCategory().equals("electronic")){
			%>
				<option value="electric" ">Electric</option>
				<option value="electronic" selected="selected">Electronic</option>
				<option value="home appliances">Home Appliances</option>
			<%
				}else{
			%>
				<option value="electric" ">Electric</option>
				<option value="electronic" selected="selected">Electronic</option>
				<option value="home appliances" selected="selected">Home Appliances</option>
			<%
				}
			%>
			</select>
		</div>
		<div>
			<label>Product Price</label>
			<input type="text" name="mdate" placeholder="Date YYYY-MM-DD">
		</div>
		<button type="submit">Update</button>
	</form>
	

</body>
</html>