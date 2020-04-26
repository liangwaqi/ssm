package com.itheima.service.impl;

import com.itheima.mapper.UserMapper;
import com.itheima.pojo.User;
import com.itheima.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {


    private UserMapper userMapper;

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User queryUserById(Long id) {
        return userMapper.queryUserById(id);
    }

    @Override
    public List<User> queryUserByList() {
        return userMapper.queryUserByList();
    }

    @Override
    public void addUsers(User user1, User user2) {
        userMapper.addUser(user1);
        //int num = 1 / 0;
        userMapper.addUser(user2);
    }

    @Override
    public void deleteUserById(Long id) {
        userMapper.deleteUserById(id);
    }
}
