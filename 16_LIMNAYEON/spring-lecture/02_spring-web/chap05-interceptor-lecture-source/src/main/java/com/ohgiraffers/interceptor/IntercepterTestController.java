package com.ohgiraffers.interceptor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IntercepterTestController {

    @GetMapping("/stopwatch")
    public String stopwatch() {
        System.out.println("Handler Method 호출 시점");
        return "result";
    }

}
