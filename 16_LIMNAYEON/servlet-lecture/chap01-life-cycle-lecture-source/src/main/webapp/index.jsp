<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>LifeCycle Test</title>
</head>
<body>
<h1>라이프 사이클 테스트</h1>
<br/>
<a href="xml-lifecycle">XML 설정</a>
<br />
<hr>
<h1>어노테이션 테스트</h1>
<a href="annotation-lifecycle">Annotation 설정</a>
<hr>
<h2>Service Method의 역할</h2>
<h3>a 태그의 href 속성값 요청</h3>
<a href="request-servlet">서비스 메서드 요청</a>
<h3>form태그의 method 속성을 get으로 설정해서 요청</h3>
<form action="request-servlet" method="get">
    <input type="submit" value="get 방식의 요청">
</form>

<h3>form태그의 method 속성을 post으로 설정해서 요청</h3>
<form action="request-servlet" method="post">
    <input type="submit" value="post 방식의 요청">
</form>
<hr>
</body>
</html>