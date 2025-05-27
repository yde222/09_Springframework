package com.ohgiraffers.section01.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.ohgiraffers.section01.aop");

        String[] definitionNames = context.getBeanDefinitionNames();
        for (String definitionName : definitionNames) {
            System.out.println("definitionName = " + definitionName);
        }

        MemberService memberService = context.getBean("memberService", MemberService.class);
        System.out.println("============== selectMembers ==============");
        System.out.println(memberService.selectMembers());

        System.out.println("============== selectMember ==============");
        System.out.println(memberService.selectMember(1L));


        MemberTwoService memberTwoService = context.getBean("memberTwoService", MemberTwoService.class);
        System.out.println("============== selectMembers ==============");
        System.out.println(memberTwoService.selectMembers());

        System.out.println("============== selectMember ==============");
        System.out.println(memberTwoService.selectMember(1L));
    }
}
