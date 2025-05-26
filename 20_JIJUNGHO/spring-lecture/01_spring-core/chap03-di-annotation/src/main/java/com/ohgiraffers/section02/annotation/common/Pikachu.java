package com.ohgiraffers.section02.annotation.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/*
* @AutoWired로 동일 타입의 빈이 여러개 찾아진 경우
* 우선시 할 타입을 설정
* */

@Component
@Primary
public class Pikachu implements Pokemon {
    @Override
    public void attack() {
        System.out.println("피카츄 백만 볼트!⚡");
    }
}
