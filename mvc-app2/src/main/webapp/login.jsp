<%@page import="com.nilesh.service.UserServiceImpl"%>
<%@page import="com.nilesh.service.UserService"%>
<jsp:useBean id="user" class="com.nilesh.entity.User" scope="session"></jsp:useBean>
<jsp:setProperty property="*" name="user"/>
<%
	UserService userService= new UserServiceImpl();
	boolean b= userService.login(user);
	if(b){
		response.sendRedirect("product_list.jsp");
	}else{
		response.sendRedirect("login_form.jsp");
	}
%>