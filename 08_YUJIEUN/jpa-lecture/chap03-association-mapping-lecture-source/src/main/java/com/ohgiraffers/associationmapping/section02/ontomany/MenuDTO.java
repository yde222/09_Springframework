package com.ohgiraffers.associationmapping.section02.ontomany;

import com.ohgiraffers.associationmapping.section01.manytotone.CategoryDTO;

public class MenuDTO {

    private int menuCode;
    private String menuName;
    private int menuPrice;
    private com.ohgiraffers.associationmapping.section01.manytotone.CategoryDTO category;
    private String orderableStatus;

    public MenuDTO() {
    }

    public MenuDTO(
            int menuCode, String menuName, int menuPrice,
            com.ohgiraffers.associationmapping.section01.manytotone.CategoryDTO category, String orderableStatus
    ) {
        this.menuCode = menuCode;
        this.menuName = menuName;
        this.menuPrice = menuPrice;
        this.category = category;
        this.orderableStatus = orderableStatus;
    }

    public int getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(int menuCode) {
        this.menuCode = menuCode;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public int getMenuPrice() {
        return menuPrice;
    }

    public void setMenuPrice(int menuPrice) {
        this.menuPrice = menuPrice;
    }

    public com.ohgiraffers.associationmapping.section01.manytotone.CategoryDTO getCategory() {
        return category;
    }

    public void setCategory(CategoryDTO category) {
        this.category = category;
    }

    public String getOrderableStatus() {
        return orderableStatus;
    }

    public void setOrderableStatus(String orderableStatus) {
        this.orderableStatus = orderableStatus;
    }

    @Override
    public String toString() {
        return "MenuDTO{" +
                "menuCode=" + menuCode +
                ", menuName='" + menuName + '\'' +
                ", menuPrice=" + menuPrice +
                ", category=" + category +
                ", orderableStatus='" + orderableStatus + '\'' +
                '}';
    }
}