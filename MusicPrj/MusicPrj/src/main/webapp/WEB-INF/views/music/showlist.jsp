<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Show Music List</title>
	<link href="css/result_table.css" rel="stylesheet" type="text/css">

</head>
<body>

	<jsp:include page="../ui/top.jsp"/>
	
	<div id="container">
		<h4>Show Music List</h4>
		<table>
	        <tr>
	            <td>순번</td>
	            <td>제목</td>
	            <td>가수</td>
	            <td>장르</td>
	            <td>가격</td>
	            <td>발매년도</td>
	            <td>비고</td>
	        </tr>
			<c:forEach var="mid" items="${list}">
		        <tr>
		            <td>${mid.id }</td>
		            <td>${mid.song_title }</td>
		            <td>${mid.song_singer }</td>
		            <td>${mid.song_genre }</td>
		            <td>${mid.song_price }</td>
		            <td>${mid.song_date  }</td>
		            <td><a href="/modifymusic?id=${mid.id}" class="link">수정</a>  <a href="/deletemusic?id=${mid.id}" class="link">삭제</a></td>
		        </tr>
			</c:forEach>
		
		</table>
		<br>
	</div>
	
	<jsp:include page="../ui/bottom.jsp"/>
	
</body>
</html>