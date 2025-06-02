<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Filter</title>
</head>
<body>
<h1>필터의 라이프사이클</h1>
<a href="first/filter">filter 테스트하기</a>

<hr>

<h1>필터의 활용</h1>
<form action="member/regist" method="post">
    <label>아이디 : </label>
    <input type="text" name="userId"><br>
    <label>비밀번호 : </label>
    <input type="password" name="pwd"><br>
    <label>이름 : </label>
    <input type="text" name="name"><br>
    <button>가입하기</button>
</form>
</body>
</html>