package com.fengyue.controller;

import com.fengyue.pojo.User;
import com.fengyue.service.TwoDataSourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    TwoDataSourceService twoDataSourceService;

    @RequestMapping("/getUser")
    public User getUser(){
        User user = new User();
        user.setName("擎天");
        user.setAge(1);
        user.setBrithday(new Date());

        return user;
    }

    @RequestMapping("twoDataSourceTest")
    public void twoDataSourceTest(){
        twoDataSourceService.insertTwoDataSource();
    }

//    @RequestMapping("get")
//    public ResponseEntity get(){
//        return ResponseEntity(HttpStatus.OK);
//    }



}
