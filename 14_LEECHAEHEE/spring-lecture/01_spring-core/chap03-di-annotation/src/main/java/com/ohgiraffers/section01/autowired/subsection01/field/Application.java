package com.ohgiraffers.section01.autowired.subsection01.field;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.ohgiraffers.section01");
        context.getBeanDefinitionNames();
        String[] definitionNames = context.getBeanDefinitionNames();
        for (String definitionName : definitionNames) {
            System.out.println("definitionName = " + definitionName);
        }

        // IOC 컨테이너에서 사용
        BookService bookService = context.getBean("bookServiceField", BookService.class);
        System.out.println(bookService.selectBookBySequence(1));
        System.out.println(bookService.selectAllBooks());

        // IOC 컨테이너 없이 사용
        // BookService bookService2 = new BookService();
        // System.out.println(bookService2.selectAllBooks());
    }
}
