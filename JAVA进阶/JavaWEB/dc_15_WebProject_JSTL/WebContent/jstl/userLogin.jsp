<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="Test.domain.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<!-- 模拟用户登录 -->
<body>
	<%
		User user = new User();
		user.setId(100);
		user.setName("张三");
		user.setPassword("123");
		session.setAttribute("user", user);
	%>
</body>
</html>