package com.ohgiraffers.jpql.section07.subquery;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SubQueryRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Menu> selectWithSubQuery(String categoryName){

        return null;
    }
}
