package com.tiandy.controller;

import com.tiandy.util.MysqlParamPropertiesUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class PropertiesController {

    @Value("${duanyuming.firstname}")
    String firstName;

    @Value("${duanyuming.lastname}")
    String lastName;

    @Value("${user}")
    String duanyuming;

//    @Resource
    @Autowired
    private MysqlParamPropertiesUtil mysqlParamPropertiesUtil;

    @RequestMapping(value = "/getname")
    public String getName(){
        String name = "My name is "+this.firstName+this.lastName;
        return name+" and "+this.duanyuming+"   "+mysqlParamPropertiesUtil;

    }
}
