<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<!DOCTYPE html>
<html>

<script>
	function showEditForm(id, name, price) {
		// Fill the hidden edit form with current product data
		document.getElementById("edit-id").value = id;
		document.getElementById("edit-name").value = name;
		document.getElementById("edit-price").value = price;

		// Show the edit form
		document.getElementById("edit-form-container").style.display = "block";

		// Scroll to form
		window.scrollTo(0,	document.getElementById("edit-form-container").offsetTop);
	}
</script>

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
				<td><a href="<c:url value='/product/${product.id}'/>">
						DETAILS </a>
				<td><a style="color: green" href="javascript:void(0)"
					onclick="showEditForm('${product.id}', '${product.name}', '${product.price}')">
						EDIT </a>
				<td><a style="color: red"
					href="<c:url value='/delete-product/${product.id}'/>"> DELETE </a>
			</tr>
		</c:forEach>

	</table>


	<br>
	<br>
	<!-- Hidden Edit Product Form -->
	<div id="edit-form-container" style="display: none;">
		<h2>EDIT PRODUCT</h2>
		<form action="edit-product" method="POST">
			<input type="hidden" id="edit-id" name="id"> 
			NAME: <input id="edit-name" name="name"> 
			PRICE: <input id="edit-price" name="price">
			<input type="submit" value="Update Product">
		</form>
	</div>


	<br>
	<br>
	<h2>ADD NEW PRODUCT</h2>
	<div id="new-form-container">
		<form action="new-product" method="POST">
			NAME : <input name="name"> PRICE <input name="price">
			<input type="submit"><br>
		</form>
	</div>





</body>
</html>

