package com.ohgiraffers.chap01lifesourcelecturesource.section02.annotation;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
/*
* @WebServelt : 서블릿을 서블릿 컨테이너에 등록
* value 속성 : 서블릿 매핑
* */

@WebServlet(value = "/annotation-lifecycle", loadOnStartup = 1)

public class LifeCycleTest extends HttpServlet {

    public LifeCycleTest() {
        System.out.println("Annotation Mapping Constructor");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("Annotation Mapping Init");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Annotation Mapping Service");
    }

    @Override
    public void destroy() {
        System.out.println("Annotation Mapping Destroy");
    }
}
