<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>upform2</title>
<style>
	#container{ width: 350px; margin: auto;}
	table{ border-collapse: collapse; width: 100%}
	th{ background-color: #c0c0c0}
	tbody th,td {padding: 8px; text-align: left; border-bottom: 1px solid #ddd;}
</style>
</head>
<body>
	<div id="container">
	<form method="post" action="upsave2" enctype="multipart/form-data">
	<table>
		<thead>
			<tr><th colspan="2">Tboard 글작성 폼</th></tr>
		</thead>
		<tbody>
			<tr><th>제목</th><td><input type="text" name="sub" id="sub"></td></tr>
			<tr><th>작성자</th><td><input type="text" name="writer" id="writer"></td></tr>
			<tr><th>내용</th><td><textarea rows="10" cols="15" name="content"  id="content"></textarea></td></tr>
			<tr><th>이미지</th><td><input type="file" name="mfile" id="mfile"></td></tr>
			<tr><th>비밀번호</th><td><input type="password" name="pwd" id="pwd" maxlength="10"></td></tr>
		</tbody>
		<tfoot>
		<tr><th colspan="2"><input type="submit" value="send"></th></tr>
		</tfoot>
	</table>
	</form>
	</div>
</body>
</html>