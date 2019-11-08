package com.aaa.creator.controller;

import com.aaa.creator.service.UserService_yq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController_yq {
    @Autowired
    private UserService_yq userService_yq;
//    @RequestMapping("selUser")
//    @ResponseBody
//    public Object selUser(String uphone,String upassword){
//        User user = userService_yq.selUser(uphone,upassword);
//        return user;
//    }
    @RequestMapping("addUser")
    @ResponseBody
    public Object addUser(String openid){
         int a = userService_yq.addUser(openid);
        System.out.println(a);
        return a;
    }
}
