package com.jsw.springmybatis.section01.factorybean;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {

    private final SqlSessionTemplate sqlSession;

    public MenuService(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<MenuDTO> findAllMenuByOrderableStatus(String orderableStatus){

        List<MenuDTO> menus
                = sqlSession.getMapper(MenuMapper.class)
                .findAllMenuByOrderableStatus(orderableStatus);


        if(menus != null){
            menus.forEach(menu ->{
                if("Y".equals(menu.getOrderableStatus())){
                    menu.setMenuName(menu.getMenuName()+ " ( 주문가능)");
                }else {
                    menu.setMenuName(menu.getMenuName() + " ( 주문불가능)");
                }
            });
        }
        return menus;
    }


}
