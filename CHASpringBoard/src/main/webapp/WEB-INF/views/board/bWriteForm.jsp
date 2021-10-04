<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ChaSpringBoard</title>
<style type="text/css">
div {
	background-color: #D9E5FF;
	width: 800px;
}

.writetitle {
	border-bottom: 3px;
	border-bottom-style: solid;
	border-bottom-color: #000000;
	padding-bottom: 14px;
}

button {
	font-size: 14px;
	align: center;
}

.sbmBtn {
	height: 40px;
	width: 100px;
	border-radius: 5px;
	border-style: none;
}
</style>
</head>
<body>
	<h2 class="writetitle">글쓰기</h2>
	<div>
		<form id="boardForm" method="post">
			<input type="hidden" name="boardRef" value="0"> 
			<input type="hidden" name="boardReStep" value="0"> 
			<input type="hidden" name="boardReLevel" value="0 "> 
			<input type="hidden" name="boardWriterId" value="0">
			<table border="0" bgcolor="FFD9EC">
				<tr>
					<td>제목</td>
					<td>
					<input type="text" name="boardSubject" id="boardSubject">
					</td>
				</tr>
				<tr>
					<td>내용</td>
					<td>
						<!-- <input type="text" name="boardContent" value="${sjboard.BoardContent }"> -->
							<textarea rows="30" cols="80" name="boardContent" id="boardSontent">
							</textarea>
					</td>
				</tr>
				<tr>
					<td colspan='2' align="center">
						<button type="submit" class="sbmBtn">완료</button>
					</td>
				</tr>
			</table>

		</form>
	</div>
</body>
</html>