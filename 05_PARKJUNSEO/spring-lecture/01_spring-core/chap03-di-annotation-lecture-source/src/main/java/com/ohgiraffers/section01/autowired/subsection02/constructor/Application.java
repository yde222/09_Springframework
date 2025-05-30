package com.ohgiraffers.section01.autowired.subsection02.constructor;

import com.ohgiraffers.section01.autowired.common.BookDAOImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.ohgiraffers.section01");

        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String definitionName : definitionNames) {
            System.out.println("definitionName = " + definitionName);
        }

        BookService bookService = applicationContext.getBean("bookServiceConstructor", BookService.class);
        System.out.println(bookService.selectAllBooks());
        System.out.println(bookService.selectOneBooksBySequence(1));

        // IoC 컨테이너 없이 코드를 테스트할 떄 생성자를 통해 BookDAO 객체를 전달하여 처리 가능
        BookService bookService2 = new BookService(new BookDAOImpl());
        System.out.println(bookService2.selectAllBooks());
    }
}
