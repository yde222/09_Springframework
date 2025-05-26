package com.ohgiraffers.section01.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.ohgiraffers.section01.aop");


        MemberService memberService = (MemberService) context.getBean("memberService");
        System.out.println("======== selectMembers ========");
        System.out.println(memberService.selectMembers());
        System.out.println("======== selectMember ========");
        System.out.println(memberService.selectMember(1L));

        MemberTwoService memberService2 = (MemberTwoService) context.getBean("memberTwoService");
        System.out.println("======== selectMembers ========");
        System.out.println(memberService2.selectMembers());
        System.out.println("======== selectMember ========");
        System.out.println(memberService2.selectMember(1L));
    }
    }
