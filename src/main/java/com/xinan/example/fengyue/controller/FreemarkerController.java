package com.xinan.example.fengyue.controller;


import com.xinan.example.fengyue.util.PropertiesConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.management.modelmbean.ModelMBean;

@Controller
@RequestMapping("ftl")
public class FreemarkerController {

    @Autowired
    private PropertiesConfig propertiesConfig;

    @RequestMapping("index")
    public String index(ModelMap modelMap){
        modelMap.addAttribute("propertiesConfig",propertiesConfig);
        return "freemarker/index";
    }

    @RequestMapping("center")
    public String center(){
        return "freemarker/center/center";
    }

    @RequestMapping("error")
    public String error(){
        int a = 1/0;

        return "themeleaf/error";
    }

}
