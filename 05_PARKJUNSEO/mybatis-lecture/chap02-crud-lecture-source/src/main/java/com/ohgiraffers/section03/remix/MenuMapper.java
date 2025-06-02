package com.ohgiraffers.section03.remix;

import com.ohgiraffers.section03.remix.MenuDTO;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public interface MenuMapper {

    List<MenuDTO> selectAllMenu(SqlSession sqlSession);

    MenuDTO selectMenuByCode(int menuCode);

    int insertMenu(MenuDTO menu);

    int updateMenu(MenuDTO menu);

    int deleteMenu(int menuCode);

}
