package com.ohgiraffers.section02.provider;

import com.ohgiraffers.common.MenuDTO;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface SqlBuilderMapper {

    @SelectProvider(type=SelectBuilderProvider.class, method = "selectAllMenu")
    List<MenuDTO> selectAllMenu();
}
