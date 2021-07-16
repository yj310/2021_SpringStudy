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
	            <td>����</td>
	            <td>����</td>
	            <td>����</td>
	            <td>�帣</td>
	            <td>����</td>
	            <td>�߸ų⵵</td>
	            <td>���</td>
	        </tr>
			<c:forEach var="mid" items="${list}">
		        <tr>
		            <td>${mid.id }</td>
		            <td>${mid.song_title }</td>
		            <td>${mid.song_singer }</td>
		            <td>${mid.song_genre }</td>
		            <td>${mid.song_price }</td>
		            <td>${mid.song_date  }</td>
		            <td><a href="/modifymusic?id=${mid.id}" class="link">����</a>  <a href="/deletemusic?id=${mid.id}" class="link">����</a></td>
		        </tr>
			</c:forEach>
		
		</table>
		<br>
	</div>
	
	<jsp:include page="../ui/bottom.jsp"/>
	
</body>
</html>