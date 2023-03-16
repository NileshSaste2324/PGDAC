<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
</head>
<body>
	<c:out value="Hello"></c:out>
	<br>
	<c:out value="${12+13}"></c:out>
	<br>
	<c:set var="pi" value="${3.14}"></c:set>
	<c:out value="${pi}"></c:out>
	<br>
	<c:if test="${12%2==0}">
		<c:out value="EVEN"></c:out>
	</c:if>
	<br>
	<c:set var="marks" value="${60}"></c:set>
	<c:choose>
		<c:when test="${marks>=75 }">
			<c:out value="A"></c:out>
		</c:when>
		<c:when test="${marks>=60 && marks<75 }">
			<c:out value="B"></c:out>
		</c:when>
		<c:otherwise>
			<c:out value="C"></c:out>
		</c:otherwise>
	</c:choose>
	<br>
	<c:forEach begin="1" end="5" step="1">
		<c:out value="loop:"></c:out>
	</c:forEach>
	

</body>
</html>