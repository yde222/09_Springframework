package com.ohgiraffers.section01.autowired.subsection01.field;

import com.ohgiraffers.section01.autowired.common.BookDAO;
import com.ohgiraffers.section01.autowired.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookServiceField")
// Service는 bean으로 등록할 시 무조건 첫글자를 소문자로 바꾸고 뒤에 있는 글자는 그대로 유지된다.
// 괄호안에 값을 넣으면 이름 변경이 가능하다.
public class BookService {

    // BookDAO **타입**의 bean객체를 이 프로퍼티에 자동으로 추가한다.
    @Autowired // 필드 주입
    // 필드 주입에는 final을 사용하지 못한다.
    // BookDAO를 가지고 만든 객체는 BookDAOImpl 객체
    private /* final */ BookDAO bookDAO;

    // 필드 주입을 할 때에는 Autowired라는 어노테이션을 사용한다.
    // private BookDAO bookDAO = new BookDAOImpl();
    public List<BookDTO> selectAllBooks(){
        return bookDAO.selectBookList();
    }

    public BookDTO selectBookBySequence(int sequence){
        return bookDAO.selectOneBook(sequence);
    }
}
