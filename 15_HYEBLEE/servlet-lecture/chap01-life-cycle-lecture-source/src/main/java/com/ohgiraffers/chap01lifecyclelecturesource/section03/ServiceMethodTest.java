package com.ohgiraffers.chap01lifecyclelecturesource.section03;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet(value = "/request-service")
public class ServiceMethodTest extends HttpServlet {

  // Get과 Post 전에 처리할 적읍은 Service에서 하면 된당.
  @Override
  protected void service(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    // 클라이언트가 요청한 방식이 어떤건지(Get/Post)
    String httpMethod = req.getMethod();
    System.out.println("httpMethod: " + httpMethod);

    // service메소드에서는 사용자의 요청 방식에 따라 get-> doGet, post-> doPost
    if("GET".equals(httpMethod)) {
      doGet(req, resp);
    } else if("POST".equals(httpMethod)) {
      doPost(req, resp);
    }
  }

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    System.out.println("Get 방식의 요청 처리 메소드");
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    System.out.println("Post 방식의 요청 처리 메소드");

  }
}
