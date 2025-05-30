package com.ohgiraffers.section02.crud;

import com.ohgiraffers.section01.entitymanager.EntityManagerGenerator;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class EntityManagerCRUD {
    private EntityManager entityManager;

    /* 1. 특정 메뉴 코드로 메뉴를 조회하는 기능 */
    public Menu findMenuByMenuCode(int menuCode) {
        entityManager = EntityManagerGenerator.getInstance();
        return entityManager.find(Menu.class, menuCode);
    }

    /* 2. 새로운 메뉴를 추가하는 기능 */
    public Long saveAndReturnAllCount(Menu newMenu) {
        entityManager = EntityManagerGenerator.getInstance();

        /* DML(INSERT, UPDATE, DELETE) -> 트랜잭션 필요 */
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        entityManager.persist(newMenu);

        transaction.commit();
        return getCount(entityManager);

    }

    private Long getCount(EntityManager entityManager) {
        // JPQL
        return entityManager.createQuery("SELECT COUNT(*) FROM Section02Menu", Long.class)
                .getSingleResult();
    }
    /* 3. 메뉴 이름 수정 기능 */
    public Menu modifyMenuName(int menuCode, String newMenuName) {
        entityManager = EntityManagerGenerator.getInstance();
        Menu foundMenu = entityManager.find(Menu.class, menuCode);

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        foundMenu.setMenuName(newMenuName);
        transaction.commit();
        return foundMenu;
    }

    /* 4. 특정 메뉴 코드로 메뉴 삭제 */
    public Long removeAndReturnAllCount(int menuCode) {
        entityManager = EntityManagerGenerator.getInstance();
        Menu foundMenu = entityManager.find(Menu.class, menuCode);

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        entityManager.remove(foundMenu);
        transaction.commit();
        return getCount(entityManager);
    }
}
