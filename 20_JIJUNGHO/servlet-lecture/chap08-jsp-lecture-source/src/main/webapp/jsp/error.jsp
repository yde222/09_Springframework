<%-- isErrorPage=true 옵션 추가 시 에러페이지로 설정된다. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<html>
<head>
    <title>에러페이지</title>
</head>
<body>
    <%
        // isErrorPage = "true"로 설정 시 exception 내장 객체를 사용할 수 있다.
        String exceptionType = exception.getClass().getTypeName();
        String exceptionMessage = exception.getMessage();
    %>

<h1><%= exceptionType %></h1>
<h1><%= exceptionMessage %></h1>
</body>
</html>
