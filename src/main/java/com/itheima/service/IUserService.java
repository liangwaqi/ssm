package com.itheima.service;

import com.itheima.pojo.User;

import java.util.List;

public interface IUserService {
    User queryUserById(Long id);
    List<User> queryUserByList();
    void addUsers(User user1, User user2);

    void deleteUserById(Long id);
}
