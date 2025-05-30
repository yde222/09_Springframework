package com.ohgiraffers.section02.provider;

import com.ohgiraffers.common.MenuDTO;
import org.apache.ibatis.jdbc.SQL;

public class SqlBuilderProvider {

    public String insertMenu(MenuDTO menuDTO) {

        return new SQL()
                .INSERT_INTO("tbl_menu")
                .VALUES("menu_name", "#{ menuName }")
                .VALUES("menu_price", "#{ menuPrice }")
                .VALUES("category_code", "#{ categoryCode }")
                .VALUES("orderable_status", "#{ orderableStatus }")
                .toString();
    }

    public String updateMenu(MenuDTO menuDTO) {

        SQL sql = new SQL();

        sql.UPDATE("tbl_menu");     // update 대상 테이블

        if (menuDTO.getMenuName() != null && !"".equals(menuDTO.getMenuName())) {
            sql.SET("MENU_NAME = #{ menuName }");  // set 구문 작성
        }

        if (menuDTO.getMenuPrice() > 0) {
            sql.SET("MENU_PRICE = #{ menuPrice }");
        }

        if (menuDTO.getCategoryCode() > 0) {
            sql.SET("CATEGORY_CODE = #{ categoryCode }");
        }

        if (menuDTO.getOrderableStatus() != null && !"".equals(menuDTO.getOrderableStatus())) {
            sql.SET("ORDERABLE_STATUS = #{ orderableStatus }");
        }

        sql.WHERE("MENU_CODE = #{ menuCode }");  // 조건절 작성

        return sql.toString();

    }

    public String deleteMenu() {
        SQL sql = new SQL();
        sql.DELETE_FROM("tbl_menu")
                .WHERE("menu_code = #{ menuCode }");

        return sql.toString();
    }
}
