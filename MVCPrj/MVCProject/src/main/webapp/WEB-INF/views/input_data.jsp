<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link href="css/form.css" rel="stylesheet" type="text/css">
	<link href="css/index.css" rel="stylesheet" type="text/css">
</head>
<body>

	<jsp:include page="ui/top.jsp"/>
	
	<!-- 
	<form method="post" action="iput_pro">
		data1: <input type="text" name="data1"><br/>
		data2: <input type="text" name="data2"><br/>
		data3: <input type="text" name="data3"><br/>
		<button type="submit">확인</button>
	</form> 
	-->
	
	<div class="container">
		<h1>Input Data</h1>
		<form method="post" action="/iput_pro">
			<input type="text" name="data1" placeholder="data1"/><br>
			<input type="text" name="data2" placeholder="data2"/><br>
			<input type="text" name="data3" placeholder="data3"/><br>
			<input type="submit" value="확인"/>
		</form>
	</div>
	
	
</body>
</html>