package com.ohgiraffers.chap07listenerlecturesource.section01.contextlistener;

import jakarta.servlet.ServletContextAttributeListener;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class ContextListenerTest implements ServletContextListener, ServletContextAttributeListener {
}
