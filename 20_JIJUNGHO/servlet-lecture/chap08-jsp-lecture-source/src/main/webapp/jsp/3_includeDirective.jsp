<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>includeDirective</title>
</head>
<body>
    <div>
        <%@include file="today.jsp"%>
    </div>
<%-- include 된 jsp 파일과 동일한 변수명을 사용하려고 하면 컴파일 에러가 발생 --%>

 <%
     // 컴파일 에러 발생!!!!!!!!!!!!!!!!!!!!!!!!!!!
    // String output="";
 %>
</body>
</html>
