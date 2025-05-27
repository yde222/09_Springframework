package com.ohgriaffers.section02.subsection02.annotation;

import com.ohgriaffers.common.Product;
import com.ohgriaffers.common.ShoppingCart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        Product carpBread = context.getBean("carpBread", Product.class);
        Product milk = context.getBean("milk", Product.class);
        Product water = context.getBean("water", Product.class);

        System.out.println("쇼핑 카트 객체 꺼내기 전");
        ShoppingCart shoppingCart = context.getBean("shoppingCart", ShoppingCart.class);
        System.out.println("쇼핑 카드 객체 꺼낸 다음");
        shoppingCart.addItem(carpBread);
        shoppingCart.addItem(milk);
        System.out.println("cart에 담긴 물품 : " + shoppingCart.getItems());

        // 다음 손님 등장
        ShoppingCart shoppingCart2 = context.getBean("shoppingCart2", ShoppingCart.class);
        shoppingCart2.addItem(water);
        System.out.println("cart2에 담긴 물품 : " + shoppingCart2.getItems());

        ((AnnotationConfigApplicationContext)context).close();
    }
}
