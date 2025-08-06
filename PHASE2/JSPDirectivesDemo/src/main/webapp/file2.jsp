<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
<h1> JSP include directive demo </h1>

<p>This is content from <strong>file2.jsp</strong></p>


<%@ include file="file1.jsp"   %>


<p>This is also content from <strong>file2.jsp</strong></p>

</body>
</html>


<p>
Task-5:  Create navbar.jsp which Home, Products, Login/Logout links.
<br> Then using the include directive use this navbar.jsp in all other JSPs.

 </p>