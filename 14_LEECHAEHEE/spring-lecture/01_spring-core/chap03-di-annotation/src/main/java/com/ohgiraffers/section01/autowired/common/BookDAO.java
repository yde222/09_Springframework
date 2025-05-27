package com.ohgiraffers.section01.autowired.common;

import java.util.List;

public interface BookDAO {
    /* 도서 목록 전체 조회 */
    List<BookDTO> selectBookList();

    // 도서 검색
    BookDTO selectoneBook(int sequance);
}
