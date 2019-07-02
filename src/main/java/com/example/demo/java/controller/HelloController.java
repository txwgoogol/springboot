package com.example.demo.java.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试
 *
 * @author colin
 */
@RestController
public class HelloController {

    @RequestMapping("/helloWorld")
    private String helloWorld() {
        return "Hello World";
    }

}
