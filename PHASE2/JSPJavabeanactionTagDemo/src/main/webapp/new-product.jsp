<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<body>

<jsp:useBean id="product1" class="com.sl.Product"></jsp:useBean>
 
 <jsp:setProperty property="*" name="product1" /> 

<%

out.println("Version 2: New product created successfully! ");
out.println("<br> name :" +  product1.getName() );
out.println("<br> price :" +  product1.getPrice() );
out.println("<br> price :" +  product1.getQuantity() );

%>

<br><br> <a href="index.jsp"> Go Back to Home </a>

</body>
</html>