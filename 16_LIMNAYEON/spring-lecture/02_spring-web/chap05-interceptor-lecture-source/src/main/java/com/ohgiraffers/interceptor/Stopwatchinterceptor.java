package com.ohgiraffers.interceptor;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class Stopwatchinterceptor implements HandlerInterceptor {


    // Interceptor는 스프링 컨테이너
    private final MenuService menuService;

    public Stopwatchinterceptor(MenuService menuService){
        this.menuService = menuService;
    }

    // 전처리 메소드
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        System.out.println("preHandler 메소드 동작");

        long startTitme = System.currentTimeMillis();
        request.setAttribute("startTitme", startTitme);

        return true; // controller handler method로 호출이 이어진다. false이면 호출하지 않는다.
    }

    // 후처리 메소드
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        // ModelAndView 객체를 후처리시 가공할 수도 있다.
        System.out.println("postHandler 메소드 호출");

        long endTime = System.currentTimeMillis();
        long startTitme = (Long) request.getAttribute("startTitme");
        modelAndView.addObject("interval", endTime - startTitme);
    }

    // 뷰가 렌더링이 된 이후 동작하는 메소드, Exception 사용 가능
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion 메소드 호출");
        Thread.sleep(1000);
        menuService.method();
    }
}

