<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- jstl标签经常会和el表达式配合使用 -->
	<!-- test代表的返回布尔的表达式 -->
	<c:if test="${ 1==1 }">
	xxxx
	</c:if>
	<c:if test="${1!=2}">
yyyy
	</c:if>
	<%
		request.setAttribute("count", 10);
	%>
	<c:if test="${ count==10 }">
	哈哈
	</c:if>
	<br />
	<!-- forEach标签 -->
	<c:forEach begin="0" end="5" var="i">
	${i }<br />
	</c:forEach>
	<!-- items：一个集合或数组 var：代表集合中某-个元素 -->
	<%
	List<String> productList = new ArrayList<String>();
	productList.add("哈哈");
	productList.add("嘻嘻");
	request.setAttribute("productList", productList);
	%>
	<c:forEach items="${productList }" var="pro">
	${pro }
	</c:forEach>
</body>
</html>