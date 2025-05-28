package com.ohgiraffers.section2.xmlconfig;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Application {

    public static void main(String[] args) {

        String resource = "mybatis-config.xml";

        try {
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqldSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqldSessionFactory.openSession(false);

            // selectone : 조회 결과가 1행 인 경우 사용하는 메소드
            java.util.Date now = sqlSession.selectOne("mapper.selectDate");
            System.out.println("now = " + now);

            sqlSession.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
