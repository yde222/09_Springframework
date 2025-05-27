package com.ohgiraffers.chap01lifecyclelecturesource.section01.xml;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class LifeCycleTest extends HttpServlet {

  public LifeCycleTest() {
    System.out.println("XML 매핑 생성자 호출");
  }

  @Override
  public void init(ServletConfig config) throws ServletException {

    System.out.println("XML 매핑 init 메소드 호출");
  }

  @Override
  public void service(ServletRequest req, ServletResponse res)
      throws ServletException, IOException {
    System.out.println("XML 매핑 service 메소드 호출");
  }

  @Override
  public void destroy() {
    System.out.println("XML 매핑 destroy 메소드 호출");
  }
}
