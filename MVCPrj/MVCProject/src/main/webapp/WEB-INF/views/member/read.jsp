<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link href="${pageContext.request.contextPath}/css/form.css" rel="stylesheet" />
	<link href="${pageContext.request.contextPath}/css/index.css" rel="stylesheet" />
	<link href="${pageContext.request.contextPath}/css/memberlist.css" rel="stylesheet" />
	<link href="${pageContext.request.contextPath}/css/button.css" rel="stylesheet" />
	<script src="https://code.jquery.com/jquery-3.6.0.min.js" ></script>
	<script>

		$(function() {
			
			$("#btnUpdate").click(function() {
				document.form1.action = "/member/update";
				document.form1.submit();
			})
			
			$("#btnDelete").click(function() {
				document.form1.action = "/member/delete";
				document.form1.submit();
			})
			
		})
			
			


	</script>
</head>
<body>

	<jsp:include page="../ui/top2.jsp"/>
	
	<div class="container">
		<h1>회원정보</h1>
		<form method="post" name="form1">
			<input type="text" name="userid" placeholder="id" value="${member.userid }" readonly/><br>
			<input type="password" name="passwd" placeholder="password"/><br>
			<input type="text" name="name" placeholder="Name" value="${member.name }"/><br>
			<input type="text" name="email" placeholder="E-MAIL" value="${member.email }"/><br>
			<input type="button" value="수정" id="btnUpdate" /><br>
			<input type="button" value="삭제" id="btnDelete" />
		</form>
		
		
		<br><br><br><br>
		<a href="/add_member"><button>회원가입</button></a>
		<a href="/home"><button>Home</button></a>
		
	</div>

</body>
</html>