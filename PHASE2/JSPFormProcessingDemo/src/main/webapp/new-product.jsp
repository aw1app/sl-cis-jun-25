<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.sl.Product"%>
<!DOCTYPE html>
<html>

<body>

<%

String name = request.getParameter("name");
String priceStr = request.getParameter("price");
float price = Float.parseFloat(priceStr);

Product product =  new Product(name,price );

out.println("New product created successfully! ");
out.println("<br> name :" +  product.getName() );
out.println("<br> price :" +  product.getPrice() );

%>

<br><br> <a href="index.jsp"> Go Back to Home </a>

</body>
</html>