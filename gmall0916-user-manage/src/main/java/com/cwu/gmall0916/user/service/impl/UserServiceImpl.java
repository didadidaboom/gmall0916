package com.cwu.gmall0916.user.service.impl;

import com.cwu.gmall0916.user.bean.UserInfo;
import com.cwu.gmall0916.user.mapper.UserMapper;
import com.cwu.gmall0916.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<UserInfo> getUserinfoListAll() {
        List<UserInfo> userinfos = userMapper.selectAll();
        return userinfos;
    }

    @Override
    public void addUser(UserInfo userinfo) {

    }

    @Override
    public void updateUser(UserInfo userinfo) {

    }

    @Override
    public void updateUserByName(String name, UserInfo userinfo) {

    }

    @Override
    public void delUser(UserInfo userinfo) {

    }
}
