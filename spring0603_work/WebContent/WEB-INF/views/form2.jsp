<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>form2</title>
</head>
<body>
	<form method="post" action="ins2">
	제목 :<input type="text" name="sub" id="sub"><br>
	작성자 :<input type="text" name="writer" id="writer"><br>
	내용 :<textarea rows="10" cols="15" name="content"  id="content"></textarea><br>
	비밀번호 : <input type="password" name="pwd" id="pwd" maxlength="10"><br>
	<input type="submit" value="send">
	</form>
</body>
</html>