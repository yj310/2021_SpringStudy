<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link href="css/result_table.css" rel="stylesheet" type="text/css">
</head>
<body>

	<jsp:include page="../ui/top.jsp"/>
	
	<div id="container">
		<h4>Music Model</h4>
		<table>
	        <tr>
	            <td>제목</td>
	            <td>가수</td>
	            <td>장르</td>
	            <td>가격</td>
	            <td>발매년도</td>
	        </tr>
	        <tr>
	            <td>${result.song_title }</td>
	            <td>${result.song_singer }</td>
	            <td>${result.song_genre }</td>
	            <td>${result.song_price }</td>
	            <td>${result.song_date  }</td>
	        </tr>
		</table>
		<p>수정 완료</p>
		<br>
	</div>
	
	<jsp:include page="../ui/bottom.jsp"/>
</body>
</html>