<%--
  Created by IntelliJ IDEA.
  User: qls09
  Date: 2025-05-21
  Time: 오후 5:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <jsp:include page="common.jsp"/>
    <h1>여기서부터 내용입니다.</h1>
    <% String str = ""; %>
    <% request.setAttribute("name", "홍길동"); %>

<jsp:forward page="testforward.jsp"/>
</body>
</html>
