package com.collich.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping
public class SayHelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String sayHelloWorld() {
        return "Hello World!";
    }

    @GetMapping("hello-jsp")
    public String sayHelloJsp() {
        return "sayHello";
    }
    
}
