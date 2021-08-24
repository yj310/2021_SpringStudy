<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>Insert title here</title>
	<link href="css/form.css" rel="stylesheet" type="text/css">
	<link href="css/index.css" rel="stylesheet" type="text/css">
</head>
<body>

	<jsp:include page="../ui/top.jsp"/>
	
	<div class="container">
		<h1>구구단</h1>
		<form method="post" action="/gugudan">
			<input type="text" name="dan" placeholder="단을 입력하세요."/><br>
			<input type="submit" value="확인"/>
		</form>
	</div>

</body>
</html>