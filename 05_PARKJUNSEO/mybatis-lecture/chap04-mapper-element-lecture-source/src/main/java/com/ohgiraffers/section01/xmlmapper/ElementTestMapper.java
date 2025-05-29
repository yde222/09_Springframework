package com.ohgiraffers.section01.xmlmapper;

import com.ohgiraffers.common.MenuDTO;

import java.util.List;

public interface ElementTestMapper {
    List<MenuDTO> selectResultMapTest();

    List<MenuAndCategoryDTO> selectResultMapAssociationTest();

    List<CategoryAndMenuDTO> selectResultMapCollectionTest();
}
