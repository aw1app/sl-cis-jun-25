<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="true"%>
	
	<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<!DOCTYPE html>
<html>

<body>
	<c:out value="${param.reason}" /> <br>
	
	<h2>Login Here</h2>

	<form action="login.jsp" method="post">
		User name : <input name="username"> <br> <br>
		Password : <input type="password" name="passwd"> <br> <br>
		<input type="submit">
	</form>


</body>
</html>