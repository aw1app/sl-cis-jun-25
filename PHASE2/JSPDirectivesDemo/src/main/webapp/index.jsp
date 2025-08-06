<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*"  errorPage="myerrorpage.jsp"%>
	
<!DOCTYPE html>
<html>

<body>

	<h1>Welcome to Directives Demo</h1>
	
	
	<%! 
	List<String> fruits = new ArrayList<String>();	
	
	{
		fruits.add("Mango");
		fruits.add("Apple");
	}
		
	%>
	
	
	
	<br><br> 
	Fruit No 1:  <%= fruits.get(100) %>
	
	
<p>
Task-4: Create a JSP page that accepts two integers in two text boxes.
Then it outputs the value of their division.

Tell the users not to type 0 in the second textbox, even thought they might do it.
So you need to create the error page to avoid showing the exception stack trace to the end user.
</p>	

</body>
</html>