package com.ohgiraffers.chap07listenerlecturesource.section03.requestlistener;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
@WebServlet("/request")
public class RequestListnerTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("username", "HongGilDong");
        request.setAttribute("age", 24);
        request.setAttribute("gender", "M");

        request.setAttribute("username", "hong");

        request.removeAttribute("gender");

    }
}
