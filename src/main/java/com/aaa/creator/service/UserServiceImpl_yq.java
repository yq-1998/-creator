package com.aaa.creator.service;

import com.aaa.creator.mapper.UserMapper_yq;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class UserServiceImpl_yq implements UserService_yq {
    @Resource
    private UserMapper_yq userMapper_yq;
//    @Override
//    public User selUser(String uphone, String upassword) {
//        return userMapper_yq.selUser(uphone,upassword);
//    }

    @Override
    public int addUser(String openid) {
        return userMapper_yq.addUser(openid);
    }
}
