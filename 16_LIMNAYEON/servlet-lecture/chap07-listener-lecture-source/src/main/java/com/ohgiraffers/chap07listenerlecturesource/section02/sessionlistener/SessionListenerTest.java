package com.ohgiraffers.chap07listenerlecturesource.section02.sessionlistener;

import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionAttributeListener;
import jakarta.servlet.http.HttpSessionBindingEvent;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

@WebListener
public class SessionListenerTest implements HttpSessionListener, HttpSessionAttributeListener {

    public SessionListenerTest() {
        // context가 로드 될 때 인스턴스가 생성된다.
        System.out.println("session listener 인스턴스 생성");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        // 세션이 만료될 때 동작한다.
        System.out.println("session destoryed!!!");
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        // 세션이 생성될 때 동작한다.
        System.out.println("session created!!!");
    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        System.out.println("session attribute added!!!");
        System.out.println("add : " + event.getName() + ", " + event.getValue());

    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
        System.out.println("session attribute removed!!!");
        System.out.println("remove : " + event.getName()  + ", " + event.getValue());
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
        System.out.println("session attribute replaced!!!");
        System.out.println("replace : " + event.getName() + ", " +  event.getValue());
    }
}
