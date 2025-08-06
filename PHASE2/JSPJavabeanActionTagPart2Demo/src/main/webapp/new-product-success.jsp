<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<body>

<jsp:useBean id="product1" class="com.sl.Product" scope="request"></jsp:useBean>
 


Version 2: New product created successfully!

	<br> name :	    <%=product1.getName()%>
	<br> price :	<%=product1.getPrice()%>
	<br> quantity : <%=product1.getQuantity()%>



<br><br> <a href="index.jsp"> Go Back to Home </a>

</body>
</html>