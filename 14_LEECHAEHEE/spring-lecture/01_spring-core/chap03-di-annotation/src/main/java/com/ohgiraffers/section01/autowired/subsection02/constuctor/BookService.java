package com.ohgiraffers.section01.autowired.subsection02.constuctor;

import com.ohgiraffers.section01.autowired.common.BookDAO;
import com.ohgiraffers.section01.autowired.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookServiceConstructor")
public class BookService {

    private final BookDAO bookDAO;
    /*
    * Spring 4.3버전 이후부터 생성자가 하나만 존재할 경우 @Autowired를 생략해도
    * 자동으로 생성자 주입이 동작한다. 단, 생성자가 1개 이상이라면 명시적으로 작성해야 한다.
    * */
    @Autowired  // 생성자 주입
    public BookService(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    public List<BookDTO> selectAllBooks() {
        return bookDAO.selectBookList();
    }

    public BookDTO selectBookBySequence(int sequance) {
        return bookDAO.selectoneBook(sequance);
    }


}
