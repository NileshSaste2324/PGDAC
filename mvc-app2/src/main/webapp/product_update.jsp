<%@page import="com.nilesh.service.ProductServiceImpl"%>
<%@page import="com.nilesh.service.ProductService"%>
<jsp:useBean id="product" class="com.nilesh.entity.Product" ></jsp:useBean>
<jsp:setProperty property="*" name="product" />


<%
	 ProductService productService= new ProductServiceImpl();
		productService.modify(product);
		response.sendRedirect("product_list.jsp");
	
%>