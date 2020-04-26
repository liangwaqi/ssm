package com.itheima.mapper;

import com.itheima.pojo.User;

import java.util.List;

public interface UserMapper {
    User queryUserById(Long id);

    List<User> queryUserByList();

    void addUser(User user1);

    void deleteUserById(Long id);
}
