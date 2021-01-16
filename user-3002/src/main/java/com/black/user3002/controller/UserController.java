package com.black.user3002.controller;

import com.black.user3002.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping(value = "/getUser")
    @ResponseBody
    public String getUser(){
        String result = userService.getUser();
        return result;
    }
}
