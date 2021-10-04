<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ChaSpringBoard</title>
<script type="text/javascript">
	function postRemove(boardSubject) {
		if (confirm("정말로 삭제 하시겠습니까?")) {
			location.href = '${pageContext.request.contextPath}/board/postDelete?boardSubject='
					+ boardSubject;
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
			<input type="hidden" name="boardWriterId" value="${sjboard.boardWriterId }">
			<table align="center">
				<tr>
					<td>제목</td>
					<td>
						<input type="text" name="boardSubject" id="boardSubject"
						width=500 value="${sjboard.boardSubject }">
						</td>
				</tr>
				<tr>
					<td>내용</td>
					<td>
						<textarea rows="30" cols="80" name="boardContent"
							id="boardContent">
							${sjboard.BoardContent }
						</textarea>
					</td>
				</tr>
				<tr>
					<td align="center">
						<button type="submit">완료</button> 
						<button type="button" value="삭제"
						onClick="postRemove('${sjboard.boardSubject}');">
						</button>
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>