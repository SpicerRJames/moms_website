package com.donna.demo.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    
    @GetMapping("/")
    public String homePage(){
        return "index.html";
    }

    @GetMapping("/about")
    public String aboutPage(){
        return "about.html";
    }

    

}