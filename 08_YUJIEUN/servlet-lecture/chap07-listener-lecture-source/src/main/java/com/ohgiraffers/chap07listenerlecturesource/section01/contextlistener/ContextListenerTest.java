package com.ohgiraffers.chap07listenerlecturesource.section01.contextlistener;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebListener
public class ContextListenerTest implements ServletContextListener, ServletContextAttributeListener {

}
