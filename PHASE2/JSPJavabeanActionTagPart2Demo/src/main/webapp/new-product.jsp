<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<body>

<jsp:useBean id="product1" class="com.sl.Product" scope="request"></jsp:useBean>
 
 <jsp:setProperty property="*" name="product1" /> 




<jsp:forward page="new-product-success.jsp"></jsp:forward>

<br><br> <a href="index.jsp"> Go Back to Home </a>

</body>
</html>