package com.ohgiraffers.chap07listenerlecturesource.section03.requestlistener;

import jakarta.servlet.ServletRequestAttributeListener;
import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;

public class RequestlistenerTest implements ServletRequestListener,
    ServletRequestAttributeListener {

  public RequestlistenerTest() {
    /* contexr가 로드될 때 생성자 호출하여 인스턴스 생성 */
    System.out.println("Requestlistener 인스턴스 생성");
  }

  @Override
  public void requestDestroyed(ServletRequestEvent sre) {
  /* request가 소멸될 때 호출된다. */
    System.out.println("request destroyed!!");
  }


  @Override
  public void requestInitialized(ServletRequestEvent sre) {
    /* request가 생성될 때 호출된다. */
    System.out.println("request initialized!");
  }
}
