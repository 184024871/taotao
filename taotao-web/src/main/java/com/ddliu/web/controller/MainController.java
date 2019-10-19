package com.ddliu.web.controller;

import com.ddliu.entity.po.TPxxCd;
import com.ddliu.service.PxxCdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MainController {

    @Autowired
    PxxCdService pxxCdService;

    /**
     * 底部菜单
     * @return
     */
    @RequestMapping("/main")
    List<String> main(){
        List<String> mains = new ArrayList<>();
        mains.add("淘");
        mains.add("微淘");
        mains.add("消息");
        mains.add("购物车");
        mains.add("我的淘淘");
        return mains;
    }
    @RequestMapping("/getMyCds")
    List<TPxxCd> getMyCds(){
        List<TPxxCd> pxxCds = pxxCdService.getMyCds();
        return pxxCds;
    }

}
