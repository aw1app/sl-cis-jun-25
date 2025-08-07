<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<!DOCTYPE html>
<html>

<body>

	<c:set var="name" value="Mohan" />

	<c:set var="age" value="30" />


	<c:if test="${age > 18}">
		<p>
			<strong>${name}</strong> is an adult.
		</p>
	</c:if>



</body>
</html>