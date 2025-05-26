package com.ohgiraffers.section01.autowired.subsection02.constructor;

import com.ohgiraffers.section01.autowired.common.BookDAOImpl;
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
                context.getBean("bookServiceConstructor", BookService.class);
        System.out.println(bookService.selectBookBySquence(1));
        System.out.println(bookService.selectAllBooks());

        // Ioc컨테이너 없이 코드를 테스트 할 때 생성자를 통해
        BookService bookService2 = new BookService((new BookDAOImpl()));
        System.out.println(bookService2.selectAllBooks());
    }
}
