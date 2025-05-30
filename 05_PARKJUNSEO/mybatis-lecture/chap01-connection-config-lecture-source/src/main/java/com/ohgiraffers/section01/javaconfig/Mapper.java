package com.ohgiraffers.section01.javaconfig;

import org.apache.ibatis.annotations.*;

public interface Mapper {
    @Select("SELECT NOW()")
    java.util.Date selectDate();
}
