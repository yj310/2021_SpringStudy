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
	<form method="post" action="/register">
		<input type="text" name="name" placeholder="name" value="${requestScope.userDTO.name }"/><br>
		<input type="text" name="id" placeholder="ID" value="${requestScope.userDTO.id }"/><br>
		<input type="password" name="pw" placeholder="PW" value="${requestScope.userDTO.pw }"/><br>
		<input type="text" name="email" placeholder="E-MAIL" value="${requestScope.userDTO.email }"/><br>
		<input type="text" name="address" placeholder="Address" value="${requestScope.userDTO.address }"/><br>
		<input type="text" name="address_detail" placeholder="Address Detail" value="${requestScope.userDTO.address_detail }"/><br>
		<input type="submit" value="Submit"/>
	</form>
</body>
</html>