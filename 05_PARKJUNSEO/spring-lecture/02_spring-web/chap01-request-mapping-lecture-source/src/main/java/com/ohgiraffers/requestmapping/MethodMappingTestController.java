package com.ohgiraffers.requestmapping;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.awt.*;

@Controller // 빈으로 등록
public class MethodMappingTestController {

    /* 1. http method 방식을 미지정 */
    @RequestMapping(value ="/menu/regist") // handler method임 (동시에 이게 하나의 서블릿 객체)
    public String menuRegist(Model model) {

        // Model 객체에 attribute를 key, value로 추가하면
        // view에서 사용 가능함 => chap03에서 다룰 예정
        // request.setAttribute(키, 값) 과 동일
        model.addAttribute("message", "신규 메뉴 등록용 핸들러 메소드 호출");

        return "mappingResult";
    }

    /* 2. http method 방식을 지정 */
    @RequestMapping(value = "/menu/modify", method = RequestMethod.GET)
    public String menuModify(Model model) {
        model.addAttribute("message", "GET 방식의 수정 핸들러 메소드 호출");

        return "mappingResult";
    }

    /* 3. http method 전용 어노테이션 */
    @GetMapping("/menu/delete")
    public String getMenu(Model model) {
        model.addAttribute("message", "GET 방식의 삭제 핸들러 메소드 호출");
        return "mappingResult";
    }

    @PostMapping("/menu/delete")
    public String postMenu(Model model) {
        model.addAttribute("message", "POST 방식의 삭제 핸들러 메소드 호출");
        return "mappingResult";
    }


}
