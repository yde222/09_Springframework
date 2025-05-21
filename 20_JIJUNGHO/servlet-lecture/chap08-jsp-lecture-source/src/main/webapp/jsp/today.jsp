<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>today</title>
</head>
<body>
    <%
        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 a hh시 mm분 ss초 키키");
        String output = sdf.format(today);
    %>

    <h1>today : <%= output %></h1>
</body>
</html>
