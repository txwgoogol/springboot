package com.example.springboot.java.todo.controller.api;


import com.alibaba.fastjson.JSON;
import com.example.springboot.java.todo.entity.User;
import com.example.springboot.java.todo.vo.UserVo;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * 用户中心
 *
 * @author colin
 */
@RestController
@Api(value = "个人中心", tags = "个人中心")
@RequestMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserApi {
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	@ApiOperation(value = "注册", tags = "注册")
	private void register(
		@ApiParam(value = "用户信息", required = true) @Validated @RequestBody UserVo userVo,
		HttpServletRequest request,
		HttpServletResponse response) throws Exception{
		User user = new User();
		user.setName(userVo.getName());
		user.setPassword(user.getPassword());
		user.setAge(userVo.getAge());
		user.setGender(user.getGender());
		user.setEmail(userVo.getEmail());
        
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
//        Map resultMap = new HashMap();
//        resultMap.put("status", 200);
//        if (user != null){
//            resultMap.put("data",user);
//        }
        response.setContentType("application/json; charset=utf-8");
        objectMapper.writeValue(response.getWriter(), user);
		
		//return JSON.toJSONString(user);
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ApiOperation(value = "登录", tags = "登录")
	private String login(UserVo userVo) {
		User user = new User();
		user.setName("Colin Tam");
		user.setPassword("");
		user.setAge(22);
		user.setGender(1);
		user.setEmail("1679916999@qq.com");
		return JSON.toJSONString(user);
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	@ApiOperation(value = "个人信息", tags = "个人信息")
	private String getUser() {
		User user = new User();
		user.setName("Colin Tam");
		user.setPassword("");
		user.setAge(22);
		user.setGender(1);
		user.setEmail("1679916999@qq.com");
		return JSON.toJSONString(user);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	@ApiOperation(value = "修改个人信息", tags = "修改个人信息")
	private String update() {
		User user = new User();
		user.setName("Colin Tam");
		user.setPassword("");
		user.setAge(22);
		user.setGender(1);
		user.setEmail("1679916999@qq.com");
		return JSON.toJSONString(user);
	}
	
}
