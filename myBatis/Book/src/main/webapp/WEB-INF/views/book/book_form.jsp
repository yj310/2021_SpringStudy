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

	<h1>Add Book</h1>
	<form method="post" action="/add">
		<input type="text" name="title" placeholder="Title"/><br>
		<input type="text" name="author" placeholder="Author"/><br>
		<input type="text" name="price" placeholder="Price"/><br>
		<input type="submit" value="Add"/>
	</form>
	

</body>
</html>