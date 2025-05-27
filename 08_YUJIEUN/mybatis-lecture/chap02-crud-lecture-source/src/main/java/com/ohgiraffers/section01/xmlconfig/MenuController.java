package com.ohgiraffers.section01.xmlconfig;

import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

public class MenuController {

    private final MenuService menuService;
    private final PrintResult printResult;

    public MenuController() {
        this.menuService = new MenuService();
        this.printResult = new PrintResult();
    }

    public void selectAllMenu(){
        List<MenuDTO> menuList = menuService.selectAllMenu();

        if(menuList != null ){
            printResult.printMenuList(menuList);
        } else {
            printResult.printErrorMessage("selectList");
        }
    }


}
