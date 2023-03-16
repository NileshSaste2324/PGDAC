<%@page import="com.nilesh.entity.Product"%>
<%@page import="java.util.List"%>
<%@page import="com.nilesh.service.ProductServiceImpl"%>
<%@page import="com.nilesh.service.ProductService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
	ProductService productService =new  ProductServiceImpl();
	List<Product> plist= productService.getAll();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<thead>
			<tr>
				<th>Name</th>
				<th>Price</th>
				<th>Category</th>
				<th>Date</th>
			</tr>
		</thead>
		<tbody>
			<%for(Product p:plist){ %>
				<tr>
					<td><%= p.getName()%></td>
					<td><%= p.getPrice()%></td>
					<td><%= p.getCategory()%></td>
					<td><%= p.getMdate()%></td>
				</tr>
			<% } %>
		</tbody>
	</table>

</body>
</html>