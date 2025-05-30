package com.ohgiraffers.section01.autowired.subsection02.constructor;

import com.ohgiraffers.section01.autowired.common.BookDAO;
import com.ohgiraffers.section01.autowired.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookServiceConstructor")
public class BookService {

    // 생성자 주입
    private final BookDAO bookDAO;

    /* Spring 4.3 버전 이후부터 생성자가 1개뿐이라면 어노테이션을 생략해도
    * 자동으로 생성자 주입이 동작한다. 단, 생성자가 2개 이상이라면 반드시 표기해야 한다.
    *  */
    @Autowired  // 생성자 주입 // @Autowired가 없어도 정상 작동 (이 클래스에 생성자가 한 개밖에 없기 때문임 => 여러 개일 떄는 반드시 붙여줘야 함)
    public BookService(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    public List<BookDTO> selectAllBooks() {
        return bookDAO.selectBookList();
    }

    public BookDTO selectOneBooksBySequence(int sequence) {
        return bookDAO.selectOneBook(sequence);
    }
}
