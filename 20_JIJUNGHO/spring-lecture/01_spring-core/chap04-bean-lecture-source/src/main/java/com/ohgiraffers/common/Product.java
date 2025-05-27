package com.ohgiraffers.common;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public abstract class Product {
    private String name;    // 상품명
    private int price;      // 상숨가격


    @Override
    public String toString() {
        return name + " " + price;
    }
}
