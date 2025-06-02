package com.ohgiraffers.mapping.section01.entity;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MemberRegistService {

    private MemberRepository memberRepository;

    public MemberRegistService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    // registMember메소드는 사용자 정보를 데이터베이스에 추가(insert)
    // insert, update, delete 작업이면 트랜잭션 처리
    @Transactional
    public void registMember(MemberRegistDTO newMember){
        // dto -> entity
        Member member = new Member(
                newMember.getMemberId(),
                newMember.getMemberPwd(),
                newMember.getMemberName(),
                newMember.getPhone(),
                newMember.getAddress(),
                newMember.getEnrollDate(),
                newMember.getMemberRole(),
                newMember.getStatus()
        );

        memberRepository.save(member);
    }
}
