package com.ohgiraffers.common;

import lombok.*;

import java.util.Date;

@Getter
@Setter
public class Bread extends Product {
    private java.util.Date bakedDate;

    public Bread(String name, int price, Date bakedDate) {
        super(name, price);
        this.bakedDate = bakedDate;
    }

    public Bread() {
    }
    // 생산시간

    @Override
    public String toString() {
        return super.toString() + " " + this.bakedDate;
    }
}
