package com.ohgiraffers.section01.autowired.common;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDAOImpl implements BookDAO {
    @Override
    public List<BookDTO> selectBookList() {
        return List.of();
    }

    @Override
    public BookDTO selectOneBook(int sequence) {
        return null;
    }
}
