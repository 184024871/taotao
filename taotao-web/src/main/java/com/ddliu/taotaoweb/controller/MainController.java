package com.ddliu.taotaoweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class MainController {

    /**
     * 底部菜单
     * @return
     */
    @RequestMapping("/main")
    List<String> main(){
        List<String> mains = new ArrayList<>();
        mains.add("首页");
        mains.add("通讯录");
        mains.add("发现");
        mains.add("我");
        return mains;
    }

}
