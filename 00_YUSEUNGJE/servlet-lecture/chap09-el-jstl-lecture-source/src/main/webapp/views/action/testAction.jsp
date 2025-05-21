<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <jsp:include page="common.jsp"/>

    <h1>여기부서부터 내용입니다.</h1>
    <% String str = "";  %>
    <% System.out.println("확인용");%>
    <% request.setAttribute("name", "홍길동"); %>

    <jsp:forward page="testForward.jsp"/>
</body>
</html>
