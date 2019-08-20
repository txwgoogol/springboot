package com.example.springboot.java.todo.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * 用户实体类
 *
 * @author colin
 */
@Data
@Entity
@Table(name = "USER")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//字增长策略
	@Column(name = "id")
	private long id; //序列
	@Column(name = "name", nullable = false)
	private String name; //用户名
	@Column(name = "password", nullable = false)
	private String password; //密码
	@Column(name = "gender")
	private int gender = 0; //性别
	@Column(name = "age")
	private int age; //年龄
	@Column(name = "email")
	private String email; //邮箱
	
}