package com.cwu.gmall0916.user.service;

import com.cwu.gmall0916.user.bean.UserInfo;

import java.util.List;

public interface UserService{

    List<UserInfo> getUserinfoListAll();

    void addUser(UserInfo userinfo);

    void updateUser(UserInfo userinfo);

    void updateUserByName(String name, UserInfo userinfo);

    void delUser(UserInfo userinfo);
}
