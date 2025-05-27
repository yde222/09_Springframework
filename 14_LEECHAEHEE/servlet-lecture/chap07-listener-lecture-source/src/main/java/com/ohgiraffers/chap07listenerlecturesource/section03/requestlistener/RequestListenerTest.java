package com.ohgiraffers.chap07listenerlecturesource.section03.requestlistener;

import jakarta.servlet.ServletRequestAttributeEvent;
import jakarta.servlet.ServletRequestAttributeListener;
import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class RequestListenerTest implements ServletRequestListener, ServletRequestAttributeListener {
    public RequestListenerTest() {
        // context가 로드될 때 생성자 호출하여 인스턴스는 생성된다.
        System.out.println("RequestListener 인스턴스가 생성이 되.");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        // request가 소멸할 때 동작하는 메소드
        System.out.println("request가 소멸이 되.");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        // request가 생성될 때 동작하는 메소드
        System.out.println("request가 생성이 되.");
    }

    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        System.out.println("request attribute 추가가 되.");
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        System.out.println("request attribute 삭제가 되.");
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        System.out.println("request attribute 변경이 되.");
    }
}
