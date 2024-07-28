package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class DemoController {
    
    @RequestMapping("/hello")
    public String hello(){
        return "hello World";
    }

    @RequestMapping("/hello-aman")
    public String helloaman(){
        return "hello aman";
    }
    
}