package com.ohgiraffers.problem;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.sql.*;

class ProblemsOfUsingDirectSQLTests {

    private Connection con; // 연결 객체

    @BeforeEach
    void setConnection() throws ClassNotFoundException, SQLException {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/menudb";
        String user = "ohgiraffers";
        String password = "ohgiraffers";

        Class.forName(driver);

        con = DriverManager.getConnection(url, user, password);
        con.setAutoCommit(false); // 수동 커밋 등록
    }

    @AfterEach
    void closeConnection() throws SQLException {
        con.rollback();
        con.close();
    }

    /*
    * [ JDBC API 를 이용해 직접 SQL 을 다룰 때 발생할 수 있는 문제점 ]
    * 1. 데이터 변환, SQL 작성, JDBC API 코드 등을 중복 작성(= 개발 시간 증가, 유지보수성 악화)
    * 2. SQL 의존적인 개발
    * 3. 패러다임 불일치 문제 (상속, 연관관계, 객체 그래프 탐색)
    * 4. 동일성 보장 문제
    * */
}