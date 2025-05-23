package com.ohgiraffers.common;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Bread extends Product {
    private java.util.Date bakedDate;       // 생산시간

    @Override
    public String toString() {
        return super.toString() + " " + this.bakedDate;
    }
}
