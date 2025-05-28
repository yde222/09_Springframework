package com.jsw.chap01lifecyclelecturesource.section01.xml;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;

public class LiftCycleTest extends HttpServlet {

    public LiftCycleTest() {
        System.out.println("XML Mapping constructor");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("XML Mapping init");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("XML Mapping Service ");
    }

    @Override
    public void destroy() {
        System.out.println("XML Mapping destroy ");
    }
}
