package com.ohgiraffers.section03.remix;


import java.util.List;

// Mapper가 들어가면 DB에 들어갈 작업이 있다고 생각하면 된다.
public interface MenuMapper {

    List<MenuDTO> selctAllMenu();

    MenuDTO selectMenuByMenuCode(int menuCode);

    int insertMenu(MenuDTO menu);

    int updateMenu(MenuDTO menu);

    int deleteMenu(int menuCode);
}
