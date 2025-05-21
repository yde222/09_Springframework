package com.ohgiraffers.chap06filterlecturesoruce.section02.uses;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
/* 여기의 필터 등록과 설정은 web.xml(배포서술자)를 통해서 작성함 */
public class EncodingFilter implements Filter {
    private String encodingType;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        encodingType = filterConfig.getInitParameter("encoding-type");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("EncodingFilter 동작");
        // POST 방식의 요청이 오면 문자셋을 설정하는 전처리 작업
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        if("POST".equals(request.getMethod())) {
            servletRequest.setCharacterEncoding(encodingType);
        }
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
