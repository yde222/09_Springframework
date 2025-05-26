package com.ohgiraffers.chap07listenerlecturesource.section01.contextlistener;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/context")
public class ContextListenerTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("context listener 확인용 서블릿");

        ServletContext context = request.getServletContext();

        System.out.println("context = " + context);

        /* context에 attribute을 추가 */
        context.setAttribute("test", "value");

        /* 도일한 key로 context에 attribute을 추가하면 attributeReplaced() 메소드가 동작 */
        context.setAttribute("test", "value2");

//      /* context에서 attribute을 제거하면 attributeRemoved() 메소드가 동작 */
        context.removeAttribute("test");


    }

}
