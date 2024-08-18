package com.collich.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping
public class LoginController {

    @GetMapping("login")
    public String loginPage(@RequestParam String name, ModelMap model){
        model.put("name", name);
        return "login";
    }
}
