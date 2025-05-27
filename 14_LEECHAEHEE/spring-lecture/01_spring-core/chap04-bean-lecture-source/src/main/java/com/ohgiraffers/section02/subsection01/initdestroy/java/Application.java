package com.ohgiraffers.section02.subsection01.initdestroy.java;

import com.ohgiraffers.common.Product;
import com.ohgiraffers.common.ShoppingCart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(ContextConfiguration.class);

        Product cartBread = applicationContext.getBean("cartBread", Product.class);
        Product milk = applicationContext.getBean("milk", Product.class);
        Product water = applicationContext.getBean("water", Product.class);

        System.out.println("쇼핑카트 객체 꺼내기 전");
        ShoppingCart shoppingCart = applicationContext.getBean("cart", ShoppingCart.class);
        System.out.println("쇼핑카트 객체 꺼낸 다음");
        shoppingCart.addItem(cartBread);
        shoppingCart.addItem(milk);
        System.out.println("장바구니에 담은 상품 : " + shoppingCart.getItems());

        // 다음 손님
        ShoppingCart shoppingCart2 = applicationContext.getBean("cart", ShoppingCart.class);
        shoppingCart2.addItem(water);
        System.out.println("cart2에 담은 상품 : " + shoppingCart2.getItems());

        ((AnnotationConfigApplicationContext)applicationContext).close();
    }
}
