package com.ohgiraffers.chap02requestlecturesource.section01.queryString;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet(value = "/querystring")
public class QueryStringTest extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    /*
     * HTTPServletRequest객체로부터 요청 시 전달한 값ㅇ르 getParameter메소드로 추출할 수 있다.
     * 인자로 input태그의 name속성 값을 문자열 형태로 전달한다.
     * 모든 input 태그의 값을 hashmap으로 관리하고 있으므로 원하는 값을 찾기 위해
     * key 역할을 할 문자열이 필요하다.
     * */
      String name = request.getParameter("name"); // ctrl + alt + v
      System.out.println(name);
      int age = Integer.parseInt(request.getParameter("age"));
      System.out.println("age=" + age);
      java.sql.Date birthday = java.sql.Date.valueOf(request.getParameter("birthday"));
      System.out.println("birthday=" + birthday);
      String gender = request.getParameter("gender");
      System.out.println("gender=" + gender);
      String nationality = request.getParameter("nationality");
      System.out.println("nationality=" + nationality);
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

  }
}
