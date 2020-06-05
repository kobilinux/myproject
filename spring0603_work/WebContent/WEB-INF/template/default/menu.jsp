<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
        <ul>
            <li><a href="mykosta.kos?cmd=index">Home</a></li>
            <!-- 세션이 있으면 :로그아웃, 세션이 없으면 : 로그인  mem_uid-->
           	<c:choose>
	           	<c:when test="${sessionScope['mem_uid'] == null}">
	           	 <li><a href="loginF">로그인 </a></li>
	           	</c:when>
	           	<c:when test="${sessionScope['mem_uid'] != null}">
	           	<li><a href="logout"> ${sessionScope['mem_uid'] } 로그아웃 </a></li>
	           	</c:when>
            </c:choose>
            
            <li><a href="surveyClient">설문조사 예제</a></li>
            <li><a href="memberForm">회원가입예제</a></li>
            <li><a href="chart1">chart1</a></li>
            <li><a href="chart2">chart2</a></li>
             <li><a href="chart3">chart3</a></li>
            <li><a href="contact.html">Contact</a></li>
        </ul>
