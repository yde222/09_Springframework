package com.ohgiraffers.handlermethod;

import lombok.Getter;
import lombok.Setter;

/* 커맨드 객체 */
@Getter
@Setter
public class MenuDTO {
    private String name;
    private int price;
    private int categoryCode;
}
