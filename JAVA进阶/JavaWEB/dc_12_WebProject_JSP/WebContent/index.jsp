<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 包含其他jsp文件（静态包含）  -->
	<%@ include file="demo.jsp"%>
	<!-- html注释 -->
	<%-- jsp注释 --%>

	<!-- 书写java代码，内部的java代码翻译到service方法的内部 -->
	<%
		//java注释
		int i = 10;
		System.out.print(i);
	%>
	<!-- 页面输出数据 -->
	<%=i%>
	<!-- 也是书写java代码，会被翻译成servlet的成员的内容（成员变量或成员方法 -->
	<%!String str = "你好";%>
	<%=str%>
</body>
</html>