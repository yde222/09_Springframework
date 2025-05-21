<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>testAction</title>
</head>
<body>
    <jsp:include page="common.jsp"/>
    <h1>여기서부터 내용입니다.</h1>
    <% String str = ""; %>
    <% request.setAttribute("name", "정호");%>

    <jsp:forward page="testForward.jsp"/>
</body>
</html>
