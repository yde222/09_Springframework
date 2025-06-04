package com.ohgiraffers.jpql.section05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class GroupFunctionRepositoryTest {

@Autowired
    private GroupFunctionRepository groupFunctionRepository;

    @DisplayName("특정 카테고리에 등록된 메뉴 수 조회")
    @Test
    public void testCountMenuOfCategory() {
        //given
        int categoryCode = 4;

        //when
        long countOfMenu = groupFunctionRepository.countMenuOfCategory(categoryCode);

        //then
        Assertions.assertTrue(countOfMenu >= 0);
        System.out.println("[ countOfMenu ] " + countOfMenu);
    }
}