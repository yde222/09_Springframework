package com.ohgiraffers.section01.autowired.subsection01.field;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.ohgiraffers.section01");

        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String definitionName : definitionNames) {
            System.out.println("definitionName = " + definitionName);
        }

        // IoC 컨테이너에서 사용
        BookService bookService = applicationContext.getBean("BookServiceField", BookService.class);
        System.out.println(bookService.selectBookbySequence(1));
        System.out.println(bookService.selectAllBooks());

        // IoC 컨테이너 없이 BookService 코드 사용 (주입 못 받음)
        BookService bookService2 = new BookService();
        System.out.println(bookService2.selectAllBooks());
    }

}


