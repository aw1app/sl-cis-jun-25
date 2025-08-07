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


	<br>
	<br>
	<c:forEach var="i" begin="1" end="5">
 Item <c:out value="${i}" />
		<p>
	</c:forEach>


</body>
</html>