<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="sql" uri="jakarta.tags.sql"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LIST of USERS</title>
</head>
<body>


	<h1>USERS LIST</h1>

	<c:forEach var="user" items="${users}">	
	
		${user.userID }, ${user.name }, ${user.email } , <a href="delete-user/${user.userID}"> DELETE </a> <br/>


		</c:forEach>


<br><br> <a href="${pageContext.request.contextPath}/index.jsp" > Go back to Home </a>

</body>
</html>