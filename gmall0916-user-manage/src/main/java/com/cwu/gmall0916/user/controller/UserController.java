package com.cwu.gmall0916.user.controller;

import com.cwu.gmall0916.user.bean.UserInfo;
import com.cwu.gmall0916.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("allusers")
    public List<UserInfo> getAllUsers(){
        return userService.getUserinfoListAll();
    }

}
