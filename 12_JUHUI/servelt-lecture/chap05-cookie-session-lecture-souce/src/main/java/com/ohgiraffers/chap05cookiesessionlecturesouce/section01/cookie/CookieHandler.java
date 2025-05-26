package com.ohgiraffers.chap05cookiesessionlecturesouce.section01.cookie;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet(value = "/cookie")
public class CookieHandler extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName"); //getParameter("키값(form 태그의 name 속성값")
        String lastName = request.getParameter("lastName");

//        System.out.println("firstName = " + firstName);
//        System.out.println("lastName = " + lastName);

        /* 1. 쿠키 생성 */
        Cookie firstNameCookie = new Cookie("firstName", firstName);
        Cookie lastNameCookie = new Cookie("lastName", lastName);

        /* 2. 쿠키 만료 시간 설정 */
        firstNameCookie.setMaxAge(60*60*24); // 초 단위로 하루를 만료시간으로 설정
        lastNameCookie.setMaxAge(60*60*24);

        /* 3. 응답 헤더에 쿠기를 담기 */
        response.addCookie(firstNameCookie);
        response.addCookie(lastNameCookie);

        response.sendRedirect("/cookie-redirect");
    }
}