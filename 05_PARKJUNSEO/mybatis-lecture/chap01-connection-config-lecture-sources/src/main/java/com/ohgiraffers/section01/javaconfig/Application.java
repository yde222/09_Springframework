package com.ohgiraffers.section01.javaconfig;


import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

public class Application {

    private static String DRIVER = "com.mysql.jdbc.Driver";
    private static String URL = "jdbc:mysql://localhost:3306/menudb";
    private static String USER = "ohgiraffers";
    private static String PASSWORD = "ohgiraffers";

    public static void main(String[] args) {
        Environment environment = new Environment(
                "dev",   // 환경 정보 이름
                new JdbcTransactionFactory(),    // 트랜잭션 매니저 종류
                
        )
    }
}
