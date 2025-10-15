<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<html>

All users

<br>LIST OF PRODUCTS
<br>
<table border=1>
	<tr style="background-color: lightgrey">
		<th>ID
		<th>NAME
		<th>PRICE
		<th>DETAILS
	</tr>

	<c:forEach var="user" items="${userResponses}">
		<tr>
			<td>${user.id}
			<td>${user.username}
			<td>${user.email}
			<td>${user.orderResponses}
			<td><a href="<c:url value='/users/user/${user.id}'/>"> DETAILS </a>
		</tr>
	</c:forEach>
</table>


<br>
<br>
</html>



