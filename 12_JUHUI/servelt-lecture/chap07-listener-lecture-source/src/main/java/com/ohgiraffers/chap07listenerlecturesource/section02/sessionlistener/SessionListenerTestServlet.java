package com.ohgiraffers.chap07listenerlecturesource.section02.sessionlistener;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebListener()
@WebServlet("/session") // 또 다른 속성이 없다면 value 없이 사용가능.
public class SessionListenerTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        System.out.println("발급받은 ssion id : " + session.getId());

        session.setAttribute("username", "honggildong");
        session.setAttribute("age", 30);
        session.setAttribute("gender", "m");

        // replaced
        session.setAttribute("username", "hong");

        /* session을 만료 */
        session.invalidate();
    }
}