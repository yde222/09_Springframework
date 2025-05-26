package com.ohgiraffers.chap07listenerlecturesource.section02.sessionlistener;

import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionAttributeListener;
import jakarta.servlet.http.HttpSessionListener;

@WebListener
public class SessionListenerTest implements HttpSessionListener, HttpSessionAttributeListener {
  public SessionListenerTest() {
    /* context가 로드 될 때 인스턴스가 생성된다. */
    System.out.println("Session listener 인스턴스 생성");
  }
}
