package com.ohgiraffers.chap05cookiesesstionlecturesource.section02.session;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/session-delete")
public class DeleteSessionData extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(      );
        System.out.println("session check >>>> ");
        Enumeration<String> attributeNames = session.getAttributeNames();// 세션에 담긴 속성명을 출력하는 메소드
        while (attributeNames.hasMoreElements()) {
            String attributeName = attributeNames.nextElement();
            System.out.println(attributeName + " : " + session.getAttribute(attributeName));
        }
    }
}
