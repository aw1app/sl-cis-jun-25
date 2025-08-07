<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>

<body>
	<h1>Welcome to Amazon Seller Website</h1>
	<br>

	<c:if test="${sessionScope.authenticated}">
		<a href="products.jsp"> PRODUCTS </a> |
	</c:if>

	

	<c:if test="${!sessionScope.authenticated}">
		<a href="login-form.jsp"> LOGIN </a> |
	</c:if>

	<c:if test="${sessionScope.authenticated}">
		<a href="logout.jsp"> LOGOUT </a>
	</c:if>

</body>
</html>