<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="true"%>
	
	<%@ taglib prefix="c" uri="jakarta.tags.core"%>
	
<!DOCTYPE html>
<html>

<body>

<!-- If the user is not authenticated, don't show the products and instead re direct him/her to the login page -->
	<c:if test="${!sessionScope.authenticated}">
		<c:redirect url="login-form.jsp?reason=you are not authorized to see product listing" />
	</c:if>


	<h1>Products List</h1>
</body>
</html>