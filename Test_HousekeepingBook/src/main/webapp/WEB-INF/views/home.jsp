<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
<title>메인 화면</title>
</head>
<body>
	<h1>[ 가계부 ]</h1>
	
	
	<ul>

	<c:choose>
		<c:when test="${not empty sessionScope.loginId }">
	${sessionScope.loginId } 님 환영합니다.
	<li>
		<a href="/board/goboardList">내 가계부</a>
	</li>
	<li>
		<a href="/member/logout">로그아웃</a>
	</li>
	</c:when>
	<c:otherwise>
	<li> 
		<a href="/member/joinForm">회원가입</a>
	</li>
	<li> 
		<a href="/member/loginForm">로그인</a>
	</li>
	</c:otherwise>
	</c:choose>
	

</ul>
	
</body>
</html>
