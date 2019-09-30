package com.simon.springboot.charter01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: charter-01
 * @description: hello controller
 * @author: simon
 * @create: 2019-09-30 17:10
 **/
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
}
