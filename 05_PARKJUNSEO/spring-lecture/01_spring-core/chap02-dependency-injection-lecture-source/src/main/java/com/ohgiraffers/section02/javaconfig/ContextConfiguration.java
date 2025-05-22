package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.Account;
import com.ohgiraffers.common.MemberDTO;
import com.ohgiraffers.common.PersonalAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

    @Bean
    public Account accountGenerator() {
        return new PersonalAccount(20, "1002-862-859853");
    }

    /* bean 등록에 사용된 메소드를 호출하여 의존성 주입을 처리할 수 있다. */

    @Bean
    public MemberDTO memberGenerator(Account account) {
        // 1. 생성자 주입
        /* return new MemberDTO(1, "홍창기", "010-0000-0000", "ck@gmail.com", accountGenerator()); */

        // 2. setter 주입
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setPersonalAccount(accountGenerator());
        return memberDTO;

    }
}
