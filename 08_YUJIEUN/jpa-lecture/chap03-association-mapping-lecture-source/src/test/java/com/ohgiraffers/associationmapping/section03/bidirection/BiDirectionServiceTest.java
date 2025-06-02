package com.ohgiraffers.associationmapping.section03.bidirection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class BiDirectionServiceTest {

    @Autowired
    private BiDirectionService biDirectionService;

    @DisplayName("")
    @Test
    void biDirectionFindTest1() {
        int menuCode = 10;

        Menu foundMenu = biDirectionService.findMenu(menuCode);

        Assertions.assertEquals(menuCode, foundMenu.getMenuCode());
        System.out.println("foundMenu = " + foundMenu);
    }

    @DisplayName("양방향 연관관계 매핑")
    @Test
    void biDirectionFindTest2(){
        int categoryCode = 10;
        Category foundCategory = biDirectionService.findCategory(categoryCode);
        Assertions.assertEquals(categoryCode, foundCategory.getCategoryCode());
        System.out.println("foundCategory = " + foundCategory);
    }
}