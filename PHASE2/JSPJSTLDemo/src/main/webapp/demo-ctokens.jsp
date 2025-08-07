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

<!-- 
Task-1: Given name, salary and address in the form NAME,SALARY, DOORNO, STREET, CITY, PINCODE.
and you have 4 people's data array.
Then display only those names whose salary is > 50000
-->