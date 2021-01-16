package com.black.user3001.service.impl;

import com.black.user3001.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getUser() {

        return "这是user1的方法";
    }
}
