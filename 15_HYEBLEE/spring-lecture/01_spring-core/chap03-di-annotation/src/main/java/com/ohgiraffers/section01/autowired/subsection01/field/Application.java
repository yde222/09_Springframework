package com.ohgiraffers.section01.autowired.subsection01.field;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(
        "com.ohgiraffers.section01");
    String[] definitionNames = context.getBeanDefinitionNames();
    for (String definitionName : definitionNames) {
      System.out.println("definitionName = " + definitionName);
    }

    // IoC 컨테이너에서 꺼내서 사용
    BookService bookService = context.getBean("bookServiceField", BookService.class); // 이름, 반환받을 타입
    System.out.println(bookService.selectBookBySequence(1));
    System.out.println(bookService.selectAllBooks());

    // IoC컨테이너 없이 BookService 코드 사용 -> 주입 안되어있음
    // @Autowired 생성자를 만들면 **기본 생성자(디폴트 생성자)**가 없어지기 때문에,
    // 기본 생성자로 만들려고 하면 오류가 난다.
/*    BookService bookService2 = new BookService();
    System.out.println(bookService2.selectAllBooks());*/
  }
}
