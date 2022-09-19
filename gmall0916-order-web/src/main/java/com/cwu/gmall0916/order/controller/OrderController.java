package com.cwu.gmall0916.order.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cwu.gmall0916.bean.UserInfo;
import com.cwu.gmall0916.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Reference
    UserService userService;

    @GetMapping("ordertrade")
    public UserInfo trade(@RequestParam("id") String id){
        return userService.getUserById(id);
    }

}
