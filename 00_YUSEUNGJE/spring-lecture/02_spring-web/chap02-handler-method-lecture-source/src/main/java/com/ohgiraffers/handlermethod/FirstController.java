package com.ohgiraffers.handlermethod;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

@Controller
@RequestMapping("/first/*")
public class FirstController {

    // /first/regist로 보낸다.
    // 핸들러 메서드 반환 값이 void인 경우 요청 주소가 곧 view의 이름이 된다.
    @GetMapping("/regist")
    public void regist() {
    }


    /*
    * 1. WebRequest로 요청 파라미터 전달 받기
    * HttpServletRequest/Response 도 매개변수에 선언해서 사용하는 것이 가능하지만
    * WebRequest가 Servlet 기술에 종속적이지 않아 Spring기반의 프로젝트에서 더 자주 사용된다.
    * */
    @PostMapping("/regist")
    public String registMenu(WebRequest request, Model model) {

        String name = request.getParameter("name");
        int price = Integer.parseInt(request.getParameter("price"));
        int categoryCode = Integer.parseInt(request.getParameter("categoryCode"));

        String message = name + "을 신규 메뉴 목록의 " + categoryCode + "번 카테고리에 "
                + price + "원으로 등록했습니다.";
        model.addAttribute("message", message);

        return "first/messagePrinter";
    }

    // 단순 페이지 이동용으로 만들어진 핸들러 메소드
    @GetMapping("/modify")
    public void modify() {}

    /* 2. @RequestParam
     * 요청 파라미터를 매핑하여 핸들러 메소드 호출 시 값을 넣어주는 어노테이션으로 매개변수 앞에 작성
     * name 속성과 매개변수명이 다른 경우 @RequestParam("name") 으로 작성하며 별도의 속성이
     * 필요 없을 경우에는 어노테이션 생략도 가능하다.
     * 전달하는 name 속성과 일치하는 것이 없는 경우 400 (Bad Request) 에러가 발생하는데
     * 이는 required = true 가 기본 값이기 때문이다.
     * 값을 입력하지 않고 넘기면 빈 문자열이 넘어오므로 parsing 관련 에러가 발생할 수 있다.
     * */
    @PostMapping("/modify")
    public String modifyMenu(
            @RequestParam(value="nam", required = false) String modifyName,
            @RequestParam(value="price", defaultValue = "0") int modifyPrice,
            Model model
    ){
        String message = modifyName + "메뉴의 가격을 " + modifyPrice + "원으로 변경했습니다.";
        model.addAttribute("message", message);

        return "first/messagePrinter";
    }

    @GetMapping("/search")
    public void search(){}

    /* 3. @ModelAttribute */
    @PostMapping("/search")
    public String searchMenu(@ModelAttribute("menu") MenuDTO menuDTO){
        return "first/searchResult";
    }

    @GetMapping("/login")
    public void login(){}





}
