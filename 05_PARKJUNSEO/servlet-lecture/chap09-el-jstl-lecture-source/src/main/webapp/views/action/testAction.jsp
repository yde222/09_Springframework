<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <jsp:include page="common.jsp"/>
    <h1>여기서부터 내용입니다.</h1>
    <% String str = ""; %>
    <% System.out.println("testAction에 왔는지 확인용 콘솔 출력");%>
    <% request.setAttribute("name", "홍길동"); %>

    <jsp:forward page="testForward.jsp"/>
</body>
</html>
