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
        mains.add("淘");
        mains.add("微淘");
        mains.add("消息");
        mains.add("购物车");
        mains.add("我的淘淘");
        return mains;
    }

}
