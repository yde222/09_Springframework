package com.ohgiraffers.chap07listenerlecturesource.session03.requestlistener;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.annotation.WebServlet;

@WebListener
public class RequestListenerTest implements ServletRequestListener, ServletRequestAttributeListener {

    public RequestListenerTest() {
        System.out.println("request listener 생성!!");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        // request가 소멸될 때 호출된다.
        System.out.println("request destroyed!!!");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        // request가 생성될 때 호출된다.
        System.out.println("request initialized!!!");
    }

    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {

    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {

    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {

    }
}
