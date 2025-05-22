package com.ohgiraffers.chap01lifecyclelecturesource.section02.annotation;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

/*
 * @WebServlet : 서블릿을 서블릿 컨테이너에 등록
 * valye 속성 : 서블릿 매핑
 */

@WebServlet(value = "/annotation-lifecycle", loadOnStartup = 1)
public class AnnotationTest extends HttpServlet {
    public AnnotationTest() {
        System.out.println("Annotation 매핑 constructor");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("Annotation 매핑 init");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Annotation 매핑 service");
    }

    @Override
    public void destroy() {
        System.out.println("Annotation 매핑 destroy");
    }
}
