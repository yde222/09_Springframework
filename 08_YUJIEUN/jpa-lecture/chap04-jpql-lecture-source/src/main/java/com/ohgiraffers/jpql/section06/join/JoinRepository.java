package com.ohgiraffers.jpql.section06.join;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JoinRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Menu> selectByInnerJoin(){
        String jpql = "SELECT m FROM Section06Menu m JOIN m.category c";
        return entityManager.createQuery(jpql, Menu.class).getResultList();
    }


    public List<Menu> selectByFetchJoin() {
        String jpql = "SELECT m FROM Section06Menu m JOIN FETCH m.category c";

        return entityManager.createQuery(jpql, Menu.class).getResultList();
    }

    public List<Object[]> selectByOuterJoin() {
        String jpql = "SELECT m.menuName, c.categoryName" +
                " FROM Section06Menu m" +
                " RIGHT JOIN m.category c" +
                " ORDER BY m.category.categoryCode";

        return (List<Object[]>) entityManager.createQuery(jpql).getResultList();
    }

    public List<Object[]> selectByCollectionJoin() {
        String jpql = "SELECT m.menuName, c.categoryName" +
                " FROM Section06Category c" +
                " LEFT JOIN c.menuList m";

        return (List<Object[]>) entityManager.createQuery(jpql).getResultList();
    }

    public List<Object[]> selectByThetaJoin() {
        String jpql = "SELECT c.categoryName, m.menuName FROM Section06Category c, Section06Menu m";

        return (List<Object[]>) entityManager.createQuery(jpql).getResultList();
    }
}
