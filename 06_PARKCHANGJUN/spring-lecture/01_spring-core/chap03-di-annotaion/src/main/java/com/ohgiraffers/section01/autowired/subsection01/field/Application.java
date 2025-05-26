package com.ohgiraffers.section01.autowired.subsection01.field;

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
        // IoC컨테이너에서 사용
        BookService bookService = (BookService) context.getBean("bookServiceField", BookService.class);
        System.out.println(bookService.selectBookBySequence(1));
        System.out.println(bookService.selectAllBooks());

        // IoC컨테이너 없이 BookService 코드 사용 (따라서 오류)
//        BookService bookService2 = new BookService();
//        System.out.println(bookService2.selectAllBooks());
    }
}
