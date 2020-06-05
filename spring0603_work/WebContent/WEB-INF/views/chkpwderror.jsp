<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>upform2</title>
<style>
	#container{ width: 450px; margin: auto;}
	table{ border-collapse: collapse; width: 100%}
	th{ background-color: #c0c0c0}
	tbody th,td {padding: 8px; text-align: left; border-bottom: 1px solid #ddd; color:red}
</style>
</head>
<body>
	<div id="container">
	<form method="post" action="pwdChk">
	<input type="hidden" name="num" value="${num }">
	<table>
		<thead>
			<tr><th colspan="2">Tboard 비밀번호입력 메세지</th></tr>
		</thead>
		<tbody>
			<tr><th>비밀번호 오류:</th><td>입력하신 비밀번호가 잘못되었습니다.</td></tr>
		</tbody>
		<tfoot>
		<tr><th colspan="2"><input type="button" value="리스트" onclick="location='tvolist'"></th></tr>
		</tfoot>
	</table>
	</form>
	</div>
</body>
</html>