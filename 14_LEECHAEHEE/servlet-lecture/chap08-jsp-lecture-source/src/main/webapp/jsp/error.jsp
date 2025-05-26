<%--
  Created by IntelliJ IDEA.
  User: chaeh
  Date: 2025-05-21
  Time: 오후 4:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<html>
<head>
    <title>Error</title>
</head>
<body>
<%
  // isErrorPage 속성이 true로 설정된 경우, exception 내장 객체를 사용할 수 있다.
  String exceptionType = exception.getClass().getTypeName();
    String exceptionMessage = exception.getMessage();
%>

<h1><%= exceptionType %></h1>
<h1><%= exceptionMessage %></h1>
</body>
</html>
