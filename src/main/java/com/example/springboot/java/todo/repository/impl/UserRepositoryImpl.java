package com.example.springboot.java.todo.repository.impl;

import org.springframework.stereotype.Repository;

@Repository //表示 UserRepositoryImpl 是一个可以注入的bean
public class UserRepositoryImpl /*implements UserRepository */ {

    /*
    //生成递增ID用作用户唯一编号
    private static AtomicLong counterId = new AtomicLong();
    //模拟数据存储
    private final ConcurrentMap<Long, User> userConcurrentMap = new ConcurrentHashMap<>();

    @Override
    public User save(User user) {
        Long id = user.getId();
        if (id == null) {
            id = counterId.incrementAndGet();
            user.setId(id);
        }
        this.userConcurrentMap.put(id, user);
        return user;
    }

    @Override
    public void delete(Long id) {
        this.userConcurrentMap.remove(id);
    }

    @Override
    public User getUserById(Long id) {
        return this.userConcurrentMap.get(id);
    }

    @Override
    public List<User> userList() {
        return new ArrayList<>(this.userConcurrentMap.values());
    }
    */

}