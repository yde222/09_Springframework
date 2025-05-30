package com.ohgiraffers.section01.autowired.subsection01.field;

import com.ohgiraffers.section01.autowired.common.BookDAO;
import com.ohgiraffers.section01.autowired.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "BookServiceField")
public class BookService {

    @Autowired //필드 주입 // BookDao *타입*의 빈 객체를 이 프로퍼티에 자동으로 추가 (근데 필드 주입은 final을 쓸 수 없음)
    private BookDAO bookDAO;

    // private BookDAO bookDao = new BookDAOImpl(); 선언한 것과 같음
    public List<BookDTO> selectAllBooks() {
        return bookDAO.selectBookList();
    }

    public BookDTO selectBookbySequence(int sequence) {
        return bookDAO.selectOneBook(sequence);
    }

}
