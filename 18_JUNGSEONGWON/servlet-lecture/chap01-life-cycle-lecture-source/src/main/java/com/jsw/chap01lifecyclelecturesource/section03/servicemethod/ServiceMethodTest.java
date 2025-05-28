package com.jsw.chap01lifecyclelecturesource.section03.servicemethod;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet(value = "/request-service")
public class ServiceMethodTest extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String httpMethod = req.getMethod(); // 사용 클라이언트가 요청한 방식은 어떤 건지 알려준다.(get방식 혹은 Post 방식)
        System.out.println("httpMethod = " + httpMethod);

        // service 메소드에서는 사용자의 요청방식에 다라 get 요청이면 doget Post요청이면 doPost
        if("GET".equals(httpMethod)) {
            doGet(req, resp);
        }else if("POST".equals(httpMethod)) {
            doPost(req, resp);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("GET방식의 요청처리 메소드");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Post방식의 요청처리 메소드");

    }
}
