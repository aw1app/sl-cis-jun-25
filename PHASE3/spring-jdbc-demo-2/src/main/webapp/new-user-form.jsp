<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<h1> CREATE a new USER  </h1>


<form  action="new-user" method="POST">


NAME : <input name="name"><br>
EMAIL : <input name="email"><br>


<input type=submit value="submit"><br>

<br><br> <a href="${pageContext.request.contextPath}/index.jsp" > Go back to Home </a>

</form>