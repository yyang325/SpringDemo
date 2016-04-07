<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Result Page</title>
<style type="text/css">
	h2{
		color: green;
	}
</style>
</head>
<body>

<%@page import="com.mercury.beans.User" %>
<jsp:useBean id="userInfo" scope="request" class="com.mercury.beans.UserInfo"/>
<h2><jsp:getProperty property="msg" name="userInfo"/></h2>
<table border="1" style="width: 200px">
	<tr>
		<th>Name</th>
		<th>Age</th>
	</tr>
	
	<c:forEach var="user" items="${userInfo.users}">
		<tr>
			<td>${user.name}</td>
			<td>${user.age}</td>
		</tr>
	</c:forEach>
	 
</table>
</body>
</html>