package com.example.demo.repository;

import com.example.demo.domain.User;

import java.util.List;

public interface UserRepository {

    User save(User user); // 新增或修改用户

    void delete(Long id); // 删除用户

    User getUserById(Long id); //根据用户ID获取用户

    List<User> userList(); // 获取用户列表
}
