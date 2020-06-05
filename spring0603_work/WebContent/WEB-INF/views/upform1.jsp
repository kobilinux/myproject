<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>upform1.jsp</title>
<style>
#wrap {
	width: 300px;
	margin: auto;
}
</style>
</head>
<body>
	<div id="wrap">
	<%--  enctype="multipart/form-data" :파일 업로드를 위한 설정 , <input type="file" 일경우  
	     이때 method는 반드시 post이어야 한다. *********
	--%>
		<form method="post" action="upsave1" enctype="multipart/form-data">
			<input type="file" id="mfile" name="mfile"><br /> 
			<input type="submit" value="send">
		</form>
		
		
	</div>
	
	
	
	
</body>
</html>