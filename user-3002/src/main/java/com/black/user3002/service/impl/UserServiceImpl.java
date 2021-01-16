package com.black.user3002.service.impl;

import com.black.user3002.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getUser() {

        return "这是user2的方法";
    }
}
