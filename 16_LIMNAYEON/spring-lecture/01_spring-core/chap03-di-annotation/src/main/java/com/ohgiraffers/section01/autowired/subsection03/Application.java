package com.ohgiraffers.section01.autowired.subsection03;

import com.ohgiraffers.section01.autowired.subsection03.BookService;
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

        BookService bookService =
                context.getBean("bookServiceSetter", BookService.class);
        System.out.println(bookService.selectBookBySquence(1));
        System.out.println(bookService.selectAllBooks());

    }
}
