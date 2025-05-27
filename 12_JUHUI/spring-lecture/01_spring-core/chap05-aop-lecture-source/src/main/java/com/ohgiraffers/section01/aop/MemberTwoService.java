package com.ohgiraffers.section01.aop;

import java.util.Map;

public class MemberTwoService {
    private final MemberDAO memberDAO;

    public MemberTwoService(MemberDAO memberDAO) {
        this.memberDAO = memberDAO;
    }

    public Map<Long, MemberDTO> selectMembers() {
        System.out.println("selectMembers 메소드 실행");
        return memberDAO.selectMembers();
    }

    public MemberDTO selectMember(long id) {
        System.out.println("selectMember 메소드 실행");
        return memberDAO.selectMember(id);
    }
}
