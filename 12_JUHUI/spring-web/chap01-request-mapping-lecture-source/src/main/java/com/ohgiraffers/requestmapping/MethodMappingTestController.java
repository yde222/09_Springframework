package com.ohgiraffers.requestmapping;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller // 빈으로 등록. 얘가 진입점
public class MethodMappingTestController {
    /* 1. http method 방식을 미지정 */
    @RequestMapping("/menu/regist")
    public String menuRegist(Model model) {
        // Model 객체에 attribute를 key, values로 추가하면
        // view에서 사용가능하다. -> chap03에서 다룰 예정
        // request.setAttribute(키, 값)
        model.addAttribute("message", "신규 메뉴 등록용 핸들러 메소드 호출");

        return "mappingResult";// 폴더명 or 파일명이 들어감.
    }

    /* 2. http method 방식 지정 */
    @RequestMapping(value = "menu/modify", method = RequestMethod.GET)
    public String menuModify(Model model) {
        model.addAttribute("message", "GET 방식의 수정 핸들러 메소드 호출");
        return "mappingResult";
    }

    /* 3. http method 전용 어노테이션 */
    @GetMapping("/menu/delete")
    public String getMenuDelete(Model model) {
        model.addAttribute("message", "GET 방식의 삭제 핸들러 메소드 호출");
        return "mappingResult";
    }

    @PostMapping("/menu/delete")
    public String postMenuDelete(Model model) {
        model.addAttribute("message", "POST 방식의 삭제 핸들러 메소드 호출");
        return "mappingResult";
    }

    /* 여러 주소 값과 매핑 */
    @RequestMapping(value = {"/modify", "/delete"}, method = RequestMethod.POST)
    public String modifyAndDeleteOrder(Model model) {
        model.addAttribute("message", "POST 방식의 주문 수정, 삭제 핸들러 메소드 호출");
        return "mappingResult";
    }

    /* Path Variable : 요청 주소에 포함된 변수 */
    @GetMapping("/detail/{orderNo}")
    public String detailOrder(@PathVariable("orderNo") int orderNo, Model model) {
        model.addAttribute("message", "GET 방식의 " + orderNo + "번 주문 상세 핸들러 메소드 호출");
        return "mappingResult";
    }

    @RequestMapping()
    public String otherRequest(Model model) {
        model.addAttribute("message", "order 요청이긴 하지만 다른 기능은 아직 준비 되지않음");
        return "mappingResult";
    }
}
