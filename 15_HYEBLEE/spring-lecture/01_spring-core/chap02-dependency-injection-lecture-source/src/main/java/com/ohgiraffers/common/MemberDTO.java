package com.ohgiraffers.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MemberDTO {

  private int sequence;
  private String name;
  private String phone;
  private String email;
  private Account personalAccount;
}
