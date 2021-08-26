<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<link href="css/memberlist.css" rel="stylesheet" type="text/css">
	<link href="css/index.css" rel="stylesheet" type="text/css">
	<link href="css/button.css" rel="stylesheet" type="text/css">
<title>Insert title here</title>
</head>
<body>
	
	<jsp:include page="../ui/top.jsp"/>
	
	<div class="container">
	
		<h1>Member List</h1>
			<table>
		        <tr>
		            <th>���̵�</th>
		            <th>�̸�</th>
		            <th>�̸���</th>
		            <th>���Գ�¥</th>
		        </tr>
		        <c:forEach var="mid" items="${list}">
			        <tr>
			            <td>${mid.userid }</td>
			            <td>${mid.name }</td>
			            <td>${mid.email }</td>
			            <td>${mid.join_date }</td>
			        </tr>
				</c:forEach>
			</table>
		
		
		<br><br><br><br>
		<a href="/add_member"><button>ȸ������</button></a>
		<a href="/home"><button>Home</button></a>
		
	</div>
	
</body>
</html>