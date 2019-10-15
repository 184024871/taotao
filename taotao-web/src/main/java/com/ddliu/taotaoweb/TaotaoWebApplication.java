package com.ddliu.taotaoweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class TaotaoWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaotaoWebApplication.class, args);
    }

    @RequestMapping(value = "/test")
    public String test(){
        return "test success";
    }

}
