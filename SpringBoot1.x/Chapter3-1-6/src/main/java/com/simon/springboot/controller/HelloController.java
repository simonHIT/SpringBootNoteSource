package com.simon.springboot.controller;

import com.simon.springboot.service.MyException;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HelloController {

    @RequestMapping(value = "/")
    public String index(ModelMap map) throws Exception{

        throw new Exception("发生错误");
//        map.addAttribute("host","http://com.simonhitwh.me");
//        return "index";
    }

    @RequestMapping(value = "/json")
    public String json()throws MyException{
        throw new MyException("发生错误");
    }



}
