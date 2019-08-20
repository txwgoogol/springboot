package com.example.springboot.java.todo.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 用户实体拓展类
 *
 * @author colin
 */
@Data
public class UserVo {
	
	@ApiModelProperty(value = "用户名")
	private String name;
	@ApiModelProperty(value = "密码")
	private String password;
	@ApiModelProperty(value = "性别")
	private int gender = 0;
	@ApiModelProperty(value = "年龄")
	private int age;
	@ApiModelProperty(value = "邮箱")
	private String email;
	
}