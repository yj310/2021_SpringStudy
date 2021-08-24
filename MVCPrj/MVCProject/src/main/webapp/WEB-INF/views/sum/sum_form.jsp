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
		<h1>n-m까지의 합</h1>
		<form method="post" action="/sum">
			<input type="text" name="n" placeholder="n"/><br>
			<input type="text" name="m" placeholder="m"/><br>
			<input type="submit" value="확인"/>
		</form>
	</div>

</body>
</html>