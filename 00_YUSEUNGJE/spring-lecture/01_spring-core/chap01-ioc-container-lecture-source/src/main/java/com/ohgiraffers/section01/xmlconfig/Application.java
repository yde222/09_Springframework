package com.ohgiraffers.section01.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new GenericApplicationContext("section01/xmlconfig/spring-context.xml");
    }
}
