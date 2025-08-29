
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<!DOCTYPE html>
<html>

<head>
<title>Edit Product</title>

<h2>EDIT PRODUCT</h2>

<form action="/edit-product" method="POST">
	ID : <input type="hidden" name="id" value="${product.id }" readonly> <br>
	NAME : <input name="name" value="${product.name }"> <br> <br>
	PRICE : <input name="price" value="${product.price }"><br>
	<br> <input type="submit" value="Save"><br>
</form>


<a href="<c:url value='/'/>">Back to Home</a>
</body>
</html>