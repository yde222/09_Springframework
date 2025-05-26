<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <jsp:include page="common.jsp"/>
<%-- servlet의 내용이기 때문에 restart 필요 --%>
    <h1>여기서부터 내용입니다.</h1>
    <% String str = ""; %>
    <% System.out.println("확인용");%>
    <% request.setAttribute("name", "홍길동"); %>
<%-- 단일 태그를 쓰는 이유 알아보기 --%>
    <jsp:forward page="testForward.jsp"/>
</body>
</html>


