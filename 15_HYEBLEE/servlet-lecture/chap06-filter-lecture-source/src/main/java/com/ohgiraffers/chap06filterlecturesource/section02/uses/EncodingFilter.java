package com.ohgiraffers.chap06filterlecturesource.section02.uses;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import java.io.IOException;

// 여기의 필터의 등록과 설정은 web.xml(배포 서술자)를 통해서 작성함
public class EncodingFilter implements Filter {
  private String encodingType;

  @Override
  public void init(FilterConfig filterConfig) throws ServletException {
  encodingType = filterConfig.getInitParameter("encoding-type");
  }

  @Override
  public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
      FilterChain filterChain) throws IOException, ServletException {
    System.out.println("Encoding Filter 동작");
    // POST 방식의 요처이 오면 문자셋을 설정하는 전처리 작업
    HttpServletRequest request = (HttpServletRequest) servletRequest;

    if("POST".equals(request.getMethod())) { // POST이면 UTF-8로..
      servletRequest.setCharacterEncoding(encodingType);
    }

    filterChain.doFilter(servletRequest, servletResponse);
  }

  @Override
  public void destroy() {

  }
}
