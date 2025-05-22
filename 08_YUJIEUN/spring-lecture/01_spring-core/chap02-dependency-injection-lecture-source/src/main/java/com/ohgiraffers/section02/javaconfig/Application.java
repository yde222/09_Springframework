package com.ohgiraffers.section02.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for(String definitionName : definitionNames){
            System.out.println("definitionName = " + definitionName);
        }


    }
}
