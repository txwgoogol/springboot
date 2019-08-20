package com.example.springboot.java.todo.repository;

import com.example.springboot.java.todo.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * 修改用户资源库的接口，继承CrudRepository 。
 * 由于Spring Data JPA 已经帮助用户做了实现，因此，用户不需要做任何实现，甚至都无须在UserRepository 中定义任何方法
 *
 * @author colin
 */
public interface UserRepository extends CrudRepository<User, Long> {

    //User save(User user); // 新增或修改用户

    //void delete(Long id); // 删除用户

    //User getUserById(Long id); //根据用户ID获取用户

    //List<User> userList(); // 获取用户列表
}
