<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*" isThreadSafe="false" %>
	
<!DOCTYPE html>
<html>

<body>

	<h1>Welcome to Directives Demo (isThreadSafe is false)</h1>

	<%!// Shared instance variable (not safe by default in multi-threaded env)
	int counter = 0;
	%>
	
	<%
        counter++;
    %>

    <h1>Thread-safe Demo (isThreadSafe = false)</h1>
    <p>Counter value: <%= counter %></p>


<!-- Because isThreadSafe="false", the container handles one request at a time.
     So, even if multiple users access this page simultaneously,
     the counter will increment safely in sequence.
-->

</body>
</html>