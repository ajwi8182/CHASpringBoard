<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td></td>
			<td>
				<table>
					<tr>
						<td><b>회원관리 - 목록</b></td>
					</tr>

					<c:forEach var="Saram" items="${saramList }">
						<tr>
							<td>${saram.id }</td>
							<td>${saram.passwd }</td>
							<td>${saram.name }</td>
							<td>${saram.email }</td>
						</tr>
					</c:forEach>
				</table>

				<table>
					<tr>
						<td align="right">
						<!-- 
							<c:if text="${loginSaraminfo.status==9 }">
								<input type="button" value="회원등록"
									onclick="location.href='${pageContext.request.contextPath}/saraminfo/join';" />
							</c:if> 
							 -->
							<input type="button" value="로그아웃"
							onclick="location.href='${pageContext.request.contextPath}/userinfo/logout';">
						</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
</body>
</html>