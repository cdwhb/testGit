package com.demo.controller;

//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

//@RestController
public class TestController {

    //@RequestMapping(value = "/hi")
    public String hi() {
        return "hello world!";
    }

    //@RequestMapping(value = "/hii")
    public String hii() {
        return "hello world 02!";
    }
}
