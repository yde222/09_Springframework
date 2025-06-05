package com.ohgiraffers.datajpa.menu.mapper;

import com.ohgiraffers.datajpa.menu.dto.MenuDTO;
import com.ohgiraffers.datajpa.menu.entity.Menu;

public class MenuMapperManual {

    // entity -> dto 직접 매핑
    public static MenuDTO toDTO(Menu menu) {
        MenuDTO dto = new MenuDTO();
        dto.setMenuCode(menu.getMenuCode());
        dto.setMenuName(menu.getMenuName());
        dto.setMenuPrice(menu.getMenuPrice());
        dto.setCategoryCode(menu.getCategoryCode());
        dto.setOrderableStatus(menu.getOrderableStatus());
        return dto;
    }
}
