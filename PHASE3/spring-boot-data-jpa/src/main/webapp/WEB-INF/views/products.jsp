<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="sql" uri="jakarta.tags.sql"%>

<!DOCTYPE html>
<html>

<body>

	<br>LIST OF PRODUCTS
	<br>
	<table border=1>
		<tr style="background-color: lightgrey">
			<th>ID
			<th>NAME
			<th>PRICE
			<th>DETAILS
		</tr>

		<c:forEach var="product" items="${products}">
			<tr>
				<td>${product.id}
				<td>${product.name}
				<td>${product.price}
				<td><a href="<c:url value='/product/${product.id}'/>"> DETAILS </a>
			</tr>
		</c:forEach>

	</table>





</body>
</html>

