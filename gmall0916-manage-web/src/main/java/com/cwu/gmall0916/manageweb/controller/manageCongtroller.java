package com.cwu.gmall0916.manageweb.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cwu.gmall0916.bean.BaseCatalog1;
import com.cwu.gmall0916.bean.BaseCatalog2;
import com.cwu.gmall0916.bean.BaseCatalog3;
import com.cwu.gmall0916.service.ManageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class manageCongtroller {

    @Reference
    ManageService manageService;

    @GetMapping("getBaseCatalog1")
    public List<BaseCatalog1> getBaseCatalog1(){
        return manageService.getBaseCatalog1();
    }

    @GetMapping("getBaseCatalog2")
    public List<BaseCatalog2> getBaseCatalog2(String catalog1_id){
        return manageService.getBaseCatalog2(catalog1_id);
    }

    @GetMapping("getBaseCatalog3")
    public List<BaseCatalog3> getBaseCatalog3(String catalog2_id){
        return manageService.getBaseCatalog3(catalog2_id);
    }

}
