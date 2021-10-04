<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>ChaSpringBoard</title>
<style type="text/css">
.loginId {
	text-align: right;
}
</style>
</head>
<body>
	<table align="center" border="0" cellspacing="0" cellpadding="8"
		width="900" bgcolor="FF00DD">
		회원 목록
		<tr>
			<td>아이디</td>
			<td>패스워드</td>
			<td>이름</td>
			<td>이메일</td>
			<td>joinDate</td>
			<td>lastLogin</td>
			<td>status</td>
		</tr>
		<!-- 
			<tr>
				<td>${saram.id }</td>
				<td>${saram.passwd }</td>
				<td>${saram.name }</td>
				<td>${saram.email }</td>
				<td>${saram.joinDate}</td>
				<td>${saram.lastLogin }</td>
				<td>${saram.status }</td>
			</tr>
		 -->
		<c:choose>
			<c:when test="${empty(saramList) }">
				<tr align="center">
					<td colspan="7">검색된 사람정보가 없습니다.</td>
				</tr>
			</c:when>
			<c:otherwise>
				<c:forEach var="saram" items="${saramList }">
					<tr align="center">
						<td>${saram.id }</td>
						<td>${saram.passwd }</td>
						<td>${saram.name }</td>
						<td>${saram.email }</td>
						<td>${saram.joinDate}</td>
						<td>${saram.lastLogin }</td>
						<td>${saram.status }</td>
					</tr>
				</c:forEach>
			</c:otherwise>
		</c:choose>
	</table>
</body>
</html>