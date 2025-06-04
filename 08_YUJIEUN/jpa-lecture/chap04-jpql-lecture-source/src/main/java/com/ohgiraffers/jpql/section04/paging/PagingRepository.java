package com.ohgiraffers.jpql.section04.paging;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PagingRepository {

    @PersistenceContext
    private EntityManager entityManager;

    /***
     *
     * @param offset : 조회를 시작할 위치 (0부터) -< offset이 10 이면 0~9넣고 10 부터 조회
     * @param limit :조회할  데이터의 갯수
     * @return
     */
    public List<Menu> usingPagingAPI(int offset, int limit){
        String jpql = "SELECT m FROM Section04Menu m ORDER BY m.menuCode DESC";

        return entityManager.createQuery(jpql, Menu.class)
                .setFirstResult(offset)
                .setMaxResults(limit)
                .getResultList();


    }
}
