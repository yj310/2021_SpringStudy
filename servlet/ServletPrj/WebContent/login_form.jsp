<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="login">
		
		아이디<br><input type="text" name="id"/>
		<br><br>
		
		비밀번호 <br><input type="password" name="password"/>
		<br><br>
		
		이름 <br><input type="text" name="name"/>
		<br><br>
		
		취미 
		<input type="checkbox" name="hobby" value="climbing"/>climbing 
		<input type="checkbox" name="hobby" value="swimming"/>swimming 
		<input type="checkbox" name="hobby" value="reading"/>reading 
		<input type="checkbox" name="hobby" value="music"/>music 
		<br><br>
		
		성별 
		<input type="radio" name="gender" value="male"/>male 
		<input type="radio" name="gender" value="female"/>female
		<br><br>
		
		직업  
		<select name="job">
			<option value="">직업선택</option>
			<option value="student">학생</option>
			<option value="public-officer">공무원</option>
			<option value="not-employed">무직</option>
		</select>
		<br><br>
		
		<br><br>
		<button type="submit" value="전송">Login</button>
	
	</form>
</body>
</html>