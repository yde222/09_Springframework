package com.ohgiraffers.jpql.section03.projection;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProjectionRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Menu>  selectByBinding(String MenuName){
        String jpql = "select m.menuName from Section03Menu as m WHERE m.menuName";
        return
    }
}
