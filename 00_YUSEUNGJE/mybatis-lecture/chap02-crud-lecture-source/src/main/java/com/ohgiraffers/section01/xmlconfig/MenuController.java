package com.ohgiraffers.section01.xmlconfig;

import java.util.List;

public class MenuController {

    private final MenuService menuService;
    private final PrintResult printResult;

    public MenuController() {
        this.menuService = new MenuService();
        this.printResult = new PrintResult();
    }

    public void selectAllMenu(){
        List<MenuDTO> menuList = menuService.selectAllMenu();

        if(menuList != null && !menuList.isEmpty()){
            printResult.printMenuList(menuList);
        } else {
            printResult.printErrorMessage("selectList");
        }
    }
}
