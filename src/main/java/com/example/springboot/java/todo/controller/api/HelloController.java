package com.example.springboot.java.todo.controller.api;


import com.alibaba.fastjson.JSON;
import com.example.springboot.java.todo.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试
 *
 * @author colin
 */
@RestController
@RequestMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
@Api(value = "Hello World", tags = "Hello World")
public class HelloController {

    @RequestMapping("/helloWorld")
    @ApiOperation(value = "Hello World", tags = "Hello World")
    private String helloWorld() {
        User user = new User();
        user.setName("Colin Tam");
        user.setPassword("");
        user.setAge(22);
        user.setGender(1);
        user.setEmail("1679916999@qq.com");
        return JSON.toJSONString(user);
    }

}
