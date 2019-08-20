package com.fengyue.controller;

import com.fengyue.pojo.User;
import com.fengyue.util.PropertiesConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    private PropertiesConfig propertiesConfig;

    @RequestMapping("/sayHello")
    public String sayHello(){
        return "!!!!----@----!!say hello spring boot- - - - ";
    }

    @RequestMapping("/getProperties")
    public String getProperties(){
        User user = new User();
        user.setName(propertiesConfig.getName());
        user.setAge(propertiesConfig.getAge());
        return user.toString();
    }
}
