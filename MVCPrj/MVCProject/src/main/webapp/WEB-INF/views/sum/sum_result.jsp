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
		<h4>n-m까지의 합 [${n } - ${m }까지의 합]</h4>
		
		
		
		<%
			int n = Integer.parseInt(String.valueOf(request.getAttribute("n")));
			int m = Integer.parseInt(String.valueOf(request.getAttribute("m")));
			int sum = 0;
			
			for(int i = n; i <= m; i++) {
				sum += i;
				out.print(i);
				if(i != m) out.print(" + ");
			}
			out.print(" = " + sum);
		%>
		
		<br>
		<br>
		<br>
	</div>
	
	<jsp:include page="../result/result_bottom.jsp"/>
</body>
</html>