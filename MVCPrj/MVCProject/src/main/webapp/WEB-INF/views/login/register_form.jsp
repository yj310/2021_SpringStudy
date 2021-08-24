<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link href="css/form.css" rel="stylesheet" type="text/css">
	<link href="css/index.css" rel="stylesheet" type="text/css">
</head>
<body>

	<jsp:include page="../ui/top.jsp"/>
	
	<div class="container">
		<h1>Login</h1>
		<form method="post" action="/register">
			<input type="text" name="name" placeholder="name"/><br>
			<input type="text" name="id" placeholder="ID"/><br>
			<input type="password" name="pw" placeholder="PW"/><br>
			<input type="text" name="email" placeholder="E-MAIL"/><br>
			<input type="text" name="address" placeholder="Address"/><br>
			<input type="text" name="address_detail" placeholder="Address Detail"/><br>
			<input type="submit" value="submit"/>
		</form>
	</div>

</body>
</html>