package com.ohgiraffers.section01.xmlconfig;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class MenuDAO {

    public List<MenuDTO> selctAllMenu(SqlSession sqlSession) {
        // statement에 들어갈 값 : namespace.id
        return sqlSession.selectList("MenuMapper.selctAllMenu");
    }

    public MenuDTO selectMenuByMenuCode(SqlSession sqlSession, int menuCode) {

        /* 메소드의 두번째 인수로 SQL구문 수행 시 필요한 객체를 전달*/
        return sqlSession.selectOne("MenuMapper.selectMenuByMenuCode", menuCode);
    }
}
