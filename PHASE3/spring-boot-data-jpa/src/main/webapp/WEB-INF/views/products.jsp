<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="jakarta.tags.core"%>

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
			<th>EDIT
			<th>DELETE
		</tr>

		<c:forEach var="product" items="${products}">
			<tr>
				<td>${product.id}
				<td>${product.name}
				<td>${product.price}
				<td><a href="<c:url value='/product/${product.id}'/>"> DETAILS </a>
				<td><a style="color:green" href="<c:url value='/edit-product/${product.id}'/>"> EDIT </a>
				<td><a style="color:red" href="<c:url value='/delete-product/${product.id}'/>"> DELETE </a>
			</tr>
		</c:forEach>

	</table>

	<br>
	<br>
	<h2>ADD NEW PRODUCT</h2>
	<form action="new-product" method="POST">
		NAME : <input name="name"> PRICE <input name="price">
		<input type="submit"><br>
	</form>





</body>
</html>

