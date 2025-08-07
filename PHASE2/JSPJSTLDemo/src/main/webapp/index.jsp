<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>

<body>

<!-- Demo of setting variable and displaying  -->

	<c:set var="x" value="100" />

	<c:out value="${x}" />


</body>
</html>