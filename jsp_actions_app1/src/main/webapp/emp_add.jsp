
    
<jsp:useBean id="emp" class="com.nilesh.entity.Employee" scope="session" ></jsp:useBean>
<jsp:setProperty name="emp" property="*"></jsp:setProperty>
<%
response.sendRedirect("emp_show.jsp");
%>
