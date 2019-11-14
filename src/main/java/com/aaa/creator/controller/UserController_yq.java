package com.aaa.creator.controller;

import com.aaa.creator.entity.User;
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
    public Object addUser(User user){
        int us = userService_yq.selUser(user.getOpenid());
        if(us>0){
            System.out.println("openid重复");
            return  us;
        }else{
            int a = userService_yq.addUser(user);
            return a;
        }

    }
}
