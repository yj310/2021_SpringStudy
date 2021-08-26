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
		<h1>Add Member</h1>
		<form method="post" action="/add_member">
			<input type="text" name="userid" placeholder="id"/><br>
			<input type="password" name="passwd" placeholder="password"/><br>
			<input type="text" name="name" placeholder="Name"/><br>
			<input type="text" name="email" placeholder="E-MAIL"/><br>
			<input type="submit" value="submit"/>
		</form>
	</div>

</body>
</html>