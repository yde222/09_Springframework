package com.ohgiraffers.section01.autowired.subsection01.field;

import com.ohgiraffers.section01.autowired.common.BookDAO;
import com.ohgiraffers.section01.autowired.common.BookDTO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("bookServiceField") // bookService(첫글자는 소문자. 다음은 그대로)
public class BookService {

  // BookDAO **타입**의 bean객체를 이 프로퍼티에 자동으로 추가한다.
  @Autowired // 1. 필드 주입 (final 안됨)
  private BookDAO bookDAO; // bookDAO는 인터페이스이다. 구현은 아직 안되어있음.
  // = private BookDAO bookDAO = new BookDAOImpl();

  public List<BookDTO> selectAllBooks() {
    return bookDAO.selectBookList();
  }

  public BookDTO selectBookBySequence(int sequence) {
    return bookDAO.selectOneBook(sequence);
  }


}
