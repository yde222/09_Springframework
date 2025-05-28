package com.jsw.chap03responselecturesource.section01.response;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/response")
public class ResponseTest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        StringBuilder sb = new StringBuilder();
        sb.append("<html>")
                .append("<head>")
                .append("<title>Response</title>")
                .append("</head>")
                .append("<body>")
                .append("<h1>안녕 Servlet Response</h1>")
                .append("</body>")
                .append("</html>");
        response.setContentType("text/html"); // 응답 데이터의 MIME type 설정
        response.setCharacterEncoding("UTF-8"); // 응답 데이터의 문자 셋 설정

        response.setContentType("text/html; charset=UTF-8"); // 위의 두가지 설정을 한번에

        /* tocat 10버전 이상부터는 MIME type만 기재해도 문자 셋이 자동으로 uft-8로 설정*/

       // 사용자 브라우저에 응답하기 위한 출력 스트림을 response에서 반환한다.
        PrintWriter printWriter = response.getWriter();
        printWriter.print(sb);
        printWriter.flush();
        printWriter.close();
    }

}
