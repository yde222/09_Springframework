package com.ohgiraffers.chap04forwardredirectlecturesource.section01.forward;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/print")
public class PrintLoginSuccess extends HttpServlet {

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    /*
     * forward된 servlet에서도 요청 방식이 그대로 유지 된다. post -> post
     * 또한 전달된 request, response를 깊은 복사를 통해 만들어서 전달한다.
     * 고로 이전 데이터가 그대로 유지된다.
     * */
    String username = (String) request.getParameter("username");

    System.out.println("username = " + username);
    request.getParameter("userId");

    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("<h1>" + username+"님 환영합니다." + "</h1>");
    out.flush();
    out.close();
  }
}
