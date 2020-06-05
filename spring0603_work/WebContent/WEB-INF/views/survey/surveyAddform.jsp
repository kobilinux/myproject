<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>surveyAddform</title>
<style>
	#container { width: 450px; margin: auto;}
	table{ border-collapse: collapse; width: 100%}
	th{ background-color: #ff9933}
	tbody img { width: 100px;}
	th,td {padding: 8px; text-align: left; border-bottom: 1px solid #ddd;}
	tr:hover {background: #ff9933}
</style>
</head>
<body>
<div id="container">
	<form method="post" action="addsurvey" >
	<table>
		<thead>
			<tr><th colspan="2">Tboard 글작성 폼</th></tr>
		</thead>
		<tbody>
			<tr><th>제목</th><td><input type="text" name="sub" id="sub"></td></tr>
			<tr><th>문항수</th><td><input type="number" name="code" id="code"></td></tr>
			<tr><th>설문문항1</th><td><input type="text" name="surveytitle" class="surveytitle"></td></tr>
			<tr><th>설문문항2</th><td><input type="text" name="surveytitle" class="surveytitle"></td></tr>
			<tr><th>설문문항3</th><td><input type="text" name="surveytitle" class="surveytitle"></td></tr>
			<tr><th>설문문항4</th><td><input type="text" name="surveytitle" class="surveytitle"></td></tr>
			<tr><th>설문문항5</th><td><input type="text" name="surveytitle" class="surveytitle"></td></tr>
		</tbody>
		<tfoot>
		<tr><th colspan="2">
		<input type="submit" value="send">
		&nbsp; <input type="button" value="list" 
		onclick="location='surveylist'">
		</th></tr>
		</tfoot>
	</table>
	</form>
	</div>
</body>
</html>