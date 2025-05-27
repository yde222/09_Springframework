package com.ohgiraffers.fileupload;

import org.springframework.stereotype.Controller;

@Controller
public class MainController {

    @Res
    public String mainPage(){
        return "main";
    }
}
