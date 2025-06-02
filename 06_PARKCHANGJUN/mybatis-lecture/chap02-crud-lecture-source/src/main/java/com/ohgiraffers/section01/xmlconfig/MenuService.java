package com.ohgiraffers.section01.xmlconfig;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.section01.xmlconfig.Template.getSqlSession;

public class MenuService {

    private final MenuDAO menuDAO;

    public MenuService() {
        this.menuDAO = new MenuDAO();
    }

    public List<MenuDTO> selectAllMenu() {
        SqlSession sqlSession = getSqlSession();

        List<MenuDTO> menuList = menuDAO.selctAllMenu(sqlSession);

        sqlSession.close();

        return menuList;
    }

    public MenuDTO selectMenuByMenuCode(int menuCode) {

        SqlSession sqlSession = getSqlSession();

        MenuDTO menu = menuDAO.selectMenuByMenuCode(sqlSession, menuCode);

        sqlSession.close();

        return menu;
    }

    public boolean registMenu(MenuDTO menu) {

        SqlSession sqlSession = getSqlSession();

        int result = menuDAO.insertMenu(sqlSession, menu);

        /*
         * Database에 DML (insert, update, delete) 작업을 수행하면 뭐하지 ???
         * 트랜잭션처리를 진행해야한다. (왜나면 처음에 설정을 할 때 커밋은 수동커밋으로 내가 원하는 때 완료하기로해서
         */
        // 0보다 크다는 것은 한 행이라도 성공했다는 뜻이다.
        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();

        return result > 0;
    }

    public boolean modifyMenu(MenuDTO menu) {
        SqlSession sqlSession = getSqlSession();

        int result = menuDAO.updateMenu(sqlSession, menu);

        /*
         * Database에 DML (insert, update, delete) 작업을 수행하면 뭐하지 ???
         * 트랜잭션처리를 진행해야한다. (왜나면 처음에 설정을 할 때 커밋은 수동커밋으로 내가 원하는 때 완료하기로해서
         */
        // 0보다 크다는 것은 한 행이라도 성공했다는 뜻이다.
        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();

        return result > 0;
    }

    public boolean deleteMenu(int menuCode) {
        SqlSession sqlSession = getSqlSession();

        int result = menuDAO.deleteMenu(sqlSession, menuCode);

        /*
         * Database에 DML (insert, update, delete) 작업을 수행하면 뭐하지 ???
         * 트랜잭션처리를 진행해야한다. (왜나면 처음에 설정을 할 때 커밋은 수동커밋으로 내가 원하는 때 완료하기로해서
         */
        // 0보다 크다는 것은 한 행이라도 성공했다는 뜻이다.
        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();

        return result > 0;
    }
}
