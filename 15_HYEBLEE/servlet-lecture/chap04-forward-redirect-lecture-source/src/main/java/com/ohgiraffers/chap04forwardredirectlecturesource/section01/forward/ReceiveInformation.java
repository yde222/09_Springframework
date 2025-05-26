package com.ohgiraffers.chap04forwardredirectlecturesource.section01.forward;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet(value = "/forward")
public class ReceiveInformation extends HttpServlet {

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    String userId = request.getParameter("userId");
    String password = request.getParameter("password");

    request.setAttribute("userName", "홍길동");


  }
}
