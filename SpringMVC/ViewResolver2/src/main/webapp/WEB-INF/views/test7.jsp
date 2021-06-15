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

	<jsp:include page="result_top.jsp"/>
	
	<div id="container">
		<h4>test7 (DTO 이름지정)</h4>
		<p>a: ${requestScope.sample.a }</p>
		<p>b: ${requestScope.sample.b }</p>
		<p>c: ${requestScope.sample.c }</p>
		<br>
	</div>
	
	<jsp:include page="result_bottom.jsp"/>
</body>
</html>