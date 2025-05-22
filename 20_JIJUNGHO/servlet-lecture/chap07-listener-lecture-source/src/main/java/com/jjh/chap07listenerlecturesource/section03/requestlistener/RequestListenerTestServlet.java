package com.jjh.chap07listenerlecturesource.section03.requestlistener;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet(value="/request")
public class RequestListenerTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // add
        request.setAttribute("userName","jijungho");
        request.setAttribute("ages", 30);
        request.setAttribute("gender", "M");

        // replaced
        request.setAttribute("username", "hoya");

        // removed
        request.removeAttribute("gender");


    }
}