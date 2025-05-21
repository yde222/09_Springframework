package com.jjh.chap03responseleturesource.section01.response;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/response")
public class Response extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        StringBuilder sb = new StringBuilder();
        sb.append("<html>")
                .append("<head>")
                .append("<title>응답페이지</title>")
                .append("</head>")
                .append("<body>")
                .append("<h1>안녕 Servlet Response</h1>")
                .append("</body>")
                .append("</html>");

        // response.setContentType("text/html"); // 응답 데이터의 MIME type 설정
        // response.setCharacterEncoding("utf-8"); // 응답 데이터의 문자 셋 설정
        // response.setContentType("text/html;charset=UTF-8"); // 위 두 코드 한번에 사용

        // tomcat 10버전 이상 부터는 MINE type만 기재해도 문자 셋이 자동으로 utf-8 설정
        response.setContentType("text/plain");

        // 사용자 브라우저에 응답하기 위한 출력 스트림을 response에서 반환 받는다.
        PrintWriter writer = response.getWriter();
        writer.print(sb);
        writer.flush();
        writer.close();

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}