package com.ohgiraffers.section01.autowired.subsection01.field;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.ohgiraffers.section01");
        
        String[] beanNames = context.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            System.out.println("beanName = " + beanName);
        }

        // Ioc컨테이너에서 사용
        BookService bookService = context.getBean("bookServiceField", BookService.class);
        System.out.println(bookService.selectBookBySequence(1));
        System.out.println(bookService.selectAllBookx());

        // IoC컨테이너 없이 BookService 코드 사용, 주입을 받을 수 없다.
        BookService bookService2 = new BookService();
        System.out.println(bookService2.selectAllBookx());
    }
}
