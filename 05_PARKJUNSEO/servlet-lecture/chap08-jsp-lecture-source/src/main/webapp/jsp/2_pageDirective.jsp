<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


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
      char ch = str.charAt(0);  // 500 에러
    %>
  </body>
</html>
