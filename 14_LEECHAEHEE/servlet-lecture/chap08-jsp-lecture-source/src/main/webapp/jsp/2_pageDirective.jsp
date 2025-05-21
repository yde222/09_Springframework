<%--
  Created by IntelliJ IDEA.
  User: chaeh
  Date: 2025-05-21
  Time: 오후 4:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
    import="java.util.Date" errorPage="error.jsp" %>
<html>
<head>
    <title>페이지 지시자</title>
</head>
<body>
    <%
    Date date = new Date();
        System.out.println(date);
    %>
    <%
        String str = null;
        char ch = str.charAt(0);
        // NullPointerException 발생
    %>

</body>
</html>
