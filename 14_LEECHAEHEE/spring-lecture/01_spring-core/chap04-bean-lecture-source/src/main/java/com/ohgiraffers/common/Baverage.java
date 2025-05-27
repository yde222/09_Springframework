package com.ohgiraffers.common;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Baverage extends Product {
    private int capcity; // 용량

    public Baverage() {
    }

    public Baverage(String name, int price, int capcity) {
        super(name, price);
        this.capcity = capcity;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.capcity;
    }
}
