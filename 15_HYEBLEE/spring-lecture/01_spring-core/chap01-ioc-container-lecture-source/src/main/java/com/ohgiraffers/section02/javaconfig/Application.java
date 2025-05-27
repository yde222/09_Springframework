package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
  public static void main(String[] args) {
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigurationContext.class);
    MemberDTO member = (MemberDTO) applicationContext.getBean("member");
  }
}
