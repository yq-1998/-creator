package com.aaa.creator.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper_yq {
//   public User selUser(@Param("uphone") String uphone, @Param("upassword") String upassword);
   public int addUser(String openid);
}

