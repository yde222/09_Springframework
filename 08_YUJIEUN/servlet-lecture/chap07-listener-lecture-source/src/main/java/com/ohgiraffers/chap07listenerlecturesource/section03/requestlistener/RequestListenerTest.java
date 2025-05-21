package com.ohgiraffers.chap07listenerlecturesource.section03.requestlistener;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebListener
public class RequestListenerTest implements ServletRequestListener, ServletContextAttributeListener  {

    public RequestListenerTest() {
        /* context가 로드될때 생성자 호출하여 인스턴스는 생성된다.*/
        System.out.println("request listener 인스턴스 생성");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        /*request가 소멸된 때 호출된다.*/
        System.out.println("request destroyed");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        /*request가 생성된 때 호출된다.*/
        System.out.println("request initialized");
    }
}
