package com.ohgiraffers.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    private final Stopwatchinterceptor stopwatchinterceptor;

    public WebConfig(Stopwatchinterceptor stopwatchinterceptor) {
        this.stopwatchinterceptor = stopwatchinterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(stopwatchinterceptor).addPathPatterns("/stopwatch");
    }
}
