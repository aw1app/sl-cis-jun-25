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
	
		${user.UserID }, ${user.name }, ${user.email } <br/>


		</c:forEach>


</body>
</html>