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

	
	<h1>Modify Music</h1>
	<form method="post" action="/modifymusic">
		<input type="text" name="id" placeholder="순번" value="${result.id}" readonly/><br>
		<input type="text" name="song_title" placeholder="제목" value="${result.song_title}"/><br>
		<input type="text" name="song_singer" placeholder="가수" value="${result.song_singer}"/><br>
		<input type="text" name="song_genre" placeholder="장르" value="${result.song_genre}"/><br>
		<input type="number" name="song_price" placeholder="가격" value="${result.song_price}"/><br>
		<input type="password" name="song_passwd" placeholder="비밀번호" value="${result.song_passwd}"/><br>
		<input type="text" name="song_date" placeholder="발매년도" value="${result.song_date}"/><br>
		<input type="submit" value="수정하기"/>
	</form>
	

</body>
</html>