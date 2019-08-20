package com.fengyue.controller;

import com.fengyue.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/getUser")
    public User getUser(){
        User user = new User();
        user.setName("擎天");
        user.setAge(1);
        user.setBrithday(new Date());

        return user;
    }
}
