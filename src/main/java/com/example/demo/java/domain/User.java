package com.example.demo.java.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * 用户实体类
 *
 * @author colin
 */
@Data
@Entity
@Table(name = "SPRING_USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//字增长策略
    @Column(name = "id")
    private Long id;//唯一标识
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private Integer age;
    @Column(name = "email")
    private String email;

    public User() {
    }

    public User(String name, Integer age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

}