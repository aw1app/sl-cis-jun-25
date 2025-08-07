<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>

<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="sql" uri="jakarta.tags.sql"%>

<!DOCTYPE html>
<html>

<body>
	
	<sql:setDataSource var="cis_estore_db"
		driver="com.mysql.cj.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/cis_estore" user="root"
		password="rootroot" />


	<sql:update dataSource="${cis_estore_db}" var="count">
	UPDATE users SET UserName='${param.Name}',Email='${param.Email}' WHERE UserID=${param.UserID}
	</sql:update>
	
	<c:out value="${count}" /> User updated successfully!.

	
</body>
</html>