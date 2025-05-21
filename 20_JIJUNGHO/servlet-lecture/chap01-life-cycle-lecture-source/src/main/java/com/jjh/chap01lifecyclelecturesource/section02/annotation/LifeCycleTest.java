package com.jjh.chap01lifecyclelecturesource.section02.annotation;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

import java.io.IOException;

/***
 * @WebServlet : 서블릿을 서블릿 컨테이너에 등록
 * value 속성 : 서블릿 매핑
 */

@WebServlet(value="/annotation-lifecyle", loadOnStartup = 1)
public class LifeCycleTest extends HttpServlet {

    public LifeCycleTest() {
        System.out.println("Annotation Mapping construtor");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("Annotation 매핑 init 메소드 호출");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Annotation mapping service");
    }

    @Override
    public void destroy() {
        System.out.println("Annotation 매핑 destory 메소드 호출");
    }
}