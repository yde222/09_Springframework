package com.ohgiraffers.section01.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class ContextConfiguration {
/*
* proxyTargetClass = true : Proxy 객체 생성의 방식으로 CGLib 방식을 사용
* target object가 class인 경우에도 proxy 객체 생성 가능
* */


}

