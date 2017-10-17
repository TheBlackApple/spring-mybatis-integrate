package com.charles.service;

import com.charles.domain.User;

public interface UserService {
    User login(String loginname,String password);
}
