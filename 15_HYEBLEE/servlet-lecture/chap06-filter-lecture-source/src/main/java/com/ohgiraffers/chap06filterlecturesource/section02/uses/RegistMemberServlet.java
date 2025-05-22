package com.ohgiraffers.chap06filterlecturesource.section02.uses;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@WebServlet(value = "/member/regist")
public class RegistMemberServlet extends HttpServlet {

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    String userId = request.getParameter("userId");
    String password = request.getParameter("password");
    String name = request.getParameter("name");

    System.out.println("userId = " + userId);
    System.out.println("password = " + password);
    System.out.println("name = " + name);


    /* 암호화된 패스워드는 동일 값이 입력되더라도 매번 실행 시 salt에 의해 다른 값을
    * 가지게 된다. 입력값 동일 여부 확인은 matches라느 메소드를 통해 확인한다.
    * */
    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    System.out.println("password ?" + encoder.matches("pass01", password));
  }


}
