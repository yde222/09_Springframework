package com.ohgiraffers.section02.provider;

import com.ohgiraffers.common.MenuDTO;
import org.apache.ibatis.jdbc.SQL;

public class SqlBuilderProvider {

    public String insertMenu(MenuDTO menuDTO) {

        return new SQL()
                .INSERT_INTO("tbl_menu")
                .VALUES("menu_name", "#{menuName}")
                .VALUES("menu_price", "#{menuPrice}")
                .VALUES("category_code", "#{categoryCode}")
                .VALUES("orderable_status", "#{orderableStatus}")
                .toString();
    }
}
