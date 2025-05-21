<%--
  Created by IntelliJ IDEA.
  User: Playdata2
  Date: 25. 5. 21.
  Time: 오후 4:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
isErrorPage="true" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
  // isErrorPage = "true" 로 설정 시 exception 내장 객체를 설정할 수 있다ㅣ.
  String exceptionType = exception.getClass().getTypeName();
  String exceptuinMessage = exception.getMessage();
%>
<h1><%= exceptionType%></h1>
<h1><%= exceptuinMessage%> </h1>
</body>
</html>
