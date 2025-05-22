package com.ohgiraffers.chap05cookiesesstionlecturesource.section02.session;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet(value = "/session")
public class SessionHandler extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();

        /*
         * 세션 브라우저 당 한 개의 고유 아이디를 가지고 하나의 인스턴스를 이용한다.
         * 반복 요청시 동일 session id 를 반환한다.
         * 단, 브라우저가 종료되면, 해당 세션이 종료되므로 그 이후의 요청은 다른 session id를 반환한다.
         * session id는 cookie에 저장되어 있다.
         */

        response.sendRedirect("session-redirect");

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");

        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);

        session.setAttribute("firstName", firstName);
        session.setAttribute("lastName", lastName);
    }
}
