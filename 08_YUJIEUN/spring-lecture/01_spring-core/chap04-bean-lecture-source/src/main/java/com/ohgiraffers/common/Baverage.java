package com.ohgiraffers.common;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
public class Baverage extends Product{

    private int capacity;

    public Baverage(String name, int price, int capacity) {
        super(name, price);
        this.capacity = capacity;
    }

    public Baverage() {
    }

    @Override
    public String toString() {
        return  super.toString()+ " " + capacity;
    }
}
