package com.ohgiraffers.chap06filterlecturesource.section02.uses;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet(value = "/member/regist")
public class RegistmemberServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userId = request.getParameter("userId");
        String password = request.getParameter("password");
        String name = request.getParameter("name");

        System.out.println("userId = " + userId);
        System.out.println("password = " + password);
        System.out.println("name = " + name);


        /**/
        BCryptPasswordEncorder encoder = new BCryptPasswordEncorder();
        System.out.println("비밀번호가 pass01?" + encoder.matches("pass01",password));

    }
}
