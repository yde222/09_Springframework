package com.ohgiraffers.common;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public abstract class Product {
    private String name;    // 상품영
    private int price;     // 상품가격

    @Override
    public String toString() {
        return name + " " + price;
    }
}
