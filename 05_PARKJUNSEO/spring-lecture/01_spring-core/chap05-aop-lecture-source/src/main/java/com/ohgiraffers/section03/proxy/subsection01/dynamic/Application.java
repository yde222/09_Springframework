package com.ohgiraffers.section03.proxy.subsection01.dynamic;

import com.ohgiraffers.section03.proxy.common.OhgiraffersStudent;
import com.ohgiraffers.section03.proxy.common.Student;

import java.lang.reflect.Proxy;

public class Application {
    public static void main(String[] args) {

        /*
        * 1. JDK Dynamic Proxy 방식
        * Target Object의 타입이 반드시 interface여야 햔다.
        * */

        Student student = new OhgiraffersStudent(); // 여기서 Student는 인터페이스 타입
        Handler handler = new Handler(student);

        Student proxy = (Student) Proxy.newProxyInstance(
                handler.getClass().getClassLoader(),
                new Class[]{Student.class},
                handler);
        proxy.study(16);
    }
}
