package com.ohgiraffers.fileupload;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainContoller {

    @RequestMapping({"/", "/main"})
    public String mainPage() {
        return "main";
    }

}
