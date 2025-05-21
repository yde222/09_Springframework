package com.ohgiraffers.chap07listenerlecturesource.section02.sessionlistener;

import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionAttributeListener;
import jakarta.servlet.http.HttpSessionBindingEvent;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

@WebListener
public class SessionListenerTest implements HttpSessionListener, HttpSessionAttributeListener {
    public SessionListenerTest() {
        /* context가 로드될 때 인스턴스 생성 */
        System.out.println("SessionListener 인스턴스가 생성이 되.");
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        /* 세션 생성 시 동작 */
        System.out.println("session이 생성이 되.");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        /* 세션 종료 시 동작 */
        System.out.println("session이 종료가 되.");
    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        System.out.println("attribute 추가가 되.");
        System.out.println("add : " + event.getName() + " : " + event.getValue());
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
        System.out.println("attribute 삭제가 되.");
        System.out.println("removed : " + event.getName() + " : " + event.getValue());
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
        System.out.println("attribute 변경이 되.");
        System.out.println("replaced : " + event.getName() + " : " + event.getValue());
    }
}
