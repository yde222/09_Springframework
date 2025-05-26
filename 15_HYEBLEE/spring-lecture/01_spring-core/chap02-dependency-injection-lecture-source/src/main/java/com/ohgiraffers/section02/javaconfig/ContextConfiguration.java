package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.Account;
import com.ohgiraffers.common.MemberDTO;
import com.ohgiraffers.common.PersonalAccount;
import org.springframework.context.annotation.Bean;

public class ContextConfiguration {

  @Bean
  public Account accountGenerator() {
    return new PersonalAccount(20, "123-456-8890");
  }

  @Bean
  public MemberDTO memberGenerator(){
    /* 생성자 주입 */
//    return new MemberDTO(1, "홍길동", "010-1234-5678", "hong@gmail.com", accountGenerator());

    /* 2. setter 주입 */
      MemberDTO memberDTO = new MemberDTO();
      memberDTO.setPersonalAccount(accountGenerator());
      return memberDTO;
  }
}
