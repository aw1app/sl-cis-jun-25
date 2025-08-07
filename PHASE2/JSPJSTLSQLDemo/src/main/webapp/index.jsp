<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="sql" uri="jakarta.tags.sql"%>

<!DOCTYPE html>
<html>

<body>
	<sql:setDataSource var="cis_estore_db"
		driver="com.mysql.cj.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/cis_estore" user="root"
		password="rootroot" />


	<sql:query dataSource="${cis_estore_db}" var="resultSet">
	SELECT * FROM users
	</sql:query>


	<br>LIST OF USERS<br>
	<table border=1>
		<tr style="background-color: lightgrey">
			<th>ID
			<th>NAME
			<th>EMAIL
		</tr>

		<c:forEach var="row" items="${resultSet.rows}">
			<tr>
				<td>${row.UserID}
				<td>${row.Username}
				<td>${row.Email}
			</tr>
		</c:forEach>

	</table>
</body>
</html>