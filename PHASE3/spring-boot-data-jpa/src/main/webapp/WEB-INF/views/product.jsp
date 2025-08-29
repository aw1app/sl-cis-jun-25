<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="sql" uri="jakarta.tags.sql"%>

<!DOCTYPE html>
<html>

<head>
    <title>Product Details</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 30px;
            background-color: #f9f9f9;
        }
        .container {
            max-width: 600px;
            background: #fff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0,0,0,0.1);
        }
        h2 {
            margin-bottom: 20px;
            color: #333;
        }
        .detail {
            margin: 10px 0;
            font-size: 18px;
        }
        .label {
            font-weight: bold;
            color: #555;
        }
        a {
            display: inline-block;
            margin-top: 20px;
            text-decoration: none;
            background: #007bff;
            color: white;
            padding: 10px 15px;
            border-radius: 5px;
        }
        a:hover {
            background: #0056b3;
        }
    </style>
</head>



<body class="container">

	<h2>Product Details</h2>

	<c:if test="${not empty product}">
		<div class="detail">
			<span class="label">ID:</span> ${product.id}
		</div>
		<div class="detail">
			<span class="label">Name:</span> ${product.name}
		</div>
		<div class="detail">
			<span class="label">Price:</span> ₹${product.price}
		</div>
	</c:if>

	<c:if test="${empty product}">
		<p style="color: red;">Product not found!</p>
	</c:if>
	
	
	<a href="<c:url value='/'/>">Back to Home</a>

</body>
</html>
	
	