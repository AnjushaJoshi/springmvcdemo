package com.springmvcdemo.springmvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

    @GetMapping(value="/index")
    public String indexPage(@RequestParam(name="name", required=false,
            defaultValue="World") String name, Model model){
        model.addAttribute("name",name);
        return "index";
    }

    @GetMapping(value="/registration")
    public String regPage(){
        return "register";
    }  //http://localhost:8089/index/?name=Anjusha

}
