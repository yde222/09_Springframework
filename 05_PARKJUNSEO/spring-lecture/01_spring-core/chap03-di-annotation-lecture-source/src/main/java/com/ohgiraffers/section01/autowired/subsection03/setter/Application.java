package com.ohgiraffers.section01.autowired.subsection03.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.ohgiraffers.section01");

        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String definitionName : definitionNames) {
            System.out.println("definitionName = " + definitionName);
        }

        BookService bookService = applicationContext.getBean("bookServiceSetter", BookService.class);
        System.out.println(bookService.selectAllBooks());
        System.out.println(bookService.selectOneBooksBySequence(1));

    }
}
