<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 向指定的其他域中存取数据 -->
	<%
		pageContext.setAttribute("name", "lisi", PageContext.REQUEST_SCOPE);
	%>
	<%=pageContext.getAttribute("name", PageContext.REQUEST_SCOPE)%>
	<%
		pageContext.setAttribute("name", "zhangsan");
	%>
	<!-- 依次从pageContext域，request域,session域，application域中获取属性，在某个域中获取后将不在向后寻找 -->
	<%=pageContext.findAttribute("name")%>
	<!-- 获得其他8大隐式对象 -->
	<%=pageContext.getSession().getId()%>
</body>
</html>