package com.jjh.chap02requestlecturesource.section03.headers;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.Enumeration;

@WebServlet(value = "/headers")
public class RequestHeaderPrint extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        요청 받은 데이터를 꺼내려면 HttpServletRequest request에서 확인
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            System.out.println(headerNames.nextElement());
        }

        System.out.println("accept : " + request.getHeader("accept"));
        System.out.println("accept-encoding : " + request.getHeader("accept-encoding"));
        System.out.println("accept-language : " + request.getHeader("accept-language"));
        System.out.println("connection : " + request.getHeader("connection"));
        System.out.println("host : " + request.getHeader("host"));
        System.out.println("referer : " + request.getHeader("referer"));
        System.out.println("sec-fetch-dest : " + request.getHeader("sec-fetch-dest"));
        System.out.println("sec-fetch-mode : " + request.getHeader("sec-fetch-mode"));
        System.out.println("sec-fetch-site : " + request.getHeader("sec-fetch-site"));
        System.out.println("sec-fetch-user : " + request.getHeader("sec-fetch-user"));
        System.out.println("cache-control : " + request.getHeader("cache-control"));
        System.out.println("upgrade-insecure-requests : " + request.getHeader("upgrade-insecure-requests"));
        System.out.println("user-agent : " + request.getHeader("user-agent"));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}