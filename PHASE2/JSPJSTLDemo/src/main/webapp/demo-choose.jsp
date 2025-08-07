<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<!DOCTYPE html>
<html>

<body>

	<c:set var="name" value="Mohan" />

	<c:set var="age" value="4" />


	<c:choose>

		<c:when test="${age > 18}">
			<strong>${name}</strong> is an adult.
	</c:when>

		<c:when test="${age < 18}">
			<strong>${name}</strong> is an minor.
	</c:when>


		<c:otherwise>
			<strong>${name}</strong> has just become an adult.
	</c:otherwise>

	</c:choose>



</body>
</html>