<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	model<br>
	<%= request.getAttribute("model") %> 입니다.<br>
	
	<!-- EL(Expression Language) -->
	${ model }입니다.
</body>
</html>