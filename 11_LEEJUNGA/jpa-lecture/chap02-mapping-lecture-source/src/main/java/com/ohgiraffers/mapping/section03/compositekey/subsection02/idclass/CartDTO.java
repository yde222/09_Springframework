package com.ohgiraffers.mapping.section03.compositekey.subsection02.idclass;

import jakarta.persistence.*;

public class CartDTO {

    private int cartOwnerMemberNo;
    private int addedBookNo;
    private int quantity;

    public CartDTO(int cartOwnerMemberNo, int addedBookNo, int quantity) {
        this.cartOwnerMemberNo = cartOwnerMemberNo;
        this.addedBookNo = addedBookNo;
        this.quantity = quantity;
    }

    public int getCartOwnerMemberNo() {
        return cartOwnerMemberNo;
    }

    public int getAddedBookNo() {
        return addedBookNo;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cartOwner=" + cartOwnerMemberNo +
                ", addedBook=" + addedBookNo +
                ", quantity=" + quantity +
                '}';
    }
}
