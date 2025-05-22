package com.jjh.chap05cookiesessionlecturesource.section01.cookie;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet(value = "/cookie")
public class CookieHandler extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName"); // getParameter("키값(form 태그의 name 속성명)")
        String lastName = request.getParameter("lastName");

        /* 1. 쿠키 생성 */
        Cookie firstNameCookie = new Cookie("firstName", firstName);
        Cookie lastNameCookie = new Cookie("lastName", lastName);

        /* 2. 쿠기 만료 시간 설정 (초단위) */
        firstNameCookie.setMaxAge(60 * 60 * 24); // 초 단위로 하루를 만료시간으로 설정
        lastNameCookie.setMaxAge(60 * 60 * 24);

        /* 응답 헤더에 쿠키를 담음 */
        response.addCookie(firstNameCookie);
        response.addCookie(lastNameCookie);

        response.sendRedirect("cookie-redirect");
    }
}