package com.ohgiraffers.nativequery.section01.simple;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class NativeQueryRepositoryTest {

    @Autowired
    private NativeQueryRepository nativeQueryRepository;

    @DisplayName("결과 타입을 정의한 NativeQuery 테스트")
    @Test
    void testNativaQueryByResultType() {
        int menuCode = 15;
        Menu foundMenu = nativeQueryRepository.nativeQueryByResultType(menuCode);
        assertNotNull(foundMenu);
        System.out.println("foundMenu = " + foundMenu);
    }

    @DisplayName("결과 타입을 정의하지 않은 Native Query 테스트")
    @Test
    void testNativeQueryByNoResultType() {
        List<Object[]> menuList = nativeQueryRepository.nativeQueryByNoResultType();
        assertNotNull(menuList);
        menuList.forEach(
                row -> {
                    for (Object column : row) System.out.print(column + " ");
                    System.out.println();
                }
        );
    }

    @DisplayName("자동결과 매핑을 사용한 Native Query 테스트")
    @Test
    void testNativeQueryByAutoMapping() {
        List<Object[]> categoryList = nativeQueryRepository.nativeQueryByAutoMapping();
        assertNotNull(categoryList);
        categoryList.forEach(row -> {
            for (Object column : row) System.out.print(column + " ");
            System.out.println();
        });
    }

    @DisplayName("수동결과 매핑을 사용한 Native Query 테스트")
    @Test
    void testNativeQueryByManualMapping() {
        List<Object[]> categoryList = nativeQueryRepository.nativeQueryByMenualMapping();
        assertNotNull(categoryList);
        categoryList.forEach(row -> {
            for (Object column : row) System.out.print(column + " ");
            System.out.println();
        });
    }
}