<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>JSTL Core Library Tag Test</h1>
    <h2>c:set 변수 선언</h2>
    <!-- scope 생략 시 기본은 pageScope이다. -->
    <c:set var="num1" value="100" scope="session"/>
    <c:set var="num2" value="200" scope="session"/>

    <!-- 스크립팅 요소에서 사용하는 것은 불가능하다. -->
    <%--<% int sum = num1 + num2; %>--%>
    <!-- EL을 이용해서 사용한다. -->
    <c:set var="sum" value="${ num1 + num2 }"/>
    ${ num1 } + ${ num2 } = ${ sum } <br>

    <% int num3 = 10, num4 = 20; %>
    <!-- 에러가 발생하지는 않지만 값을 가져올 수 없다. -->
    ${ num3 } + ${ num4 } = ${ num3 + num4 } <br>
    <c:set var="sum2" value="<%= num3 + num4 %>"/>
    num3 + num4 = ${ sum2 } <br>

    <c:set var="colors">
        red, yellow, green, orange, blue, magenta
    </c:set>

    <!-- 자바스크립트와 섞어서 EL 사용하기 -->
    <script>
        window.onload = function(){
            const colors = '${ colors }'.split(', ');
            console.log(colors);
        };
    </script>

    <hr>

    <h2>c:remove 변수 삭제</h2>
    num1 : ${ num1 }, num2 : ${ num2 } <br>

    <c:remove var="num1" scope="session"/>
    <!-- scope 미지정 시 모든 scope의 동일한 이름의 변수를 제거한다. -->
    <c:remove var="num2"/>

    num1 : ${ num1 }, num2 : ${ num2 } <br>

    <hr>

    <h2>c:out 값 출력</h2>
    <c:out value="core 라이브러리의 <out> 태그는 값을 화면에 출력하는 태그이다."/><br>
    <!-- escapeXml을 false로 지정하면 태그로 인식하고 true로 설정하거나 생략하면 텍스트로 인식한다. -->
    <c:out value="<h2>데이터출력</h2>" escapeXml="false"/><br>
    <c:out value="<h2>데이터출력</h2>" escapeXml="true"/><br>
    <c:out value="<h2>데이터출력</h2>"/><br>
    <!-- EL로 가져오는 값이 없을 경우 대체 값을 default 속성에 설정할 수 있다. -->
    <c:out value="${ param.name }" default="아무개"/>

    <hr>
</body>
</html>
