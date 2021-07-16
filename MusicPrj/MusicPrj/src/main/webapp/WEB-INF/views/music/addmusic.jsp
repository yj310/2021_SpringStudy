<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link href="css/input.css" rel="stylesheet" type="text/css">
	<link href="css/index.css" rel="stylesheet" type="text/css">
</head>


<body>

	
	<h1>Add Music</h1>
	<form method="post" action="/addmusic">
		<input type="text" name="song_title" placeholder="제목"/><br>
		<input type="text" name="song_singer" placeholder="가수"/><br>
		<input type="text" name="song_genre" placeholder="장르"/><br>
		<input type="number" name="song_price" placeholder="가격"/><br>
		<input type="password" name="song_passwd" placeholder="비밀번호"/><br>
		<input type="text" name="song_date" placeholder="발매년도"/><br>
		<input type="submit" value="추가하기"/>
	</form>
	

</body>
</html>