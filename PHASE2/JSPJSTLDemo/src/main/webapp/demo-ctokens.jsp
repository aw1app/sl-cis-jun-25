<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<!DOCTYPE html>
<html>

<body>

	<c:set var="csv" value="apple,banana,mango,orange,grape" />

	<h3>Fruits List:</h3>
	<ul>
		<c:forTokens items="${csv}" delims="," var="fruit">
			<li><c:out value="${fruit}" /></li>
		</c:forTokens>
	</ul>


</body>
</html>