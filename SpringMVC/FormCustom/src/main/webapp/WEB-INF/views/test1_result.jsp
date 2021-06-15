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
		<h4>Model</h4>
		<p>name: ${name }</p>
		<p>id: ${id }</p>
		<p>pw: ${pw }</p>
		<p>email: ${email }</p>
		<p>address: ${address }</p>
		<p>address_detail: ${detail }</p>
		<br>
	</div>
	
	<jsp:include page="result_bottom.jsp"/>
</body>
</html>