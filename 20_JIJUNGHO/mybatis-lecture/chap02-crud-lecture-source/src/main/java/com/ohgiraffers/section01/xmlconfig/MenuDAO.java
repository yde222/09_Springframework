package com.ohgiraffers.section01.xmlconfig;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class MenuDAO {
    public List<MenuDTO> selectAllMenu(SqlSession sqlSession) {
        // statement에 들어갈 값 : namespace.id
        return sqlSession.selectList("MenuMapper.selectAllMenu");
    }

    public MenuDTO selectMenuByMenuCode(SqlSession sqlSession, int menuCode) {

        /* 메소드의 두번째 인수로 SQL 구문 수행 시 필요한 객체를 전달 */
        /* 두번째 인수로 값은 1개만 올 수 있음, 여러개의 값을 넘기고 싶으면 객체로 보내서 참조해야한다. */
        /* 복수의 객체에서 값을 가져올때는 Map<String, Object>를 활용한다.  */
        return sqlSession.selectOne("MenuMapper.selectMenuByMenuCode", menuCode);
    }
}
