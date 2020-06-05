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
	<form method="post" action="tvoDetail">
	<input type="hidden" name="num" value="${num }">
	<table>
		<thead>
			<tr><th colspan="2">Tboard 비밀번호입력</th></tr>
		</thead>
		<tbody>
			<tr><th>비밀번호</th>
			<td><input type="password" name="pwd" id="pwd" maxlength="10"></td></tr>
		</tbody>
		<tfoot>
		<tr><th colspan="2"><input type="submit" value="send"></th></tr>
		</tfoot>
	</table>
	</form>
	</div>
</body>
</html>