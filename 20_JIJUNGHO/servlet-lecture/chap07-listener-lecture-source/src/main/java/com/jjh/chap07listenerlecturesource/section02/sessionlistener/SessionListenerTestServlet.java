package com.jjh.chap07listenerlecturesource.section02.sessionlistener;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/session")
public class SessionListenerTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        System.out.println("발급받은 session-id : " + session.getId());

        // added
        session.setAttribute("userName", "honggildong");
        session.setAttribute("age", 30);
        session.setAttribute("gender", "M");

        // replace
        session.setAttribute("userName","jungho");

        // removed
        session.removeAttribute("gender");

        // session을 만료 (세션 바로 삭제)
        session.invalidate();
    }


}