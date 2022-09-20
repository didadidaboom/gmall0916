package com.cwu.gmall0916.manageservice.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.cwu.gmall0916.bean.BaseCatalog1;
import com.cwu.gmall0916.bean.BaseCatalog2;
import com.cwu.gmall0916.bean.BaseCatalog3;
import com.cwu.gmall0916.manageservice.mapper.BaseCatalog1Mapper;
import com.cwu.gmall0916.manageservice.mapper.BaseCatalog2Mapper;
import com.cwu.gmall0916.manageservice.mapper.BaseCatalog3Mapper;
import com.cwu.gmall0916.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class ManageServiceImpl implements ManageService {

    @Autowired
    BaseCatalog1Mapper baseCatalog1Mapper;

    @Autowired
    BaseCatalog2Mapper baseCatalog2Mapper;

    @Autowired
    BaseCatalog3Mapper baseCatalog3Mapper;

    @Override
    public List<BaseCatalog1> getBaseCatalog1() {
        List<BaseCatalog1> baseCatalog1List = baseCatalog1Mapper.selectAll();
        return baseCatalog1List;
    }

    @Override
    public List<BaseCatalog2> getBaseCatalog2(String catalog1_id) {
        BaseCatalog2 baseCatalog2 = new BaseCatalog2();
        baseCatalog2.setCatalog1_id(catalog1_id);
        List<BaseCatalog2> baseCatalog2List = baseCatalog2Mapper.select(baseCatalog2);
        return baseCatalog2List;
    }

    @Override
    public List<BaseCatalog3> getBaseCatalog3(String catalog2_id) {
        BaseCatalog3 baseCatalog3 = new BaseCatalog3();
        baseCatalog3.setCatalog2_id(catalog2_id);
        List<BaseCatalog3> baseCatalog3List = baseCatalog3Mapper.select(baseCatalog3);
        return baseCatalog3List;
    }
}
