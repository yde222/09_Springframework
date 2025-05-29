package com.ohgiraffers.section02.provider;

import com.ohgiraffers.common.MenuDTO;
import com.ohgiraffers.common.SearchCriteria;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;

import java.util.List;

public interface SqlBuilderMapper {

    @InsertProvider(type = SqlBuilderProvider.class, method = "insertMenu")
    int insertMenu(MenuDTO menuDTO);
    
    
    /*
    * 전달 파라미터가 유효한 값 (문자열의 경우 빈 문자열이 아니어야하고, 숫자의 경우 0이상)
    * 을 가진 경우에만 수정에 반영하는 동적 쿼리로 구현
    * */

    @UpdateProvider(type = SqlBuilderProvider.class, method = "modifyMenu")
    int modifyMenu(MenuDTO menuDTO);
}
