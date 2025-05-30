package com.ohgiraffers.thymeleaf;

import lombok.*;
@Getter
@Setter
@ToString
@AllArgsConstructor
// 검색 페이징 처리용 객체
class SelectCriteria {

    private int startPage;
    private int endPage;
    private int pageNo;

}