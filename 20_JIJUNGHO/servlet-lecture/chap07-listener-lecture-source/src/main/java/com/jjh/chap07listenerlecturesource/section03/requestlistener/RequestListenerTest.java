package com.jjh.chap07listenerlecturesource.section03.requestlistener;

import jakarta.servlet.ServletRequestAttributeEvent;
import jakarta.servlet.ServletRequestAttributeListener;
import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class RequestListenerTest implements ServletRequestListener, ServletRequestAttributeListener {
    /*
    * request (→ request 관련 이벤트)
     * ServletRequestListener : ServletRequest 생성과 소멸에 대한 이벤트 리스너
     * ServletRequestAttributeListener에 attribute를 추가, 제거, 수정하는 것에 대한 이벤트 리스너
    * */

    public RequestListenerTest() {
        /* context가 load 될 때 생성자 호출하여 인스턴스 생성 */
        System.out.println("request listener 인스턴스 생성##");
    }


    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        /* request가 생성될 때 호출 */
        System.out.println("request Initialized##");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        /* request가 소멸될 때 호출 */
        System.out.println("request Destroyed##");
    }

    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        System.out.println("request attribute added!!!!");
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        System.out.println("request attribute Removed!!!!");
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        System.out.println("request attribute Replaced!!!!");
    }
}
