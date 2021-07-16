<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>Search Music</title>
	<link href="css/checkpassword.css" rel="stylesheet" type="text/css">
</head>
<body>
	<form class="searchmusic" method="post" action="/checkDeletePassword?id=${param.id}">
	  <input type="password" name="passwd" placeholder="password">
	  <input type="submit" value="확인">
	</form>
</body>
</html>