<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd>
<html>
<head>
<meta charset="UTF-8">
<title>CHA SPRING BOARD</title>
<script language="JavaScript">
function userCreate(){
	if(joinForm.id.value==""){
		alert("아이디를 입력하세요");
		joinForm.id.focus();
		return;
	}
	if(joinForm.passwd.value=""){
		alert("비밀번호를 입력하세요");
		joinForm.passwd.focus();
		return;
	}
	if(joinForm.name.value=""){
		alert("이름을 입력하세요");
		joinForm.name.focus();
		return;
	}
	if(joinForm.email.value=""){
		alert("이메일을 입력하세요");
		joinForm.email.focus();
		return;
	}
	joinForm.action="${pageContext.request.contextPath}"
	
}
</script>
</head>
<body>
	<form name="joinForm" method="post">
		<table>
			<tr>
				<td>아이디</td>
				<td><input type="text" name="id" value=""></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="text" name="passwd" value=""></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="name" value=""></td>
			</tr>
			<tr>
				<td>이메일</td>
				<td><input type="text" name="email" value=""></td>
			</tr>
			<tr>
			<td>
				<button type="submit">회원가입</button>
			</td>
		</tr>
		</table>
	</form>
</body>
</html>