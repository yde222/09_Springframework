package com.ohgiraffers.jpql.section07.subquery;

import com.ohgiraffers.jpql.section06.join.Category;
import jakarta.persistence.*;

@Entity(name="Section07Menu")
@Table(name="tbl_menu")
public class Menu {

    @Id
    private int menuCode;
    private String menuName;
    private int menuPrice;


}