package com.fengyue.interceptor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("oneInterceptor")
public class OneInterceptorController {

    @RequestMapping("index")
    public String index(ModelMap modelMap){
        modelMap.addAttribute("propertiesConfig","this is oneInterceptor/index");
        return "freemarker/index";
    }

    @RequestMapping("center")
    public String center(){
        return "freemarker/center/center";
    }


}
