package com.aaa.creator.entity;

public class User {
//    uid int not null auto_increment PRIMARY KEY,  -- 用户id
//    uphone VARCHAR(11) not null,  -- 手机号
//    upassword VARCHAR(20) not null,-- 密码
//    usex VARCHAR(6) not null  -- 性别
 private Integer uid;
 private String openid;
 private String uname;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }
}
