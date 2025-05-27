package com.ohgiraffers.section01.javaconfig;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

public class Application {

    private static String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static String URL = "jdbc:mysql://localhost:3306/menudb";
    private static String USER = "ohgiraffers";
    private static String PASSWORD = "ohgiraffers";

    public static void main(String[] args) {

        // JdbcTransactionFactory: 수동커밋, ManagedTransactionFactory: 자동커밋
        Environment environment = new Environment(
                "dev",  // 환경 정보 이름
                new JdbcTransactionFactory(),  // 트랜잭션 매니져 종류(JDBC or MANAGED)
                new PooledDataSource(
                        DRIVER, URL, USER, PASSWORD
                ) // Connection Pool 사용여부(Pooled or UnPooled)
        );

        // 생성한 환경 설정 정보로 Mybatis 설정 객체 생성
        Configuration configuration = new Configuration(environment);

        // 설정 객체에 Mapper 등록
        configuration.addMapper(Mapper.class);

        // SqlSessionFactoryBuilder : SqlSessionFactory 타입의 하위 구현체 객체를 생성하기 위한 빌더 클래스
        // SqlSessionFactory : SqlSession 객체 생성을 위한 팩토리 역할의 인터페이스

    }
}
