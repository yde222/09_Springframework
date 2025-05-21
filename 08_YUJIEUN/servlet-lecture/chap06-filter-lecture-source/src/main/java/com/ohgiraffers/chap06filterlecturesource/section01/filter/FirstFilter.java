package com.ohgiraffers.chap06filterlecturesource.section01.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/first/*")
public class FirstFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("FirstFilter init 메소드 호출");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("FirstFilter doFilter 메소드 호출");

        /* 현재 필터에서 다음 필터 또는 서블릿을 호출하는 코드 */
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("서블릿 요청 수행 완료");
    }

    @Override
    public void destroy() {
        System.out.println("FirstFilter destroy 메소드 호출");
    }
}
