package com.ohgiraffers.section03.entity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class EntityLifeCycleTest {

    private EntityLifeCycle entityLifeCycle;

    @BeforeEach
    void init() {
        entityLifeCycle = new EntityLifeCycle();
    }

    @DisplayName("비영속 테스트")
    @ParameterizedTest
    @ValueSource(ints = { 1, 2})
    void testTransient(int menuCode){

        // when
        Menu foundMenu = entityLifeCycle.findMenuByMenuCode(menuCode);

        Menu newMenu = new Menu(
                foundMenu.getMenuCode(),
                foundMenu.getMenuName(),
                foundMenu.getMenuPrice(),
                foundMenu.getCategoryCode(),
                foundMenu.getOrderableStatus()
        );

        EntityManager  entityManager = entityLifeCycle.getManagerInstance();
        // then
        assertTrue(entityManager.contains(foundMenu));  // 영속성 컨텍스트에서 관리되는 영속 상태
        assertFalse(entityManager.contains(newMenu));  // 영속성 컨텍스트에서 관리 되지않는 비영속 상태
    }

    @DisplayName("다른 엔터티 매니저가 관리하는 엔티티의 영속성 테스트")
    @ParameterizedTest
    @ValueSource(ints = {1, 2})
    void testmanagedOtherEntityManager(int menuCode){

        // when
        Menu menu1 = entityLifeCycle.findMenuByMenuCode(menuCode);
        System.out.println("menu1 = " + menu1.hashCode());
        Menu menu2 = entityLifeCycle.findMenuByMenuCode(menuCode);
        System.out.println("menu2 = " + menu2.hashCode());
        // then
        assertNotEquals(menu1, menu2);
    }

    @DisplayName("같은 엔터티 매니저가 관리하는 엔터티의 영속성 테스트")
    @ParameterizedTest
    @ValueSource(ints ={1,2})
    void testmanagedSameEntityManager(int menuCode){

        // when
        EntityManager entityManager = EntityManagerGenerator.getInstance();
        Menu menu1 = entityManager.find(Menu.class, menuCode);
        Menu menu2 = entityManager.find(Menu.class, menuCode);

        // then
        assertEquals(menu1, menu2);
    }

    @DisplayName("준영속화 detach 테스트")
    @ParameterizedTest
    @CsvSource({"11, 1000", "12, 1000"})
    void testDetachedEntity(int menuCode, int menuPrice) {
        // when
        EntityManager entityManager = EntityManagerGenerator.getInstance();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();   // 트랜잭션 시작

        Menu foundMenu = entityManager.find(Menu.class, menuCode);  // 영속성 상태
        // detach : 특정 엔터티만 준영속 상태(관리하던 객체를 관리하지 않는 상태로 변경)로 만듦
        entityManager.detach(foundMenu);
        foundMenu.setMenuPrice(menuPrice);
        // flush: 영속성 컨텍스트의 상태를 DB로 내보낸다. 단, commit 하지 않았을 경우 rollback 가능
        entityManager.flush();
        // then
        assertNotEquals(menuPrice, entityManager.find(Menu.class, menuCode).getMenuPrice());
        entityTransaction.rollback();
    }

    @DisplayName("준영속화 detach 후 다시 영속화 테스트")
    @ParameterizedTest
    @CsvSource({"11, 1000", "12, 1000"})
    void testDetachAndMerge(int menuCode, int menuPrice) {

        // when
        EntityManager entityManager = EntityManagerGenerator.getInstance();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        Menu foundMenu = entityManager.find(Menu.class, menuCode);
        entityManager.detach(foundMenu);        // 준영속화
        foundMenu.setMenuPrice(menuPrice);    // 아무런 반응이 일어나지 않는다.


        entityManager.flush();
        // then
        assertNotEquals(menuPrice, entityManager.find(Menu.class, menuCode).getMenuPrice());
        entityTransaction.rollback();
    }




}