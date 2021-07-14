<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
		<h4>Book List</h4>
		<c:forEach var="name" items="${list}">
			<p>Title: ${name.title }</p>
			<p>Author: ${name.author }</p>
			<p>Price: ${name.price }</p>
			<br>
		</c:forEach>
		<br>
	</div>
	
	<jsp:include page="../result/result_bottom.jsp"/>
</body>
</html>