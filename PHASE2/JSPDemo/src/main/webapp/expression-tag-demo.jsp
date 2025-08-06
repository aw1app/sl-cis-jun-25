<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!DOCTYPE html>
<html>

<body>

	<h1>Welcome to Amazon.com</h1>
	
	Today is <%= "Wednesday" %>
	
	
	<%! 
	java.util.List<String> fruits = new java.util.ArrayList<String>();	
	
	{
		fruits.add("Mango");
		fruits.add("Apple");
	}
		
	%>
	
	
	
	<br><br> 
	Fruit No 1:  <%= fruits.get(0) %>
	
	
	<br><br> 
	Display all fruits:
	<% for (int i=0; i<fruits.size(); i++ ){ %>

	<li> <%= fruits.get(i) %> </li>

	<% } %>

</body>
</html>