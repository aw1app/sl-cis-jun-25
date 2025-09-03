<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
				
			</tr>
		</c:forEach>

	</table>


	


</body>
</html>
