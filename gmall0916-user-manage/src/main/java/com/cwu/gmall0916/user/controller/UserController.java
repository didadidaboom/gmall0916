package com.cwu.gmall0916.user.controller;

import com.cwu.gmall0916.bean.UserInfo;
import com.cwu.gmall0916.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("user")
    public UserInfo getUser(String id){
        return userService.getUserById(id);
    }
    @GetMapping("userAll")
    public List<UserInfo> getAllUsers(){
        return userService.getUserinfoListAll();
    }
    @PostMapping("userAdd")
    public String addUser(UserInfo userInfo){
        userService.addUser(userInfo);
        return "success: user added";
    }
    @PutMapping("userputname")
    public String updateUserByName(UserInfo userInfo){
        userService.updateUserByName(userInfo.getName(), userInfo);
        return "success: update user by name";
    }
    @PutMapping("userput")
    public String updateUser(UserInfo userInfo){
        userService.updateUser(userInfo);
        return "success: update user";
    }
    @DeleteMapping("userdelete")
    public String deleteUser(UserInfo userInfo){
        userService.delUser(userInfo);
        return "success: delete user";
    }


}
