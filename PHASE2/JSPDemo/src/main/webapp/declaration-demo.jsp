<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<body>

	<%!int x = 10;%>

	<%!
	int add(int a, int b) 
	{
	return a + b;
	}
	%>
	
	<h2> JSP method output demo :</h2>
	<%	
	
	out.print("x = " + x);
	out.print("<br>");
	out.print("add(4, 5) = " + add(4, 15) );
	%>
	
	
<br><br>
<li> <strong> Task-2:  </strong> 
Create a JSP that demonstrates creating  a applyDiscount method and using it on a price 100.</li>	

</body>
</html>


