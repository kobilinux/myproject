<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     
<!DOCTYPE html>
<html>
<head>
<%--
- 삭제에 필요한 소스만 각 조별 게시판에 내용으로 확인 할 수 있도록
- 게시, 실행 스크린 샷  포함 
* 설문조사 관리에서 삭제 프로그램 구현하기
 --%>
<meta charset="EUC-KR">
<title>surveyDetail.jsp</title>
<style>
	#container { width: 450px; margin: auto;}
	table{ border-collapse: collapse; width: 100%}
	th{ background-color: #c0c0c0}
	tbody img { width: 100px;}
	th,td {padding: 8px; text-align: left; border-bottom: 1px solid #ddd;}
	tr:hover {background: #f5f5f5}
</style>
</head>
<body>
<div id="container">
	<table>
		<thead>
			<tr><th colspan="2">SurveyDetail</th></tr>
		</thead>
		<tbody>
 <c:forEach var="e" items="${list }" varStatus="i">
 
		   <c:if test="${i.index == 0 }">
		   <tr><th>제목</th>
		   <td><input type="text" name="sub" id="sub" value="${e.sub }" 
		   readonly="readonly">
		    <input type="hidden" name="num" value="${e.num }" id="num">
		   </td></tr>
 		   </c:if>
 		   
			<tr><th>${i.index+1}번 설문문항 ${e.surveytype }</th>
			<td>
			${e.surveytitle } => ${e.surveycnt }
			</td></tr>
</c:forEach>
		</tbody>
		<tfoot>
		<tr><th colspan="2"><input type="button" value="list" 
		onclick="location='surveylist'">
		<%-- jQuery를 사용해서 url로 넘기기  --%>
		<input type="button" value="delete" id="delete"
		>
		</th></tr>
		</tfoot>
	</table>
	</div>
	<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
	<script>
	$(function(){
		$('#delete').click(function(){
			if(confirm('정말로 삭제 하시겠습니까?')){
				var numv = $('#num').val();
				alert("삭제 처리로 이동하기 "+numv);
			}
		});
	});
	</script>
</body>
</html>