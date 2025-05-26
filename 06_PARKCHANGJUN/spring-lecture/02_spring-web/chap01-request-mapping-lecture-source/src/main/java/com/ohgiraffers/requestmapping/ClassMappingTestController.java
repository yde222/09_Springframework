package com.ohgiraffers.requestmapping;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/order")
public class ClassMappingTestController {

    @GetMapping("/regist")
    public String registOrder(Model model) {
        model.addAttribute("message", "GET 방식의 주문 등록 핸들러 메소드 호출");
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
    public String detail(@PathVariable("orderNo") String orderNo, Model model) {
        model.addAttribute("message", "GET 방식의 " + orderNo + "번 주문 상세 핸들러 메소드 호출");
        return "mappingResult";
    }

    @RequestMapping
    public String otherRequest(Model model) {
        model.addAttribute("message", "order 요청이긴 하지만 다른 기능은 아직 준비 되지 않음");
        return "mappingResult";
    }

}
