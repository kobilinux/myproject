<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>tdetail</title>
<style>
	#container{ width: 350px; margin: auto;}
	table{ border-collapse: collapse; width: 100%}
	th{ background-color: #c0c0c0}
	
	tbody th,td {padding: 8px; text-align: left; border-bottom: 1px solid #ddd;}
	tbody img {width: 200px}
</style>
</head>
<body>
	<div id="container">
	<!-- <form method="post" action="upsave2" enctype="multipart/form-data"> -->
	<table>
		<thead>
			<tr><th colspan="2">Tboard 글작성 폼</th></tr>
		</thead>
		<tbody>
		   <tr><th>번호</th><td>
			<input type="text" name="sub" id="sub" value="${vo.num }" readonly="readonly">
			</td></tr>
			<tr><th>제목</th><td>
			<input type="text" name="sub" id="sub" value="${vo.sub }" readonly="readonly">
			</td></tr>
			<tr><th>작성자</th>
			<td><input type="text" name="writer" id="writer" value="${vo.writer }" readonly="readonly"></td></tr>
			<tr><th>내용</th>
			<td><textarea rows="10" cols="15" name="content"  
			id="content" readonly="readonly">${vo.content }</textarea></td></tr>
			<tr><th>이미지</th>
			<td><img src="resources/upload/${vo.imgfile}"></td></tr>
		</tbody>
		<tfoot>
		<tr><th colspan="2">
		<input type="button" value="리스트" id="list" onclick="location='tvolist'">&nbsp;
		<input type="button" value="수정" id="update">&nbsp;
		<input type="button" value="삭제" id="delete">&nbsp;
		</th></tr>
		</tfoot>
	</table>
	<!-- </form> -->
	</div>
</body>
</html>