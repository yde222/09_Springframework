package com.ohgiraffers.thymeleaf;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
// 검색 페이징 처리용 객체
@Getter
@Setter
@AllArgsConstructor
@ToString
public class SelectCriteria {
    private int startPage;
    private int endPage;
    private int pageNo;
}
