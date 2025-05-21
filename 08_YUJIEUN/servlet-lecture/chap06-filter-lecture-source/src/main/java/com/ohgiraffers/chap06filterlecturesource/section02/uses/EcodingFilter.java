package com.ohgiraffers.chap06filterlecturesource.section02.uses;

import com.ohgiraffers.chap06filterlecturesource.HelloServlet;
import jakarta.servlet.*;

import java.io.IOException;

/*여기의 필터의 등록과 설정은 web.xml(배포서술자)를 통해서 작성함*/
public class EcodingFilter implements Filter {
    private  String encodingType;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        encodingType = filterConfig.getInitParameter("encoding-Type");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Ecoding Filter 동작");
        //POST 방식의 요청이 오면 문자셋을 설정하는 전처리 작업
        HelloServlet request = (HelloServlet) servletRequest;
        if("POST".equals(request.getMethod())){
            servletRequest.setCharacterEncoding(encodingType);
        }
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
