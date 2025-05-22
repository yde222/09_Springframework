package com.ohgiraffers.chap05filterlecturesource.section02.uses;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;

// 여기의 필터의 등록과 설정은 web.xml(배포 서술자)를 통해서 작성함.
public class EncodingFilter implements Filter {

    private String encodingType;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        encodingType = filterConfig.getInitParameter("encoding-Type");
    }


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("encoding Filter 동작");
        // POST 방식의 요청이 오면 문자셋을 설정하는 전처리 작업
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        if("POST".equals(request.getMethod())) {
            servletRequest.setCharacterEncoding(encodingType);
        }
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }

}
