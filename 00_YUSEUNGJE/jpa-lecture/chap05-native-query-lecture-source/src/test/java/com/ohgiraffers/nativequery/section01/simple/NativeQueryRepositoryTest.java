package com.ohgiraffers.nativequery.section01.simple;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class NativeQueryRepositoryTest {

    @Autowired
    private NativeQueryRepository nativeQueryRepository;

    @DisplayName("결과 타입을 정의한 Native Query 테스트")
    @Test
    void testNativeQueryByResultType() {

        int menuCode = 15;
        Menu foundMenu = nativeQueryRepository.nativeQueryByResultType(menuCode);
        assertNotNull(foundMenu);
        System.out.println("foundMenu = " + foundMenu);
    }
}