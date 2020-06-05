<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style type="text/css">
#cont {
	width: 500px;
	margin: auto;
}

#cont table {
	width: 100%;
	border: 1px dotted #000
}

#cont table thead th {
	font-size: 30px;
	color: orange
}

#cont table thead td {
	text-align: center;
	background-color: skyblue
}

#cont tbody img {
	width: 80px;
	border: 0px
}

#pageTd img {
	width: 15px;
}

#pageTd a {
	color: #000000;
}
</style>
<!-- article 영역 시작 -->
<div id="article">
	<div id="header2">
		<h1>Member리스트 페이지 처리 예제</h1>
		<p id="time">Oct 1th, 2020</p>
	</div>
	<div id="content">
		<p>여기는 메인 컨텐츠</p>
		<div id="cont">
			<table>
				<thead>
					<tr>
						<th colspan="4">리스트</th>
					</tr>
					<tr>
						<td>번호</td>
						<td>아이디</td>
						<td>이름</td>
						<td>날짜</td>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="listv" items="${list}">
						<tr>
							<td>${listv.num}</td>
							<td>${listv.id}</td>
							<td>${listv.name}</td>
							<td>${listv.rdate}</td>
						</tr>
					</c:forEach>
				</tbody>
				<tfoot>
					<tr>
						<td colspan="4" id="pageTd">
							<%-- page 처리  --%>
							<%@include file="pageProcess.jsp" %>
						</td>
					</tr>
					<tr>
						<th colspan="6">
							<form method="post" action="memberSearch">
<%-- 								<input type="hidden" name="page" value="${param.page}"> --%>
								<select name="searchType">
									<option value="1">아이디</option>
									<option value="2">이름</option>
<!-- 									<option value="3">내용</option> -->
								</select>&nbsp; <input name="searchValue"> 
								<input type="submit" value="Search">
							</form>
						</th>
					</tr>
					<tr>
						<th colspan="4"><input type="button" value="writer"
							onclick="location='memberForm'"></th>
					</tr>
				</tfoot>
			</table>
		</div>
	</div>
</div>
<script>
	$(function() {

	});
</script>



