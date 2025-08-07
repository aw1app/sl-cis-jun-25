<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<!DOCTYPE html>
<html>

<body>

	<c:set var="fruits" value="${ ['Apple', 'Banana', 'Mango'] }" />

	<h3>Fruit List:</h3>
	<ul>
		<c:forEach var="fruit" items="${fruits}">
			<li><c:out value="${fruit}" /></li>
		</c:forEach>
	</ul>




</body>
</html>