<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	<form method="post" action="/login">
		<input type="text" name="id" placeholder="ID"/><br>
		<input type="password" name="pw" placeholder="PW"/><br>
		<input type="text" name="email" placeholder="E-MAIL"/><br>
		<input type="submit" value="Login"/>
	</form>

</body>
</html>