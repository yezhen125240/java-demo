package com.yz.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @RequestMapping("/")
    public String hello() {
        //调用业务，接收前端参数
        return "success";
    }

    @RequestMapping("/name")
    public String name() {
        //调用业务，接收前端参数
        return "yz";
    }

    @RequestMapping("/age")
    public String age() {
        //调用业务，接收前端参数
        return "29";
    }

}
