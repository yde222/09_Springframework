package com.ohgiraffers.section01.xmlconfig;

import com.ohgiraffers.common.MemberDTO;
import com.ohgiraffers.common.PersonalAccount;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new GenericXmlApplicationContext("section01/xmlconfig/spring-context.xml");

        // 생성자를 통해서 의존성 주입
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println("beanDefinitionName = " + beanDefinitionName);
        }

        MemberDTO member = applicationContext.getBean("member", MemberDTO.class);
        System.out.println(member.getPersonalAccount().getBalance());
    }
}
