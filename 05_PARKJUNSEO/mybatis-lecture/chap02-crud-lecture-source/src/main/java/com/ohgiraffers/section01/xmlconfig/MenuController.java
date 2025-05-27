package com.ohgiraffers.section01.xmlconfig;

import java.util.List;
import java.util.Map;

public class MenuController {

    private final MenuService ms;
    private final PrintResult printResult;

    public MenuController() {
        this.ms = new MenuService();
        this.printResult = new PrintResult();
    }

    public void selectAllMenu() {
        List<MenuDTO> menuList = ms.selectAllMenu();

        if(menuList != null && !menuList.isEmpty()) {
            printResult.printMenuList(menuList);
        } else {
            printResult.printErrorMessage("selectAllMenu");
        }
    }

    public void selectMenuByMenuCode(Map<String, String> parameter) {
        int menuCode = Integer.parseInt(parameter.get("menuCode"));
        MenuDTO menu = ms.selectMenuByCode(menuCode);

        if(menu != null) {
            printResult.printMenu(menu);
        } else {
            printResult.printErrorMessage("selectAllMenu");
        }
    }
}
