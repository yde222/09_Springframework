package com.ohgiraffers.exceptionhandler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExceptionHandlerController {

    @GetMapping("/controller-null")
    public String nullPonterExceptionTest(){
        String str = null;
        System.out.println(str.charAt(0));  // 의도적으로 NullPointerException 발생
        return "/";
    }
}
