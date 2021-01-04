<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Map, java.util.HashMap" %>
<%
Map<String,Object> rmap = (Map<String,Object>) request.getAttribute("rmap");


%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<img src="/forcat<%=rmap.get("file1") %>"/><br>
<img src="/forcat<%=rmap.get("file2") %>"/><br>
<img src="/forcat<%=rmap.get("file3") %>"/><br>

</body>
</html>