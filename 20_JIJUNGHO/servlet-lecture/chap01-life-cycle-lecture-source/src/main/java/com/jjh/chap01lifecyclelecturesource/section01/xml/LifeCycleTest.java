package com.jjh.chap01lifecyclelecturesource.section01.xml;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;

public class LifeCycleTest extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("XML 매핑 init 메소드 호출");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        super.service(req, res);
    }

    @Override
    public void destroy() {
        System.out.println("XML 매핑 destory 메소드 호출");
    }
}