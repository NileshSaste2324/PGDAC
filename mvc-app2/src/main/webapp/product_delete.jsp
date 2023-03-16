<%@page import="com.nilesh.service.ProductServiceImpl"%>
<%@page import="com.nilesh.service.ProductService"%>
<%
	String p= request.getParameter("no");
 	int no= Integer.parseInt(p);
 	
 	ProductService productSrvice = new ProductServiceImpl();
 	productSrvice.remove(no);
 	response.sendRedirect("product_list.jsp");
%>