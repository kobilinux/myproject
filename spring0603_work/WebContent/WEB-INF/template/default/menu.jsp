<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
        <ul>
            <li><a href="mykosta.kos?cmd=index">Home</a></li>
            <!-- ������ ������ :�α׾ƿ�, ������ ������ : �α���  mem_uid-->
           	<c:choose>
	           	<c:when test="${sessionScope['mem_uid'] == null}">
	           	 <li><a href="loginF">�α��� </a></li>
	           	</c:when>
	           	<c:when test="${sessionScope['mem_uid'] != null}">
	           	<li><a href="logout"> ${sessionScope['mem_uid'] } �α׾ƿ� </a></li>
	           	</c:when>
            </c:choose>
            
            <li><a href="surveyClient">�������� ����</a></li>
            <li><a href="memberForm">ȸ�����Կ���</a></li>
            <li><a href="chart1">chart1</a></li>
            <li><a href="chart2">chart2</a></li>
             <li><a href="chart3">chart3</a></li>
            <li><a href="contact.html">Contact</a></li>
        </ul>
