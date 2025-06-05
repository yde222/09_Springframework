package com.ohgiraffers.datajpa.menu.controller;

import com.ohgiraffers.datajpa.menu.dto.MenuDTO;
import com.ohgiraffers.datajpa.menu.service.MenuService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/menu")
@RequiredArgsConstructor
@Slf4j      // log라는 변수명으로 Logger객체 타입의 필드가 선언되고 생성된다.
public class MenuController {

    private final MenuService menuService;

    @GetMapping("/{menuCode}")
        public String findMenuByCode(@PathVariable("menuCode") int menuCode, Model model) {
        // client에서 받은 값을 service단으로 보내기 위함
        MenuDTO resultMenu = menuService.findMenuByMenuCode(menuCode);

        // 수행결과에 따라 필요한 값을 담아서 필요한 페이지로 이동
        model.addAttribute("menu", resultMenu);
        return "menu/detail";  // viewresolver라는 객체를 통해서 /resource/menu/detail.html로 이동
    }

    @GetMapping("/list")
    public String findMenuList(Model model){


        /* System.out.print 계열의 메소드보다 효율적으로 로그 출력을 할 수 있다.
        * 로그 레벨에 맞춘 메소드를 통해 출력 처리한다.
        * {} 를 통해 값이 입력될 위치를 포메팅한다.
        * */
        String test = "test";
        log.info("log test ====> {}", test);
        return "";
    }
}

