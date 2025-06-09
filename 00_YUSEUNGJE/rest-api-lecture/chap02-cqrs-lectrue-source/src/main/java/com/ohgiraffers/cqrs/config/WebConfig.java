package com.ohgiraffers.cqrs.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig  implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")      // 모든 경로에 대해
        .allowedOrigins("http://localhost:5173")     // 허용할 출처
                .allowedMethods("*")                // 허용할 HTTP메서드
                .allowedHeaders("*")                // 모든 헤더 허용
                .allowCredentials(true);             // 자격 증명(쿠키 등) 허용
    }
}
