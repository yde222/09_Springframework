package com.ohgiraffers.thymeleaf;

import lombok.*;

// 검색 페이징 처리용 객체
@AllArgsConstructor
@Getter
@Setter
@ToString
public class SelectCriteria {

    private int startPage;
    private int endPage;
    private int pageNo;
}
