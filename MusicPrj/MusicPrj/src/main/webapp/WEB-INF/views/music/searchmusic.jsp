<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>Search Music</title>
	<link href="css/search.css" rel="stylesheet" type="text/css">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
	<form class="searchmusic" method="post" action="/searchmusic">
	  <input type="text" name="title" placeholder="Search Title">
	  <button type="submit"><i class="fa fa-search"></i></button>
	</form>
</body>
</html>