<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="urlPath" value="${pageContext.request.contextPath}/resources"></c:set>    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>success.jsp</title>
<style>
	img { width: 100px;}
</style>
</head>
<body>

${urlPath}/upload/${imgName}<br>
<a href="fileDown?fileName=${imgName}"><img src="${urlPath}/upload/${imgName}/"></a><br>
<a href="fileDown?fileName=${imgName}">파일다운</a>
</body>
</html>