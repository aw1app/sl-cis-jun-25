<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="true"%>
	
	<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>

<body>

	<%
	
	if(session!=null)
	session.invalidate();
	
	%>
	<c:redirect url="index.jsp"/>
	
	
	

</body>


</html>






