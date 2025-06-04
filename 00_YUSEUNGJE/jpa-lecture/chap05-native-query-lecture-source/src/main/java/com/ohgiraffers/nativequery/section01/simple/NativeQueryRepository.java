package com.ohgiraffers.nativequery.section01.simple;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;

@Repository
public class NativeQueryRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public Menu nativeQueryByResultType(int menuCode){
        /* Native Query 수행 결과를 엔터티에 매핑 시키기 위해서는
        모든 컬럼이 처리 되어야만 매핑이 가능하다.
        * */
        String query = "SELECT menu_code, menu_name, menu_price, category_code, " +
                "orderable_status FROM tbl_menu WHERE menu_code = ?";
        Query nativeQuery = entityManager.createNativeQuery(query, Menu.class)
                .setParameter(1, menuCode);
        return (Menu) nativeQuery.getSingleResult();
    }
}
