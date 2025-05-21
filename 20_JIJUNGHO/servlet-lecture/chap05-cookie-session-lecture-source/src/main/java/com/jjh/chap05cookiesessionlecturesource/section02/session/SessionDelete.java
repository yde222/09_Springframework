package com.jjh.chap05cookiesessionlecturesource.section02.session;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.Enumeration;

@WebServlet(value = "/session-delete")
public class SessionDelete extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        System.out.println("check =======> ");
        Enumeration<String> attributeNames = session.getAttributeNames(); // 세션에 담긴 속성명을 출력

        while (attributeNames.hasMoreElements()) {
            String attributeName = attributeNames.nextElement();
            System.out.println("attributeName = " + session.getAttribute(attributeName));
        }

        /***
         * 세션데이터 제거하는 방법
         * 1. 설정 만료 시간이 지나 세션 자동 제거
         * 2. removeAttribute()로 속성 제거
         * 3. invalidate()로 세션의 모든 데이터 제거(세션무효화, 강제 만료)
         */

        // 개별로 하나씩 지우는 방법
        session.removeAttribute("firstName");
        System.out.println("----> firstName remove");

        attributeNames = session.getAttributeNames(); // 세션에 담긴 속성명을 출력

        while (attributeNames.hasMoreElements()) {
            String attributeName = attributeNames.nextElement();
            System.out.println("attributeName = " + session.getAttribute(attributeName));
        }

        System.out.println("=======================================");

        // 한번에 모든 데이터 지우기
        session.invalidate();
        attributeNames = session.getAttributeNames(); // 세션에 담긴 속성명을 출력

        while (attributeNames.hasMoreElements()) {
            String attributeName = attributeNames.nextElement();
            System.out.println("attributeName = " + session.getAttribute(attributeName));
        }
    }
}