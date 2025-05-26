package com.jjh.handlermethod;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/first/*")
public class FirstController {

    /*
     * /first/regist로 보낸다.
     * 핸들러 메서드 반환 값이 void인 경우 요청 주소가 곧 view의 이름이 된다.
     *  */
    @GetMapping("/regist")
    public void regist() {

    }

    @PostMapping("/regist")
    public String registMenu() {
        System.out.println("확인용~~~~");
        return "test";
    }

}
