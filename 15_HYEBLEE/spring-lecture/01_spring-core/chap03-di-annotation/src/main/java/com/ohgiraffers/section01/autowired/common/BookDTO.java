package com.ohgiraffers.section01.autowired.common;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class BookDTO {

  private int sequence;
  private int isbn;
  private String title;
  private String author;
  private String publisher;
  private Date creationDate;
}
