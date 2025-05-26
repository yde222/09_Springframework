package com.ohgiraffers.section01.autowired.subsection02.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

  public static void main(String[] args) {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.ohgiraffers.section01.autowired");
    
    String[] definitionNames = context.getBeanDefinitionNames();
    for(String definitionName : definitionNames) {
      System.out.println("definitionName = " + definitionName);
    }

    BookService bookService = context.getBean("bookServiceContructor", BookService.class);
    System.out.println(bookService.selectBookBySequence(1));
    System.out.println(bookService.selectAllBooks());

    
  }
}
