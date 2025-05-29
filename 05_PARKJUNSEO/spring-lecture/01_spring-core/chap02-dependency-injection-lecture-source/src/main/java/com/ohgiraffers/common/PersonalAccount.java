package com.ohgiraffers.common;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor    // 필드가 3개지만 xml에서 두 필드에 대한 값만 주면 그만큼만 들어간 객체를 생성해줌 (요청된 만큼으로만 객체 생성)
public class PersonalAccount implements Account {
    
    private final int backCode; // 은행코드
    private final String accNo; // 계좌번호
    private int balance;    // 잔액

    @Override
    public String getBalance() {
        return this.accNo + " 계좌의 현재 잔액은 " + this.balance + "원 입니다.";
    }

    @Override
    public String deposit(int money) {
        String str = "";
        if(money >= 0) {
            this.balance += money;
            str = money + "원이 입금되었습니다.";
        } else {
            str = "금액을 잘못 입력하셨습니다.";
        }
        return str;
    }

    @Override
    public String withDraw(int money) {
        String str = "";
        if(this.balance >= money) {
            this.balance -= money;
            str = money + "원이 출금되었습니다.";
        } else {
            str = "잔액이 부족합니다. 잔액을 확인해주세요.";
        }
        return str;
    }
}
