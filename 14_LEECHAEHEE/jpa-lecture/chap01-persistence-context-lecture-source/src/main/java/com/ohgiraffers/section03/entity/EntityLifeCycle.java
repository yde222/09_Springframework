package com.ohgiraffers.section03.entity;

import jakarta.persistence.EntityManager;

public class EntityLifeCycle {
    private EntityManager entityManager;

    public Menu findeMenuByMenuCode(int menuCode) {
        entityManager = EntityMangerGenerator.getInstance();
        return entityManager.find(Menu.class, menuCode);
    }

    public EntityManager getManagerInstance() {
        return entityManager;
    }
}
