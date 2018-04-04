<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${nickname != null }">
		<%
			session.setAttribute("email", request.getAttribute("email"));
			session.setAttribute("nickname", request.getAttribute("nickname"));
		%>
		<script type="text/javascript">
			location.href="main.do";
		</script>
	</c:if>

	<c:if test="${nickname == null }">
		<script type="text/javascript">
			alert("아이디 또는 비밀번호가 틀렸습니다.");
			location.href="loginForm.do";
		</script>
	</c:if>
</body>
</html>