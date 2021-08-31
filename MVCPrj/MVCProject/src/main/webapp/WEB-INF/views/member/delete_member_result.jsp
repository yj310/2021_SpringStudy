<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>Insert title here</title>
	<link href="${pageContext.request.contextPath}/css/memberlist.css" rel="stylesheet" type="text/css">
	<link href="${pageContext.request.contextPath}/css/index.css" rel="stylesheet" type="text/css">
	<link href="${pageContext.request.contextPath}/css/button.css" rel="stylesheet" type="text/css">
</head>
<body>

	<jsp:include page="../ui/top2.jsp"/>
	
	<div class="container">
		<h1>Delete Member Success</h1>
		<table>
	        <tr>
	            <td>id</td>
	            <td>이름</td>
	            <td>e-mail</td>
	        </tr>
	        <tr>
	            <td>${member.userid }</td>
	            <td>${member.name }</td>
	            <td>${member.email }</td>
	        </tr>
		</table>
		
		<br>
		<p>데이터 삭제 완료</p>
		<br><br><br><br>
		
		<a href="/member"><button>회원목록</button></a>
		<a href="/home"><button>Home</button></a>
	</div>
	
	
	
</body>
</html>