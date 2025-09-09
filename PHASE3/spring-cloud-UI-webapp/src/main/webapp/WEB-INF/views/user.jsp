<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<html>



<br>Details of User
<br>
<table border=1>
	<tr style="background-color: lightgrey">
		<th>ID
		<th>NAME
		<th>PRICE
		<th>ORDERS
	</tr>

	
		<tr>
			<td>${userResponse.id}
			<td>${userResponse.username}
			<td>${userResponse.email}
			<td>
			<c:forEach var="order" items="${orderResponses}"> 
			Order Id: ${order.orderId} (INR ${order.amount} , ${order.products.size()} products) <br>
			</c:forEach>
			</td>
		</tr>
</table>


<br>
<br>
</html>



