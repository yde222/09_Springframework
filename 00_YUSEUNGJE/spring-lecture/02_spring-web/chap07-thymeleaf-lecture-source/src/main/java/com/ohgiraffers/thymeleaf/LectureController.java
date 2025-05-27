package com.ohgiraffers.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/lecture")
public class LectureController {

    @GetMapping("/expression")
    public ModelAndView expression(ModelAndView mv) {

        mv.addObject("member", new MemberDTO("홍길동", 20, '남', "서울시 종로구"));
        mv.addObject("hello", "hello!<h3>Thymeleaf</h3>");

        mv.setViewName("lecture/expression");

        return mv;
    }
}
