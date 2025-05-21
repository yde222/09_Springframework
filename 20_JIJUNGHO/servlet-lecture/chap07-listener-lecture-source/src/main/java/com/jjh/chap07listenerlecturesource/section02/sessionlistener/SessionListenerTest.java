package com.jjh.chap07listenerlecturesource.section02.sessionlistener;

import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionAttributeListener;
import jakarta.servlet.http.HttpSessionBindingEvent;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

@WebListener
public class SessionListenerTest implements HttpSessionListener, HttpSessionAttributeListener {
    public SessionListenerTest() {
        // context가 load 될 때 인스턴스가 생성된다.
        System.out.println("session listener 인스턴스 생성됨~~");
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        // 세션이 생성 될때 동작
        System.out.println("session Created~~");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        // 세션이 만료 될때 동작
        System.out.println("session Destroyed~~");
    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        // session에 attribute가 추가될때 동작
        System.out.println("session attribute added!!!!");
        System.out.println("add : " + event.getName() + " : " + event.getValue());
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
        // session에 attribute가 삭제될때 동작
        System.out.println("session attribute removed!!!!");
        System.out.println("removed : " + event.getName() + " : " + event.getValue());
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
        // session에 attribute가 변경될때 동작
        System.out.println("session attribute replaced!!!!");
        System.out.println("replaced : " + event.getName() + " : " + event.getValue());
    }
}
