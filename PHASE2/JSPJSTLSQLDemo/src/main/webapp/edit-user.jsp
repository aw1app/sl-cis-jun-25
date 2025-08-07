<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="sql" uri="jakarta.tags.sql"%>

<!DOCTYPE html>
<html>

<body>

	<form action="" method="post">
		ID: <input name="UserID"> 
		<input type="submit" value="Edit User">
	</form>

	<br>
	<br>

	<%
	String method = request.getMethod();
	request.setAttribute("isPost", method.equalsIgnoreCase("POST"));
	%>

	<c:if test="${isPost}">
		<c:out value="EDIT USER" />

		<sql:setDataSource var="cis_estore_db"
			driver="com.mysql.cj.jdbc.Driver"
			url="jdbc:mysql://localhost:3306/cis_estore" user="root"
			password="rootroot" />


		<sql:query dataSource="${cis_estore_db}" var="resultSet">
	SELECT * FROM users WHERE UserID=${param.UserID}
	</sql:query>

		<table border=1>
			<c:forEach var="row" items="${resultSet.rows}">
				<tr>
				<form action="save-edited-user.jsp" method="POST">
					<td><input type="text" name="UserID" value="${row.UserID}" readonly />
					<td><input type="text" name="Name" value="${row.Username}" />
					<td><input type="text" name="Email" value="${row.Email}" />
					<td><input type="submit" value="SUBMIT" />
					</form>
				</tr>
			</c:forEach>
		</table>

	</c:if>

</body>
</html>