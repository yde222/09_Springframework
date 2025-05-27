package com.ohgiraffers.common;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component
public class MemberDAO {

  private final Map<Integer, MemberDTO> memberMap;

  public MemberDAO() {
    memberMap = new HashMap<>();
//    new MemberDTO.MemberDTOBuilder(1, "user01", "pass01", "홍길동")
    memberMap.put(1, new MemberDTO(1, "user01", "pass01", "홍길동"));
    memberMap.put(2, new MemberDTO(2, "user02", "pass02", "유관순"));
  }

  /* 매개변수로 전달 받은 회원 번호를 map에서 조회 후 회원 정보를 리턴하는 메소드 */
  public MemberDTO selectMember(int sequence){
    return memberMap.get(sequence);
  }

  /* 매개변수로 전달받은 회원 정보를 map에 추가하고 성공 여부를 boolean으로 리턴하는 메소드 */
  public boolean insertMember(MemberDTO member){
    int before = memberMap.size();
    memberMap.put(member.getSequence(), member);
    int after = memberMap.size();
    return after > before;
  }
}
