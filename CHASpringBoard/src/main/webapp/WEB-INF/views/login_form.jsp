<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ChaSpringBoard</title>
<style type="text/css">
	
.go{
	/*fieldset 가운데 정렬*/
	position:absolute;
	left:50%;
	top:20%;
	margin-left:-50px;
	margin-top:-20px;
	width:200px;
	height:300px;
	text-align: center;
	
}
</style>
</head>
<body>
	<form name="loginForm" method="post">
		<fieldset class="go">
			<legend>로그인</legend>	
			<input type="text" name="id" placeholder="ID"><br>	
			<input type="password" name="passwd" placeholder="PASSWORD"><br>	
			<button type="submit">로그인</button>
			<button type="button">회원가입</button>
		</fieldset>
	</form>
</body>
</html>