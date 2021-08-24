<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>Insert title here</title>
	<link href="css/result.css" rel="stylesheet" type="text/css">
</head>
<body>

	<jsp:include page="../result/result_top.jsp"/>
	
	<div id="container">
		<h4>구구단 [${number}단]</h4>
		
		<%
			int number = Integer.parseInt(String.valueOf(request.getAttribute("number")));
			for(int i = 1; i <= 9; i++) {
				out.print(number + " * " + i+ " = " + i * number);
				%><br><%
			}
		%>
		
		<br>
	</div>
	
	<jsp:include page="../result/result_bottom.jsp"/>
</body>
</html>