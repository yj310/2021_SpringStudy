<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link href="css/result.css" rel="stylesheet" type="text/css">
</head>
<body>

	<jsp:include page="../result/result_top.jsp"/>
	
	<div id="container">
		<h4>Model</h4>
		<p>Title: ${result.title }</p>
		<p>Author: ${result.author }</p>
		<p>Price: ${result.price }</p>
		<p>책 업데이트 완료</p>
		<br>
	</div>
	
	<jsp:include page="../result/result_bottom.jsp"/>
</body>
</html>