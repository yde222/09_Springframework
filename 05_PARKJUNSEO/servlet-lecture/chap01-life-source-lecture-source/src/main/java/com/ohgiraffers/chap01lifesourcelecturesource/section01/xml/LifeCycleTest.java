package com.ohgiraffers.chap01lifesourcelecturesource.section01.xml;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;

public class LifeCycleTest extends HttpServlet {

    public LifeCycleTest() {
        System.out.println("XML Mapping Constructor");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("XML Mapping Init");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("XML Mapping Service");
    }

    @Override
    public void destroy() {
        System.out.println("XML Mapping Destroy");
    }
}
