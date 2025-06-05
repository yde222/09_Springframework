package com.ohgiraffers.datajpa.menu.respository;

import com.ohgiraffers.datajpa.menu.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category,Integer> {

    /* 1. JPQL
       2. Native Query를 작성하는 방법
    * */
    @Query(value = "SELECT c FROM Category  c ORDER BY c.categoryCode")
    List<Category> findAllCategory();

    /*  2. Native Query를 작성하는 방법 */

}
