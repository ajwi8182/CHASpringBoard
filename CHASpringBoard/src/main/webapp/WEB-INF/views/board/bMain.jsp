<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; 
charset=UTF-8">
<title>ChaSpringBoard</title>
<style type="text/css">
table {
	border: 1px;
	cellspacing: 0;
	cellpadding: 8px;
	width: 900px;
}
ul{
	list-style: none;
	padding:0;
}
li{
	display: inline-block; <!--로그인 메뉴 일렬로 배치-->
}
a{
	text-decoration: none;
}
.right-box{
	float: right; <!--메뉴바 오른쪽정렬-->
}
</style>
</head>
<body>
<div class="right-box">
	<ul>
		<li><a href="">회원가입</a></li>
		<li><a href="">로그인</a></li>
	</ul>
</div>
	<h1>SJ's Board</h1>
	<div align="center">
	<input name="searchword" type="text" id="searchword">
	</div>
	<div align="center">
		<table>
			<tr>
				<td align="center">번호</td>
				<td align="center">제목</td>
				<td align="center">작성자</td>
				<td align="center">작성일</td>
				<td align="center">조회</td>
			</tr>

			<c:choose>
				<c:when test="${empty(sjBoardList) }">
					<tr align="center">
						<td>글이 없습니다.</td>
					</tr>
				</c:when>
				<c:otherwise>
					<c:forEach var="sjBoard" items="${sjBoardList }">
						<tr>
							<td>${sjBoard.boardPostNum}</td>
							<td width=200 align="center">
								<a href="${pageContext.request.contextPath }/board/postDetail
								?boardPostNum=${sjBoard.boardPostNum}">
									${sjBoard.boardSubject}
								</a>
							</td>
							<td>${sjBoard.boardWriterId}</td>
							<td>${sjBoard.boardRegDate}</td>
							<td>${sjBoard.boardReadCount}</td>
						</tr>
					</c:forEach>
				</c:otherwise>
			</c:choose>
			
		</table>
	</div>
	<div align="right">
		<button
			onclick="location.href='${pageContext.request.contextPath}/board/addPost';">글쓰기
			</button>
	</div>
</body>
</html>