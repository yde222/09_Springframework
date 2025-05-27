package com.ohgiraffers.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class StopwatchInterceptor implements HandlerInterceptor {
    /* Interceptor는 스프링 컨테이너에 존재하는 빈을 의존성 주입 받을 수 있다.*/
    private final MenuService menuService;

    public StopwatchInterceptor(MenuService menuService) {
        this.menuService = menuService;
    }

    /* 전처리 메소드 */

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return false;
    }
}
