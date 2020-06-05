<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
	#wrap { width: 450px; margin: auto;}
	table{ border-collapse: collapse; width: 100%}
	th{ background-color: #c0c0c0}
	tbody img { width: 100px;}
	th,td {padding: 8px; text-align: left; border-bottom: 1px solid #ddd;}
	tr:hover {background: #f5f5f5}
</style>
</head>
<body>

	<div id="wrap">
	<h2>Tboard Form 예제</h2>
		<table>
			<thead>
				<tr>
					<th>번호</th>
					<th>이미지</th>
					<th>작성자</th>
					<th>제목</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach var="e" items="${tlist}">
			     <tr>
					<td>${e.num }</td>
					<td><img src="resources/upload/${e.imgfile}"></td>
					<td>${e.writer }</td>
					<td><a href="pwdform?num=${e.num }">${e.sub }</a></td>
				</tr>
				</c:forEach>
			</tbody>
			<tfoot>
				<tr><th colspan="4">
					<input type="button" value="글작성" id="writeBtn">
				</th></tr>
			</tfoot>
		</table>
	</div>

<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script>
	$(function(){
		$('#writeBtn').click(function(){
			location='upform2';
		});
	});
</script>
</body>
</html>


