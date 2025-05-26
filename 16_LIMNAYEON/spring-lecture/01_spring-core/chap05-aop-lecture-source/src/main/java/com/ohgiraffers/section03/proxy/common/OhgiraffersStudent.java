package com.ohgiraffers.section03.proxy.common;

public class OhgiraffersStudent implements Student{
    @Override
    public void study(int hours){
        System.out.println(hours + "동안 열심히 흘러갑니다." );
    }
}
