package com.example.springboot.java.controller;


import com.alibaba.fastjson.JSON;
import com.example.springboot.java.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试
 *
 * @author colin
 */
@RestController
@Api(value = "Hello World", tags = "Hello World")
public class HelloController {

    @RequestMapping("/helloWorld")
    @ApiOperation(value = "Hello World", tags = "Hello World")
    private String helloWorld() {
        return JSON.toJSONString(new User("COLIN TAM", 22, "1679916999@qq.com"));
    }

}
