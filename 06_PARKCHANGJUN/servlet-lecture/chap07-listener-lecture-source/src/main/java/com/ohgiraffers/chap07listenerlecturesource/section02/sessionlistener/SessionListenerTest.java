package com.ohgiraffers.chap07listenerlecturesource.section02.sessionlistener;

import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.*;

@WebListener
public class SessionListenerTest implements HttpSessionListener, HttpSessionAttributeListener {
    /*
     * 2. session (→ 세션에서 발생 가능한 이벤트)
     * 2-1. HttpSessionListener : Http 세션의 시작, 종료에 대한 이벤트 리스너
     * 2-2. HttpSessionAttributeListener : HttpSession에 attribute를 추가, 제거, 수정에 대한 이벤트 리스너
     */

    public SessionListenerTest() {
        /* context가 로드 될 때 인스턴스가 생성된다. */
        System.out.println("session listener 인스턴스 생성");
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        /* 세션이 만료될 시 동작한다. */
        System.out.println("session created!!");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        /* 세션이 생성될 때 동작한다. */
        System.out.println("session destroyed!!");
    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        System.out.println("attribute added!!");
        System.out.println("add : " + event.getName() + " : " + event.getValue());
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
        System.out.println("attribute removed!!");
        System.out.println("remove : " + event.getName() + " : " + event.getValue());

    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
        System.out.println("attribute replaced!!");
        System.out.println("replaced : " + event.getName() + " : " + event.getValue());

    }
}
