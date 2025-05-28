package com.jsw.chap03responselecturesource.section03.exception;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Iterator;

// custom error page 응답하는 서블릿
@WebServlet(value = "/showErrorPage")
public class ExceptionHanlder extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 요청 속성들 출력 (디버깅용)
        Enumeration<String> attributeNames = request.getAttributeNames();
        while (attributeNames.hasMoreElements()) {
            String attributeName = attributeNames.nextElement();
            System.out.println(attributeName + " : " + request.getAttribute(attributeName));
        }

        // 오류 정보 추출
        Integer statusCode = (Integer) request.getAttribute("jakarta.servlet.error.status_code");
        String message = (String) request.getAttribute("jakarta.servlet.error.message");
        String servletName = (String) request.getAttribute("jakarta.servlet.error.servlet_name");

        // null 값 방지
        if (statusCode == null) statusCode = 0;
        if (message == null) message = "에러 메시지가 없습니다.";
        if (servletName == null) servletName = "알 수 없음";

        // HTML 응답 작성
        StringBuilder sb = new StringBuilder();
        sb.append("<html>")
                .append("<head>")
                .append("<title>응답페이지</title>")
                .append("</head>")
                .append("<body>")
                .append("<h1>오류 상태 코드: ").append(statusCode).append("</h1>")
                .append("<h2>에러 메시지: ").append(message).append("</h2>")
                .append("<h3>서블릿 이름: ").append(servletName).append("</h3>")
                .append("</body>")
                .append("</html>");

        // 응답 전송
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter printWriter = response.getWriter();
        printWriter.println(sb.toString());
        printWriter.flush();
        printWriter.close();
    }
}
