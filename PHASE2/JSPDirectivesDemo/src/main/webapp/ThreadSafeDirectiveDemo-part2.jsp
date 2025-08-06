<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*" isThreadSafe="true"%>

<!DOCTYPE html>
<html>

<body>

	<h1>Welcome to Directives Demo (isThreadSafe is true)</h1>

	<%!// Shared instance variable (is safe by default in multi-threaded env)
	int counter = 0;%>

	<%
	counter++;
	%>

	<h1>Thread-safe Demo (isThreadSafe = true)</h1>
	<p>
		Counter value:
		<%=counter%></p>


	<!-- NOTE: Multiple users (client requests) can access this page concurrently.
         Since 'counter' is a shared instance variable and this page is not synchronized,
         two users might see the same or incorrect counter value (race condition).
         Developer must ensure thread safety (e.g., using synchronization).
    -->

</body>
</html>