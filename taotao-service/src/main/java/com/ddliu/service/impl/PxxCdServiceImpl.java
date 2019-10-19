package com.ddliu.service.impl;

import com.ddliu.dao.TPxxCdMapper;
import com.ddliu.entity.po.TPxxCd;
import com.ddliu.service.PxxCdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PxxCdServiceImpl implements PxxCdService {

    @Autowired
    TPxxCdMapper pxxCdMapper;

    @Override
    public List<TPxxCd> getMyCds() {
//        List<TPxxCd> pxxCds = new ArrayList<>();
//        TPxxCd pxxCd = new TPxxCd();
//        pxxCd.setCdName("个人中心");
//        pxxCds.add(pxxCd);
        List<TPxxCd> pxxCds = pxxCdMapper.selectAll();
        return pxxCds;
    }
}
