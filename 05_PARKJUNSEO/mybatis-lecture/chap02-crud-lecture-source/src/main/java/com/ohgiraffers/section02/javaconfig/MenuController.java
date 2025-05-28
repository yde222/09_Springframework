package com.ohgiraffers.section02.javaconfig;

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

    public void registMenu(Map<String, String> parameter) {

        MenuDTO menu = new MenuDTO();
        menu.setMenuName(parameter.get("menuName"));
        menu.setMenuPrice(Integer.parseInt(parameter.get("menuPrice")));
        menu.setCategoryCode(Integer.parseInt(parameter.get("categoryCode")));

        if (ms.registMenu(menu)) {
            printResult.printSuccessMessage("insert success");
        } else {
            printResult.printErrorMessage("insert failed");
        }
    }

    public void modifyMenu(Map<String, String> parameter) {
        MenuDTO menu = new MenuDTO();
        menu.setMenuName(parameter.get("menuName"));
        menu.setMenuPrice(Integer.parseInt(parameter.get("menuPrice")));
        menu.setMenuCode(Integer.parseInt(parameter.get("menuCode")));
        menu.setCategoryCode(Integer.parseInt(parameter.get("categoryCode")));

        if(ms.modifyMenu(menu)) {
            printResult.printSuccessMessage("update success");
        } else {
            printResult.printSuccessMessage("update failed");
        }


    }

    public void deleteMenu(Map<String, String> parameter) {

        int menuCode = Integer.parseInt(parameter.get("menuCode"));

        if(ms.deleteMenu(menuCode)) {
            printResult.printSuccessMessage("delete success");
        } else {
            printResult.printSuccessMessage("delete failed");
        }

    }
}
