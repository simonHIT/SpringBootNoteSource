package com.simon.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * hello controller
 */
@RestController(value = "HelloController")
public class HelloController {

    @ResponseBody
    @RequestMapping(value = "/helloWorld",method = RequestMethod.GET)
    public String sayHello(){
        return "Hello world";
    }
}
