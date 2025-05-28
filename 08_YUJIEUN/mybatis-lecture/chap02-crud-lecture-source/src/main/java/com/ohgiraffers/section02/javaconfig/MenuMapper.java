package com.ohgiraffers.section02.javaconfig;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public interface MenuMapper {
    @Results(id= "menuResultMap", value = {
            @Result(id = true,property ="menuCode",column ="menu_code"),
            @Result(property ="menuName",column ="menu_name"),
            @Result(property ="menuPrice",column ="menu_price"),
            @Result(property ="categoryCode",column ="category_code"),
            @Result(property ="orderableStatus",column ="orderable_status")
    })

    @Select("        SELECT\n" +
            "               menu_code\n" +
            "             , menu_name\n" +
            "             , menu_price\n" +
            "             , category_code\n" +
            "             , orderable_status\n" +
            "          FROM tbl_menu\n" +
            "         WHERE orderable_status = 'Y'\n" +
            "         ORDER BY menu_code")

    List<MenuDTO> selectAllMenu(SqlSession sqlSession);


    @Select("       SELECT\n" +
            "               menu_code\n" +
            "             , menu_name\n" +
            "             , menu_price\n" +
            "             , category_code\n" +
            "             , orderable_status\n" +
            "          FROM tbl_menu\n" +
            "         WHERE orderable_status = 'Y'\n" +
            "         ORDER BY menu_code")
    MenuDTO selectMenuByCode(SqlSession sqlSession, int menuCode);

    int insertMenu(SqlSession sqlSession, MenuDTO menu);

    int updateMenu(SqlSession sqlSession, MenuDTO menu);

    int deleteMenu(SqlSession sqlSession, int menuCode);
}
