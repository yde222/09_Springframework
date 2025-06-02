package com.ohgiraffers.associationmapping.section02.ontomany;

import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class MenuDTO {

    private int menuCode;
    private String menuName;
    private int menuPrice;
    private int category;
    private String orderableStatus;

}
