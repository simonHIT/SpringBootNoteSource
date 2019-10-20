package com.simon.springboot.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HelloController {

    @RequestMapping(value = "/")
    public String index(ModelMap map){
        map.addAttribute("host","http://com.simonhitwh.me");
        return "index";
    }

}
