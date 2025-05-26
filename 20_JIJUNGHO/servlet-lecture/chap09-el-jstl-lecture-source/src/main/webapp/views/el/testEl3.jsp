
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>TestEl</title>
</head>
<body>
    <h1>Parameter 값 받아서 출력하기</h1>
    상품명 : ${param.name} <br>
    가격 : ${param.price} <br>
    제품번호 : ${param.no} <br>
    제품번호 : ${paramValues.no[0]}  ${paramValues.no[1]}<br>
    <%--  EL 내에서 연산자 사용 가능  --%>
    옵션 : ${ empty param.option ? "옵션없음" : param.option} <br>
</body>
</html>
