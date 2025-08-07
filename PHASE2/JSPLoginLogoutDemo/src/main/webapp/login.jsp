<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="true"%>
	
	<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>

<body>

	<%	
	
	String userName = request.getParameter("username");
	String passwd = request.getParameter("passwd");

	//some dummy check
	if (userName.equalsIgnoreCase("admin") && passwd.equals("00000000")) {
		session.setAttribute("authenticated", true);
	}	
	%>
	
	<c:if test="${sessionScope.authenticated}">
		<p>
			<strong> You have successfully logged in </strong> <br><br>
			<a href="index.jsp"> Go Back To Home Page </a> |
		</p>
	</c:if>
	
	<c:if test="${!sessionScope.authenticated}">
		<c:redirect url="login-form.jsp"/>
	</c:if>
	

</body>


</html>






