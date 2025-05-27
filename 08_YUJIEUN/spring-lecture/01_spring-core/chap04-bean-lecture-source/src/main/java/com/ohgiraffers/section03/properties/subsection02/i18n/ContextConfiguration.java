package com.ohgiraffers.section03.properties.subsection02.i18n;

import com.ohgiraffers.common.Baverage;
import com.ohgiraffers.common.Bread;
import com.ohgiraffers.common.Product;
import com.ohgiraffers.common.ShoppingCart;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;


public class ContextConfiguration {

    @Bean
    public MessageSource messageSource() {
        //접속하는 세션의 로케일에 따라 자도으로 재로딩하는 MessageSource 구현체
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();

        messageSource.setBasename("section03/properties/subsection02/i18n/messages");
        messageSource.setDefaultEncoding("UTF-8");
    }

}
