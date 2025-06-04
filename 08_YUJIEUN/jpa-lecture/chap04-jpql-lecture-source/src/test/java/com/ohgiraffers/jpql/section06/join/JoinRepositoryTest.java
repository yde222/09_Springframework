package com.ohgiraffers.jpql.section06.join;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class JoinRepositoryTest {

    @Autowired
    private JoinRepository joinRepository;

    @DisplayName("inner join 테스트")
    @Test
    void testSelectByInnerJoin(){
        List<Menu> menus = joinRepository.selectByInnerJoin();
        assertNotNull(menus);
    }

    @DisplayName("join fetch 테스트")
    @Test
    void testSelectByFetchJoin(){
        List<Menu> menus = joinRepository.selectByFetchJoin();
        assertNotNull(menus);
    }

    @DisplayName("outer join 테스트")
    @Test
    void testSelectByOuterJoin(){
        List<Object[]> menuList = joinRepository.selectByOuterJoint();
        assertNotNull(menuList);

        menuList.forEach(row -> {
            for(Object column : row){
                System.out.print(column + " ");
            }
            System.out.println();
        });
    }

    @DisplayName("collection join 테스트")
    @Test
    void testSelectByCollectionJoin(){
        List<Object[]> menuList = joinRepository.selectByCollectionJoin();
        assertNotNull(menuList);

        menuList.forEach(row -> {
            for(Object column : row){
                System.out.print(column + " ");
            }
            System.out.println();
        });
    }

    @DisplayName("theta join 테스트")
    @Test
    void testSelectByThetaJoin(){
        List<Object[]> menuList = joinRepository.selectByThetaJoin();
        assertNotNull(menuList);

        menuList.forEach(row -> {
            for(Object column : row){
                System.out.print(column + " ");
            }
            System.out.println();
        });
    }




}






