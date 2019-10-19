package com.ddliu.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@ComponentScan(basePackages = {"com.ddliu"})
@MapperScan(basePackages = {"com.ddliu.dao"})
public class TaotaoWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaotaoWebApplication.class, args);
    }

    @RequestMapping(value = "/test")
    public String test(){
        return "test success";
    }

}
