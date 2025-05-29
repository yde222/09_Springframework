package com.ohgiraffers.section02.provider;

import com.ohgiraffers.common.MenuDTO;
import com.ohgiraffers.common.SearchCriteria;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface SqlBuilderMapper {

    @InsertProvider(type = SqlBuilderProvider.class, method = "insertMenu")
    int insertMenu(MenuDTO menuDTO);
}
