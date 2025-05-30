package com.ohgiraffers.section02.crud;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// 기본 이름은 클래스며이며 중복되면 안된다.
// 다음과 같이 입력하면 menu라는 테이블명을 만들 수 있다.
@Entity(name="Section02Menu")
@Table(name="tbl_menu")
public class Menu {

    @Id
    @Column(name="menu_code")
    private int menuCode;
    private String menuName;
    private int menuPrice;
    private int categoryCode;
    private String orderableStatus;

}
