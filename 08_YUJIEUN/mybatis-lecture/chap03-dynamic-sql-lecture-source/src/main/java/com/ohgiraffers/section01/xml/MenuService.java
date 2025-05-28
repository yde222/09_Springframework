package com.ohgiraffers.section01.xml;

public class MenuService {
    public void selectMenuByPrice(int price){
        SqlSession sqlSession = getSqlSession();
        DynamicSqlMapper mapper = sqlSession.getMapper(DynamicSqlMapper.class);

    }
}
