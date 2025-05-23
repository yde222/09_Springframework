package com.ohgiraffers.common;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Beverage extends Product {

    private int capacity;       // 용량

    @Override
    public String toString() {
        return super.toString() + "  " +  capacity;
    }
}
