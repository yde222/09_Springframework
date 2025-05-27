package com.ohgiraffers.common.section01;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext
                = new GenericXmlApplicationContext("section01/xmlconfig/spring-config.xml");
        
        String[] definitions = applicationContext.getBeanDefinitionNames();
        for (String definition : definitions) {
            System.out.println("definition = " + definition);
        }



        MemberDTO member = applicationContext.getBean("member", MemberDTO.class);
        System.out.println(member.getPersonalAccount().getBalance());
    }
}
