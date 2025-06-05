package com.ohgiraffers.jpql.section08.namedquery;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class NamedQueryRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Menu> selectByDynamicQuery(String searchName, int searchCode) {
        StringBuilder jpql = new StringBuilder("SELECT m FROM Section08Menu m ");

        if (searchName != null && !searchName.isEmpty() && searchCode > 0) {
            jpql.append("WHERE ");
            jpql.append("m.menuName LIKE '%' || :menuName || '%'");
            jpql.append("AND ");
            jpql.append("m.categoryCode = :categoryCode");
        } else {
            if (searchName != null && !searchName.isEmpty()) {
                jpql.append("WHERE ");
                jpql.append("m.menuName LIKE '%' || :menuName || '%'");
            } else if (searchCode > 0) {
                jpql.append("WHERE ");
                jpql.append("m.categoryCode = :categoryCode");
            }
        }

        TypedQuery<Menu> query = entityManager.createQuery(jpql.toString(), Menu.class);

        /* 파라미터를 추가하는 코드 */
        if (searchName != null && !searchName.isEmpty() && searchCode > 0) {
            query.setParameter("menuName", searchName);
            query.setParameter("categoryCode", searchCode);
        } else {
            if (searchName != null && !searchName.isEmpty()) {
                query.setParameter("menuName", searchName);
            } else if (searchCode > 0) {
                query.setParameter("categoryCode", searchCode);
            }
        }

        List<Menu> menuList = query.getResultList();
        return menuList;
    }


    public List<Menu> selectByNamedQuery() {
        List<Menu> menuList = entityManager.createNamedQuery("Section08Menu.selectMenuList", Menu.class)
                .getResultList();

        return menuList;
    }

    public Menu selectByNamedQueryWidthXml(int menuCode) {
        Menu foundMenu = entityManager.createNamedQuery("Section08Menu.selectMenuByCode", Menu.class)
                .setParameter("menuCode", menuCode)
                .getSingleResult();

        return foundMenu;
    }
}
