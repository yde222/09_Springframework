package com.ohgiraffers.jpql.section05;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class GroupFunctionRepository {


    @PersistenceContext
    private EntityManager entityManager;

    public long countMenuOfCategory(int categoryCode){
        String jpql
                = "SELECT COUNT(m.menuPrice) FROM Section05Menu m "
                + "WHERE m.categoryCode = :categoryCode";

        return entityManager.createQuery(jpql, Long.class)
                .setParameter("categoryCode", categoryCode)
                .getSingleResult();
    }



}
