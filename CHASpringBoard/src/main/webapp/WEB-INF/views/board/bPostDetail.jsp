<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ChaSpringBoard</title>
<script type="text/javascript">
	function postRemove(boardPostNum) {
		if (confirm("정말로 삭제 하시겠습니까?")) {
			location.href = '${pageContext.request.contextPath}/board/postDelete?boardPostNum='
					+ boardPostNum;
		}
	}
</script>
</head>
<body>
	<div>
		<form name="boardForm" method="post">
			<input type="hidden" name="boardRef" value="0"> 
			<input type="hidden" name="boardReStep" value="0"> 
			<input type="hidden" name="boardReLevel" value="0"> 
			<input type="hidden" name="boardWriterId" value="${sjBoard.boardWriterId }">
			<table align="center">
				<tr>
					<td>제목</td>
					<td>
						<input type="text" name="boardSubject" id="boardSubject"
						width=500 value="${sjBoard.boardSubject }">
						</td>
				</tr>
				<tr>
					<td>내용</td>
					<td>
						<textarea rows="30" cols="80" name="boardContent"
							id="boardContent">
							${sjBoard.boardContent }
						</textarea>
					</td>
				</tr>
				<tr>
					<td align="center">
						<input type="button" value="수정" onClick="location.href='${pageContext.request.contextPath}/board/modify?boardPostNum=${sjBoard.boardPostNum }';">
						<input type="button" value="삭제"
						onClick="postRemove('${sjBoard.boardPostNum}');">
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>