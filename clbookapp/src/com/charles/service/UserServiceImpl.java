package com.charles.service;

import com.charles.domain.User;
import com.charles.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String loginname,String password) {
        return userMapper.findWithLoginnameAndPassword(loginname,password);
    }
}
