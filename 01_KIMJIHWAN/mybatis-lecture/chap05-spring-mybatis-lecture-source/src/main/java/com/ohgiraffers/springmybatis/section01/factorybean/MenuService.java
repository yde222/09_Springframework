package com.ohgiraffers.springmybatis.section01.factorybean;

import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class MenuService {


    private final SqlSessionTemplate sqlSession;

    public MenuService(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<MenuDTO> findAllMenuByOrderStatus(String orderStatus) {
        List<MenuDTO> menus
                = sqlSession.getMapper(MenuMapper.class)
                .findAllMenuByOrderStatus(orderStatus);

        if(menus != null) {
            menus.forEach(menu -> {
                if("Y".equals(menu.getOrderableStatus())){
                    menu.setMenuName(menu.getMenuName() + " (주문 가능)");
                } else {
                    menu.setMenuName(menu.getMenuName() + " (주문 불가능)");
                }
            });
        }

        return menus;
    }

}
