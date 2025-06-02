package com.ohgiraffers.jpql.section01.simple;

import javax.management.Query;

@Repository
public class SimpleJPQLRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public String selectSingleMenuByTypedQuery() {
        String jqpl = "SELECT m.menuName FROM Section01Menu as m WHERE m.menuCode =8";
        TypedQuery<String> query = query.
    }


}
