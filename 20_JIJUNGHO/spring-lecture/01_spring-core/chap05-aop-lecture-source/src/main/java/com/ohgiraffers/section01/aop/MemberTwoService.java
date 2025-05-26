package com.ohgiraffers.section01.aop;


import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class MemberTwoService {

    private final MemberDAO memberDAO;

    public MemberTwoService(final MemberDAO memberDAO) {
        this.memberDAO = memberDAO;
    }
    
    public Map<Long, MemberDTO> selectMembers () {
        System.out.println("selectMembers 메소드 실행 22222222");
        return memberDAO.selectMembers();
    }

    public MemberDTO selectMember(Long id) {
        System.out.println("selectMember 메소드 실행 22222222");
        return memberDAO.selectMember(id);
    }
    
}
