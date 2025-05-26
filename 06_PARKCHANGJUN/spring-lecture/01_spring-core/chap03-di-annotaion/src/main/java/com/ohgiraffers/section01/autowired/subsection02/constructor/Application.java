package com.ohgiraffers.section01.autowired.subsection02.constructor;

import com.ohgiraffers.section01.autowired.common.BookDAOImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.ohgiraffers.section01");

        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println("beanDefinitionName = " + beanDefinitionName);
        }

        BookService bookService =
                context.getBean("bookServiceConstructor", BookService.class);
        System.out.println(bookService.selectBookBySequence(1));
        System.out.println(bookService.selectAllBooks());

        // IoC컨테이너 없이 코드를 테스트 할 때 생성자를 통해 BookDAO객체를 전달하여 처리 가능
        BookService bookService2 = new BookService(new BookDAOImpl());
        System.out.println(bookService2.selectAllBooks());
    }
}
