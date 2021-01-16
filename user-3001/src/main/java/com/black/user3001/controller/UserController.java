package com.black.user3001.controller;

import com.black.user3001.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
