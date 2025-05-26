package com.ohgiraffers.section01.scope.subsection01.singleton;

import com.ohgiraffers.common.Baverage;
import com.ohgiraffers.common.Bread;
import com.ohgiraffers.common.Product;
import com.ohgiraffers.common.ShoppingCart;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

public class ContextConfiguration {
    @Bean
    public Product cartBread() {
        System.out.println("붕어빵 생성 시점");
        return new Bread("붕어빵", 1000, new java.util.Date());
    }

    @Bean
    @DependsOn({"cartBread", "milk", "water"})  // 나열한 Bean 인스턴스가 모두 생성된 뒤 생성되도록`
//    @Lazy
    @Scope("singleton")  // 기본값
    public ShoppingCart cart() {
        System.out.println("장바구니 생성 시점");
        return new ShoppingCart();
    }

    @Bean
    public Product milk() {
        System.out.println("딸기우유 생성 시점");
        return new Baverage("딸기우유", 1500, 500);
    }

    @Bean
    public Product water() {
        System.out.println("생수 생성 시점");
        return new Baverage("지리산 절벽 암반수", 30000, 400);
    }
}
