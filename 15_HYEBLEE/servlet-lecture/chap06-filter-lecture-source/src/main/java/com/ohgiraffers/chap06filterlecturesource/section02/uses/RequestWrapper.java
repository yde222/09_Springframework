package com.ohgiraffers.chap06filterlecturesource.section02.uses;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


public class RequestWrapper  extends HttpServletRequestWrapper {

  public RequestWrapper(HttpServletRequest request) {
    super(request);
  }

  /* 비밀번호와 관련된 속성 파라미터를 꺼낼 대 암호화를 적용할 확장된 메소드 */
  @Override
  public String getParameter(String name) {
    String value = "";

    // form태그의 비밀번호의 속성값이 password
    if("password".equals(name)) {
      BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
      value = encoder.encode(super.getParameter(name));

    } else{
      value = super.getParameter(name);
    }

    return value;
  }
}
