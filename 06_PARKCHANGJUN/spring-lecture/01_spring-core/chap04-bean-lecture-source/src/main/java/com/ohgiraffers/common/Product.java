package com.ohgiraffers.common;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class Product {
    private String name; // 상품명
    private int price; // 상품가격

    @Override
    public String toString() {
        return name + " " + price;
    }
}
