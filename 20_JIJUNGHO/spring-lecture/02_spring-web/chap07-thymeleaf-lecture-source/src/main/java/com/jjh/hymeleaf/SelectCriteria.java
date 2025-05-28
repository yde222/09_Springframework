package com.jjh.hymeleaf;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// 검색 페이징 처리용 객체
@Getter
@Setter
@ToString
public class SelectCriteria {
    private int startPage;
    private int endPage;
    private int pageNo;

    public SelectCriteria(int startPage, int endPage, int pageNo) {
        this.startPage = startPage;
        this.endPage = endPage;
        this.pageNo = pageNo;
    }
}
