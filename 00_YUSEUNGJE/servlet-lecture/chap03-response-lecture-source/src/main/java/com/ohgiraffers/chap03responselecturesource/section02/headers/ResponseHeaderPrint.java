package com.ohgiraffers.chap03responselecturesource.section02.headers;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet(value="/headers")
public class ResponseHeaderPrint extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        long currentTime = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        sb.append("<html>")
                .append("<head>")
                .append("<title>응답페이지</title>")
                .append("</head>")
                .append("<body>")
                .append("<h1>")
                .append(currentTime)
                .append("</h1>")
                .append("</body>")
                .append("</html>");


    }
}
