package com.spring.section06Thymeleaf_demo.cintroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {


    @GetMapping("/")
    public String sayHello(Model theModel){

        theModel.addAttribute("data",new java.util.Date());

        return "helloworld";
    }

}
