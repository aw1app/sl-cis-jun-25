<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<body>

<%

String name = request.getParameter("name");
String priceStr = request.getParameter("price");
float price = Float.parseFloat(priceStr);

out.println("New product created successfully! ");
out.println("name :" +  name );
out.println("price :" +  price );

%>

</body>
</html>