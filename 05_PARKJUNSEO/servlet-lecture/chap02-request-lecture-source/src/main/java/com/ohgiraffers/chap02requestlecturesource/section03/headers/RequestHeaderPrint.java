package com.ohgiraffers.chap02requestlecturesource.section03.headers;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.Enumeration;

@WebServlet(value="/headers")
public class RequestHeaderPrint extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        Enumeration<String> headerNames = req.getHeaderNames();
        while(headerNames.hasMoreElements()) {
            System.out.println(headerNames.nextElement());
        }

        System.out.println("accept : " + req.getHeader("accept"));
        System.out.println("accept-encoding : " + req.getHeader("accept-encoding"));
        System.out.println("accept-language : " + req.getHeader("accept-language"));
        System.out.println("connection : " + req.getHeader("connection"));
        System.out.println("host : " + req.getHeader("host"));
        System.out.println("referer : " + req.getHeader("referer"));
        System.out.println("sec-fetch-dest : " + req.getHeader("sec-fetch-dest"));
        System.out.println("sec-fetch-mode : " + req.getHeader("sec-fetch-mode"));
        System.out.println("sec-fetch-site : " + req.getHeader("sec-fetch-site"));
        System.out.println("sec-fetch-user : " + req.getHeader("sec-fetch-user"));
        System.out.println("cache-control : " + req.getHeader("cache-control"));
        System.out.println("upgrade-insecure-requests : " + req.getHeader("upgrade-insecure-requests"));
        System.out.println("user-agent : " + req.getHeader("user-agent"));
    }


}
