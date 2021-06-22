<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link href="css/login.css" rel="stylesheet" type="text/css">
	<link href="css/index.css" rel="stylesheet" type="text/css">
</head>

<body>

	<h1>Login</h1>
	 
	<form:form action="/test2_result" modelAttribute="userDTO">
		<form:input path="name"/><br>
		<form:input path="id"/><br>
		<form:input path="pw"/><br>
		<form:input path="email"/><br>
		<form:input path="address"/><br>
		<form:input path="address_detail"/><br>
		<input type="submit" value="Submit"/>
	</form:form>
	
</body>
</html>