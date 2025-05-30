package com.ohgiraffers.section01.entitymanager;

import jakarta.persistence.EntityManagerFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntityManagerFactoryGeneratorTest {

    @Test
    @DisplayName("엔터티 매니저 팩토리 생성 확인")
    void testGenerateEntityManagerFactory() {

        //when
        EntityManagerFactory factory = EntityManagerFactoryGenerator.getFactory();

        // then
        assertNotNull(factory);
    }

    @Test
    @DisplayName("엔티티 매니저 팩토리 싱글톤 인스턴스 확인")
    void testEntityFactorySinglethon() {
        // when
        EntityManagerFactory factory1 = EntityManagerFactoryGenerator.getInstance();
        EntityManagerFactory factory2 = EntityManagerFactoryGenerator.getInstance();
        // then
        assertEquals(factory1, factory2);
        assertEquals(factory1.hashCode(), factory2.hashCode());
    }

    @Test
    @DisplayName("엔티티 매니저 생성 확인")
    void testEntityManagerScope(){
        //when
        Entity
    }
}