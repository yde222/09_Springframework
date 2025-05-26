package com.ohgiraffers.section03.proxy.subsection02.cglib;

import com.ohgiraffers.section03.proxy.common.OhgiraffersStudent;
import org.springframework.cglib.proxy.Enhancer;

import java.lang.reflect.Proxy;

public class Application {
    public static void main(String[] args) {
        /*
        * 2. CGLib방식
        * Target Object의 타입이 Class여도 가능하다.
        * */

        OhgiraffersStudent OhgiraffersStudent = new OhgiraffersStudent();
        Handler handler = new Handler(OhgiraffersStudent);

        OhgiraffersStudent proxy = (OhgiraffersStudent) Enhancer.create(OhgiraffersStudent.class, handler);

        proxy.study(16);
    }
}
