package com.aaa.creator.mapper;

import com.aaa.creator.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper_yq {
//   public User selUser(@Param("uphone") String uphone, @Param("upassword") String upassword);
   public int addUser(User user);
   public int selUser(String openid);
}

