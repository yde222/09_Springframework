package com.ohgiraffers.chap04forwardredirectlecturesource.section02.redirect;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet(value = "/otherservlet")
public class OtherServletredirect extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    System.out.println("get요청으로 정상 수락 후 응답");
    String name = request.getParameter("name");
    System.out.println("name:" + request.getParameter("name"));

    request.setAttribute("name2", name);
    response.sendRedirect("redirect");
  }


}
