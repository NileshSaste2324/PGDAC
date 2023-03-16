<%@page import="java.sql.PreparedStatement" %>
<%@page import="java.sql.DriverManager" %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.ResultSet" %>
<%
	String unm=request.getParameter("uname");
	String pass=request.getParameter("upass");
	boolean flag=false;
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/webjava","root","Nilesh@2324");
	PreparedStatement s = con.prepareStatement("select * from user where uname=? and upass=?");
	s.setString(1,unm);
	s.setString(2,pass);
	ResultSet rs = s.executeQuery();
	if(rs.next()){
		flag=true;
	}
	con.close();
	if(flag){
		response.sendRedirect("home.jsp");
	}else{
		response.sendRedirect("login_form.jsp");
	}
%>