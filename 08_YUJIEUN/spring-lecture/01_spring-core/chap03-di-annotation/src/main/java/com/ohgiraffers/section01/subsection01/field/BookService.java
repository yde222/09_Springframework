package com.ohgiraffers.section01.subsection01.field;

import com.ohgiraffers.section01.autowired.common.BookDAO;
import com.ohgiraffers.section01.autowired.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;
import java.util.List;

@Service("bookServiceField")
public class BookService {

    //BookDAO **타입** 의 bean객체를 이 프로퍼티에 자동으로 추가한다.
    @Autowired // 필드 주입
    private /*final*/ BookDAO bookDAO;

    //private BookDAO bookDAO = new BookDAOImpl();
    public List<BookDTO> selectAllBooks(){
        return bookDAO.selectBookList();
    }

    public BookDTO selectBookBySequence(int sequence){
        return bookDAO.selectOneBook(sequence);
    }


}
