package com.cwu.gmall0916.user.service.impl;

import com.cwu.gmall0916.user.bean.UserInfo;
import com.cwu.gmall0916.user.mapper.UserMapper;
import com.cwu.gmall0916.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<UserInfo> getUserinfoListAll() {
        return  userMapper.selectAll();
    }

    @Override
    public void addUser(UserInfo userinfo) {
        userMapper.insertSelective(userinfo);
    }

    @Override
    public void updateUser(UserInfo userinfo) {
        userMapper.updateByPrimaryKeySelective(userinfo);
    }

    @Override
    public void updateUserByName(String name, UserInfo userinfo) {
        Example example = new Example(UserInfo.class);
        example.createCriteria().andEqualTo("name",name);
        userMapper.updateByExampleSelective(userinfo, example);
    }

    @Override
    public void delUser(UserInfo userinfo) {
        userMapper.deleteByPrimaryKey(userinfo.getId());
    }
}
