package com.ohgiraffers.interceptor;

import org.springframework.stereotype.Service;

@Service
public class MenuService {

    public void method() {
        System.out.println("MenuService 클래스의 메소드 호출했다고 치자");
    }
}
