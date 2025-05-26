<%@ page import="java.util.Date" %>
<%--
  Created by IntelliJ IDEA.
  User: joo20
  Date: 2025-05-21
  Time: 오후 4:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.Date" errorPage="error.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        Date date = new Date();
        System.out.println(date);
    %>
    <%
        String str = null;
        char ch = str.charAt(0);
    %>
</body>
</html>
