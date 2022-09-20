package com.cwu.gmall0916.service;

import com.cwu.gmall0916.bean.BaseCatalog1;
import com.cwu.gmall0916.bean.BaseCatalog2;
import com.cwu.gmall0916.bean.BaseCatalog3;

import java.util.List;

public interface ManageService {

    List<BaseCatalog1> getBaseCatalog1();

    List<BaseCatalog2> getBaseCatalog2(String catalog1_id);

    List<BaseCatalog3> getBaseCatalog3(String catalog2_id);
}

