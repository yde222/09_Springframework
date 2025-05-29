package com.ohgiraffers.section02.provider;

import com.ohgiraffers.common.MenuDTO;
import org.apache.ibatis.session.SqlSession;

import static com.ohgiraffers.common.Template.getSqlSession;

public class SqlBuilderService {

    public void registMenu(MenuDTO menu) {
        SqlSession sqlSession = getSqlSession();
        SqlBuilderMapper mapper = sqlSession.getMapper(SqlBuilderMapper.class);
    }
}
