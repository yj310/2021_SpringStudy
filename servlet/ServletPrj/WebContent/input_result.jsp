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
	<%= request.getAttribute("model") %> �Դϴ�.<br>
	
	<!-- EL(Expression Language) -->
	${ model }�Դϴ�.
</body>
</html>