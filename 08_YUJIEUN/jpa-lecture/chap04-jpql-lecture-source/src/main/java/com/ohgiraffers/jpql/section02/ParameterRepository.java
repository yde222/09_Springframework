package com.ohgiraffers.jpql.section02;

import com.ohgiraffers.jpql.section01.simple.Menu;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

@Repository
public class ParameterRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public TypedQuery<Menu> selectMenuByBindingName(String menuName) {
        String jpql = "select m from Section02Menu m WHERE m.menuName = :menuName";
        return entityManager.createQuery(jpql, Menu.class);

    }


}
