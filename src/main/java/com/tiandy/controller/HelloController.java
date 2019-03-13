package com.tiandy.controller;


import com.tiandy.pojo.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import static javafx.scene.input.KeyCode.S;

@Controller
@RequestMapping(value = "/duan")
public class HelloController {

    @RequestMapping(value = "/hello1")
    public String hello1(){
        return "hello";
    }

    @RequestMapping(value = "/hello2")
    @ResponseBody//请求对象时必备
    public Product hello2(@RequestParam(value = "username",required = false,defaultValue = "段玉铭") String name){
        Product product = new Product();
        product.setId(111);
        product.setName(name);
        return product;
    }

    /**
     * restful
     * 以资源为导向
     *http://localhost:8080/product.do/1
     *http://localhost:8080/product.do/2
     * 利于seo优化（网站排名）
     *
     * id=1
     * http://localhost:8080/product.do?id=1
     * http://localhost:8080/product.do?id=2
     */
    @RequestMapping(value = "/hello3/{prodeuctId}/{productName}")//可变参数通过{}定义
    @ResponseBody
    public Product getProduct(@PathVariable(value = "prodeuctId") Integer id,@PathVariable String productName){
        Product product = new Product();
        product.setId(id);
        product.setName(productName);
        return product;
    }
}
